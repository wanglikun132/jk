package com.lanou.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.lanou.bean.PageBean;
import com.lanou.entity.Factory;
import com.lanou.service.FactoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring-mybatis.xml")
public class LifangTest {
	@Resource
	private FactoryService  factoryService;
	@Test
	public void testPageFactory() {
		
		PageBean<Factory> f = factoryService.pageFactory(0, "",2,10);
		String json = JSON.toJSONString(f);
		System.out.println(json);
	}
	
}
