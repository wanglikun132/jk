package com.lanou.service;

import java.util.List;
import java.util.Map;

import com.lanou.entity.Authuser;

public interface USerService {
	/**
	 * 登录
	 * @param map
	 * @return
	 */
	public Authuser login(Map<String,Object> map);
/**
 * 根据姓名查询是否存在
 * @param usernname
 * @return
 */
	public List<Authuser> selectByName(String usernname);
}
