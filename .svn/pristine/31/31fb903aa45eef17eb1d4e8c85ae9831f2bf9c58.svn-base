package com.lanou.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Finance;
import com.lanou.mapper.FinanceMapper;
import com.lanou.service.FinanceService;
@Service
public class FinanceServiceImpl implements FinanceService {

	
	@Resource
	FinanceMapper financeMapper;
	
	public int deleteByPrimaryKey(String financeId) {
		// TODO Auto-generated method stub
		return financeMapper.deleteByPrimaryKey(financeId);
	}

	public Finance selectByPrimaryKey(String financeId) {
		// TODO Auto-generated method stub
		return financeMapper.selectByPrimaryKey(financeId);
	}

	public int insertSelective(Finance record) {
		// TODO Auto-generated method stub
		return financeMapper.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(Finance record) {
		// TODO Auto-generated method stub
		return financeMapper.updateByPrimaryKeySelective(record);
	}

}
