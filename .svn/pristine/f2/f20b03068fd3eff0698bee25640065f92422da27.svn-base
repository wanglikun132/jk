package com.lanou.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Authuser;
import com.lanou.mapper.AuthuserMapper;
import com.lanou.service.USerService;
@Service
public class USerServiceImpl implements USerService {
@Resource
AuthuserMapper u;
	public Authuser login(Map<String,Object> map) {
		return u.login(map) ;
	}
	public List<Authuser> selectByName(String username) {
		List<Authuser> list = u.selectByName(username);
		return list;
	}

}
