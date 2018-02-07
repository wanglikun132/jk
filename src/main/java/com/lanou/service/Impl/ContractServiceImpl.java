package com.lanou.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.bean.ContractAndProductBean;
import com.lanou.bean.ContractDetail;
import com.lanou.bean.ContractProductBean;
import com.lanou.bean.FactoryRecordBean;
import com.lanou.entity.Contract;
import com.lanou.entity.Contractproduct;
import com.lanou.entity.Extcproduct;
import com.lanou.mapper.ContractMapper;
import com.lanou.mapper.ContractproductMapper;
import com.lanou.mapper.ExtcproductMapper;
import com.lanou.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {

	@Resource
	private ContractMapper contractMapper;
	@Resource
	private ContractproductMapper contractproductMapper;
	@Resource
	private ExtcproductMapper extcproductMapper;
	
	public List<ContractAndProductBean> showJOutProduct(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return contractMapper.showJOutProduct(map);
	}

	

	public int deleteContractById(String contractId) {
		int row = contractMapper.deleteByPrimaryKey(contractId);
		return row;
	}

	public List<Contract> selectAll() {

		return contractMapper.selectAll();
	}

	public int insertSelective(Contract record) {
		record.setState((short)0);
		record.setCnumber((short)0);
		record.setExtnum((short)0);
		record.setCreateTime(new Date());
		int row = contractMapper.insertSelective(record);
		return row;
	}

	public Contract selectByPrimaryKey(String contractId) {
		// TODO Auto-generated method stub
		Contract c = contractMapper.selectByPrimaryKey(contractId);
		return c;
	}

	public List<Contractproduct> selectByContractId(String id) {
		List<Contractproduct> conproduct = contractproductMapper.selectByContractId(id);
		return conproduct;
	}

	public Extcproduct selectExtCproductByFactoryId(String id) {
		Extcproduct list = extcproductMapper.selectExtCproductByFactoryId(id);
		return list;
	}


	public int updateByPrimaryKeySelective(Contract record) {
		// TODO Auto-generated method stub
		return contractMapper.updateByPrimaryKeySelective(record);
	}



	public int deleteByContractId(String contractId) {
		// TODO Auto-generated method stub
		return contractproductMapper.deleteByContractId(contractId);
	}



	public int deleteByContractProductId(String contractProductId) {
		// TODO Auto-generated method stub
		return extcproductMapper.deleteByContractProductId(contractProductId);
	}



	public List<Extcproduct> selectByContractProductId(String contractProductId) {
		// TODO Auto-generated method stub
		return extcproductMapper.selectByContractProductId(contractProductId);
	}



	@Override
	public List<FactoryRecordBean> selectFactoryName() {
		// TODO Auto-generated method stub
		return contractMapper.selectFactoryName();
	}



	@Override
	public ContractDetail showDetail(String id) {
		ContractDetail d = new ContractDetail();
		//根据合同id 查询合同的基本信息
		Contract c = contractMapper.selectByPrimaryKey(id);
		d.setC(c);
		ArrayList<ContractProductBean> cpb = new ArrayList<>();
		List<Contractproduct> cp = contractproductMapper.selectByContractId(id);
		for (Contractproduct cpt : cp) {
			ContractProductBean bean = new ContractProductBean();
			bean.setCp(cpt);
			List<Extcproduct> list = extcproductMapper.selectByContractProductId(cpt.getContractProductId());
			bean.setList(list);
			cpb.add(bean);
		}
		d.setCpb(cpb);	
		return d;

	}



	
}
