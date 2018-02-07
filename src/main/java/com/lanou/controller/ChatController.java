package com.lanou.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.entity.Loginlog;
import com.lanou.mapper.ContractproductMapper;
import com.lanou.mapper.LoginlogMapper;
import com.lanou.service.ContractService;

@Controller
public class ChatController {
	
	@Resource
	ContractService contractService;
	@Resource
	ContractproductMapper contractproductMapper;
	@Resource
	LoginlogMapper loginlogMapper;

	/*@RequestMapping("/chat/factoryLog")
	public Object factoryLog() {
		//1:进入页面 2:获取json数据
		return "/cargo/chat/factoryLog";
	}*/
	
	@RequestMapping("/chat/factoryLog")
	public Object factoryLog1() {
		//1:进入页面 2:获取json数据
		return "/cargo/chat/echartstest";
	}
	
	@ResponseBody
	@RequestMapping("/cargo/chat/factoryRecord")
	public Object getData() {
		return contractService.selectFactoryName();
	}
	
	@RequestMapping("/chat/tenproduct")
	public Object totenproduct() {
		//1:进入页面 2:获取json数据
		return "/cargo/chat/productchat";
	}
	
	@ResponseBody
	@RequestMapping("/cargo/chat/gettenproduct")
	public Object gettenproduct() {
		return contractproductMapper.selectProductNumber();
	}
	
	@RequestMapping("/chat/loginlog")
	public Object tologinlog() {
		//1:进入页面 2:获取json数据
		return "/cargo/chat/loginrecord";
	}
	
	@ResponseBody
	@RequestMapping("/cargo/chat/getloginlog")
	public Object getloginlog() {
		return contractproductMapper.selectProductNumber();
	}
	
	@RequestMapping("/chat/toline")
	public Object toline() {
		//1:进入页面 2:获取json数据
		List<String> list = loginlogMapper.selectYear();
		ModelAndView m = new  ModelAndView("/cargo/chat/linefradient");
		m.addObject("yearlist", list);
		
		return m;
	}
	
	@ResponseBody
	@RequestMapping("/cargo/chat/getline")
	public Object getline(String year) {
		return loginlogMapper.selectLogLine(year);
	}
	
	@RequestMapping("/chat/tologyear")
	public Object tologyear() {
		//1:进入页面 2:获取json数据
		List<String> list = loginlogMapper.selectYear();
		ModelAndView m = new  ModelAndView("/cargo/chat/yearlog");
		m.addObject("yearlist", list);
		
		return m;
	}
	
	@ResponseBody
	@RequestMapping("/cargo/chat/getlogyear")
	public Object getlogyear(@RequestParam("year")String year) {
		return loginlogMapper.selectloginyeartime(year);
	}
	
	@RequestMapping("/chat/tostar")
	public Object tostar() {
		//1:进入页面 2:获取json数据
		ModelAndView m = new  ModelAndView("/cargo/chat/star");
		
		return m;
	}
	
	@ResponseBody
	@RequestMapping("/cargo/chat/star")
	public Object getlogyear() {
		return "/cargo/chat/star";
	}
	
	@RequestMapping("/chat/toflower")
	public Object toflower() {
		//1:进入页面 2:获取json数据
		ModelAndView m = new  ModelAndView("/cargo/chat/flower");
		return m;
	}
}
