package com.lanou.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Extcproduct;
import com.lanou.mapper.ExtcproductMapper;
import com.lanou.service.ExtcproductService;
@Service
public class ExtcproductServiceImpl implements ExtcproductService {
@Resource
ExtcproductMapper extcproductMapper;
	public int insertSelective(Extcproduct extcproduct) {
		// TODO Auto-generated method stub
		return extcproductMapper.insertSelective(extcproduct);
	}
	public List<Extcproduct> selectAll(String id) {
		// TODO Auto-generated method stub
		return extcproductMapper.selectAll(id);
	}
	public int updateByPrimaryKeySelective(Extcproduct record) {
		// TODO Auto-generated method stub
		return extcproductMapper.updateByPrimaryKeySelective(record);
	}
	public Extcproduct selectByPrimaryKey(String extCproductId) {
		// TODO Auto-generated method stub
		return extcproductMapper.selectByPrimaryKey(extCproductId);
	}
	public int deleteExtCproductBycProductId(String cProductId) {
		// TODO Auto-generated method stub
		return extcproductMapper.deleteByPrimaryKey(cProductId);
	}

}
