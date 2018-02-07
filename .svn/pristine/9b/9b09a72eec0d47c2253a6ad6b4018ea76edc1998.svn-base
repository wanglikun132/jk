package com.lanou.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lanou.entity.Authuser;
import com.lanou.entity.Contract;
import com.lanou.entity.Contracthis;
import com.lanou.entity.Factory;
import com.lanou.mapper.AuthuserMapper;
import com.lanou.mapper.ContractMapper;
import com.lanou.mapper.FactoryMapper;
import com.lanou.service.HelloService;
import com.lanou.service.USerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring-mybatis.xml")
public class wanglikun {
	@Resource
	ContractMapper contractMapper;
	@Resource 
	FactoryMapper factory;
	@Resource
	AuthuserMapper userMapper;
	@Resource
	USerService userService;
	@Resource
	HelloService helloService;
	@Test
public void login () {
	Map<String,Object> map = new HashMap<String,Object>();
	map.put("username", "admin");
	map.put("password", "123456");
	Authuser login = userMapper.login(map);
	System.out.println(login.getPassword());
}
	
	@Test
	public void selectbyname () {
	List<Authuser> list = userService.selectByName("admin");
	for (Authuser s : list) {
		System.out.println(s.getUsername());
	}
	}
	
	@Test
	public void insertfactory () {
		Factory f = new Factory();
		
		f.setCnote("sdasd");
		f.setFactoryName("sdasdas");
		f.setFullName("adasda");
	System.out.println(factory.insertSelective(f));
	}
	
	@Test
	public void selectAll () {
		List<Contract> list = contractMapper.selectAll();
		for (Contract contract : list) {
			System.out.println(contract.getExtnum());
		}
	}
	
	@Test
	public void selectMonth () {
List<Contracthis> list = helloService.selectContactByMonth(123);
for (Contracthis l : list) {
	System.out.println("************"+l.getContractId());
	
}
	}
}
