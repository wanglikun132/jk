package com.lanou.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Shippingorder;
import com.lanou.mapper.ShippingorderMapper;
import com.lanou.service.ShippingorderService;
@Service
public class ShippingorderServiceImpl implements ShippingorderService {
	
	
	@Resource
	ShippingorderMapper shippingorderMapper;

	public int deleteByPrimaryKey(String shippingOrderId) {
		// TODO Auto-generated method stub
		return shippingorderMapper.deleteByPrimaryKey(shippingOrderId);
	}

	public Shippingorder selectByPrimaryKey(String shippingOrderId) {
		// TODO Auto-generated method stub
		return shippingorderMapper.selectByPrimaryKey(shippingOrderId);
	}

	public int insertSelective(Shippingorder record) {
		// TODO Auto-generated method stub
		return shippingorderMapper.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(Shippingorder record) {
		// TODO Auto-generated method stub
		return shippingorderMapper.updateByPrimaryKeySelective(record);
	}

}
