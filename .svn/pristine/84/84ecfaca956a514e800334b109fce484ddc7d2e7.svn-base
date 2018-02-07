package com.lanou.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Contractproduct;
import com.lanou.entity.Extcproduct;
import com.lanou.mapper.ContractproductMapper;
import com.lanou.mapper.ExtcproductMapper;
import com.lanou.service.ContractProductService;

@Service
public class ContractProductServiceImpl implements ContractProductService {
	@Resource
	ContractproductMapper contractproductMapper;
	@Resource
	ExtcproductMapper extcproductMapper;

	public int insertProduct(Contractproduct record) {
		// TODO Auto-generated method stub
		return contractproductMapper.insertSelective(record);
	}

	
	public Contractproduct selectByPrimaryKey(String contractProductId) {
		// TODO Auto-generated method stub
		return contractproductMapper.selectByPrimaryKey(contractProductId);
	}
	public int updateByPrimaryKeySelective(Contractproduct record) {
		// TODO Auto-generated method stub
		return contractproductMapper.updateByPrimaryKeySelective(record);
	}

	public int deleteByPrimaryKey(String contractProductId) {
		int row = contractproductMapper.deleteByPrimaryKey(contractProductId);
		return row;
	}

	public int deleteExtCproductBycProductId(String cProductId) {
		int row = extcproductMapper.deleteExtCproductBycProductId(cProductId);
		return row;
	}


}
