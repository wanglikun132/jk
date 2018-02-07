package com.lanou.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Eackinglist;
import com.lanou.mapper.EackinglistMapper;
import com.lanou.service.EackinglistService;
@Service
public class EackinglistServiceImpl implements EackinglistService {

	
	@Resource
	EackinglistMapper eackinglistMapper;
	
	public int deleteByPrimaryKey(String packingListId) {
		// TODO Auto-generated method stub
		return eackinglistMapper.deleteByPrimaryKey(packingListId);
	}

	public Eackinglist selectByPrimaryKey(String packingListId) {
		// TODO Auto-generated method stub
		return eackinglistMapper.selectByPrimaryKey(packingListId);
	}

	public int updateByPrimaryKeySelective(Eackinglist record) {
		// TODO Auto-generated method stub
		return eackinglistMapper.updateByPrimaryKeySelective(record);
	}

	public int insertSelective(Eackinglist record) {
		// TODO Auto-generated method stub
		return eackinglistMapper.insertSelective(record);
	}

	public int deleatePackings(String[] id) {
		// TODO Auto-generated method stub
		return eackinglistMapper.deletePackings(id);
	}

}
