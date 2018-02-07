package com.lanou.service.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.bean.ContractDetail;
import com.lanou.bean.ContractHisDetail;
import com.lanou.bean.ContractProductBean;
import com.lanou.bean.ContractProductHisBean;
import com.lanou.entity.Contract;
import com.lanou.entity.Contracthis;
import com.lanou.entity.Contractproduct;
import com.lanou.entity.Contractproducthis;
import com.lanou.entity.Extcproduct;
import com.lanou.entity.Extcproducthis;
import com.lanou.mapper.ContracthisMapper;
import com.lanou.mapper.ContractproducthisMapper;
import com.lanou.mapper.ExtcproducthisMapper;
import com.lanou.service.HisService;
@Service
public class HisServiceImpl implements HisService {
	@Resource
	private ContracthisMapper contracthisMapper;
	@Resource
	private ContractproducthisMapper contractproducthisMapper;
	@Resource
	private ExtcproducthisMapper extcproducthisMapper;

	public int insertContractSelective(Contract contract) {
		// TODO Auto-generated method stub
		return contracthisMapper.insertSelective(contract);
	}

	public int insertContractproductSelective(Contractproduct contractproduct) {
		// TODO Auto-generated method stub
		return contractproducthisMapper.insertSelective(contractproduct);
	}

	public int insertExtcproductSelective(Extcproduct extcproduct) {
		// TODO Auto-generated method stub
		return extcproducthisMapper.insertSelective(extcproduct);
	}

	public List<Contracthis> selectAllContractHis() {
		// TODO Auto-generated method stub
		return contracthisMapper.selectAllContractHis();
	}

	@Override
	public ContractHisDetail showDetail(String id) {
		ContractHisDetail d = new ContractHisDetail();
		//根据合同id 查询合同的基本信息
		Contracthis c = contracthisMapper.selectByPrimaryKey(id);
		d.setC(c);
		ArrayList<ContractProductHisBean> cpb = new ArrayList<>();
		List<Contractproducthis> cp = contractproducthisMapper.selectByContractHisId(id);
		for (Contractproducthis cpt : cp) {
			ContractProductHisBean bean = new ContractProductHisBean();
			bean.setCp(cpt);
			List<Extcproducthis> list = extcproducthisMapper.selectByContractProductHisId(cpt.getContractProductId());
			bean.setList(list);
			cpb.add(bean);
		}
		d.setCpb(cpb);	
		return d;
	}

}
