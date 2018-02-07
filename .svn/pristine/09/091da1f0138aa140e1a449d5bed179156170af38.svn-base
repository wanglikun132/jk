package com.lanou.service.Impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.lanou.entity.Authuser;
import com.lanou.entity.Eackinglist;
import com.lanou.mapper.EackinglistMapper;
import com.lanou.service.PackingService;

@Service
public class PackingServiceImpl implements PackingService {

	@Resource
	private EackinglistMapper eackinglistMapper;

	public List<Eackinglist> selectAllPacking() {
		List<Eackinglist> list = eackinglistMapper.selectAllPacking();
		return list;
	}

	public Eackinglist selectByPrimaryKey(String packingListId) {
		Eackinglist row = eackinglistMapper.selectByPrimaryKey(packingListId);
		return row;
	}

	public int deleteByPrimaryKey(String packingListId) {
		int row = eackinglistMapper.deleteByPrimaryKey(packingListId);
		return row;
	}

	public int updateByPrimaryKeySelective(Eackinglist record) {
		int row = eackinglistMapper.updateByPrimaryKeySelective(record);
		return row;
	}

	public int insertSelective(Eackinglist record) {
		// TODO Auto-generated method stub
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Authuser user = (Authuser) session.getAttribute("user");
		record.setCreateTime(new Date());
		record.setState((short)0);
		record.setCreateBy(user.getUsername());
		return eackinglistMapper.insertSelective(record);
	}

}
