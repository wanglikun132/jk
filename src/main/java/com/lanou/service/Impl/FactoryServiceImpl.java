package com.lanou.service.Impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.lanou.bean.PageBean;
import com.lanou.entity.Factory;
import com.lanou.mapper.FactoryMapper;
import com.lanou.service.FactoryService;
import com.lanou.util.Constants;

@Service
public class FactoryServiceImpl implements FactoryService {
	@Resource
	private FactoryMapper factoryMapper;

	public Factory selectFactoryById(String factoryId) {
		Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
		return factory;
	}

	public int updateByPrimaryKeySelective(Factory record) {
		int row = factoryMapper.updateByPrimaryKeySelective(record);
		return row;
	}

	public int insertSelective(Factory f) {
		f.setCreateTime(new Date());
		f.setState("1");
		int row = factoryMapper.insertSelective(f);
		return row;
	}

	public int deleteByPrimaryKey(String factoryId) {
		int row = factoryMapper.deleteByPrimaryKey(factoryId);
		return row;
	}

	public PageBean<Factory> pageFactory(int type, String condition,int pageNo,int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		switch (type) {
		
		case 1:
			map.put("fullName", condition);
			break;
		case 2:
			map.put("factoryName", condition);
			break;
		case 3:
			map.put("contacts", condition);
			break;
		case 4:
			map.put("phone", condition);
			break;
		case 5:
			map.put("mobile", condition);
			break;
		case 6:
			map.put("fax", condition);
			break;
		case 7:
			map.put("cnote", condition);
			break;
		
		}
		map.put("start", (pageNo-1)*pageSize+1);
		map.put("end", pageNo*pageSize);
		PageBean<Factory> page = new PageBean<Factory>();
		page.setList(factoryMapper.selectPageByFactory(map));
		page.setTotalCount(factoryMapper.selectPageCount(map));
		page.setPagesize(pageSize);
		page.setPageNo(pageNo);
		
		return page;
	}

	public List<Factory> selectAll() {
		
		return factoryMapper.selectAll();
	}
}
