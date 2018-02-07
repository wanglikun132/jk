package com.lanou.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lanou.entity.Authuser;
import com.lanou.entity.Eackinglist;
import com.lanou.entity.Invoice;
import com.lanou.mapper.AuthuserMapper;
import com.lanou.mapper.InvoiceMapper;
import com.lanou.service.EackinglistService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-mybatis.xml")
public class WangzixuTest {
	@Resource
	AuthuserMapper authuserMapper;
	@Resource
	InvoiceMapper invoiceMapper;
	@Resource
	EackinglistService eacking;

	@Test
	public void add() {
		Invoice record = new Invoice();
		record.setInvoiceId("1");
		record.setScNo("123");
		record.setBlNo("123");
		
		int a = invoiceMapper.insertSelective(record);
		if (a>0) {
			System.out.println("666");
		}
	}
	@Test
	public void checkList() {
		Eackinglist eack = eacking.selectByPrimaryKey("ceeeaa09-75ab-4c56-b333-26191a3db1ee");
		System.out.println(eack.getSeller());
	}
	@Test
	public void insert() {
		Eackinglist E = new Eackinglist();
		E.setSeller("111");
		E.setExportIds("ceeeaa09-75ab-4c56-b333-26191a3db1ee");
		int row = eacking.updateByPrimaryKeySelective(E);
		if(row>0) {
			System.out.println(E.getSeller());
			
		}
	}
}
