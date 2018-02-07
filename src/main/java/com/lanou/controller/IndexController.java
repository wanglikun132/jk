package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public String loginIndex() {
		return "index";
	}


//	title.action   ---->>/home/title.jsp
//	left.action   ---->>/home/left.jsp
//	main.action>>>>>>>/home/olmsgList.jsp

//
	@RequestMapping(value="/fmain.action")
	public String fmain(){
		return "/home/fmain";
	}
	
	@RequestMapping(value="/title")
	public String title(){
		return "/home/title";
	}
	
	@RequestMapping(value="/left")
	public String left(){
		return "/home/left";
	}
	
	@RequestMapping(value="/main")
	public String main(){
		return "/home/olmsgList";			//首页转向留言板
	}
	
	//系统管理模块
	
	@RequestMapping("/sysadminMain.action")
	public String sysadminMain(){
		return "/sysadmin/main";
	}
	
	@RequestMapping("/sysadminLeft.action")
	public String sysadminLeft(){
		return "/sysadmin/left";
	}
	
	//基础信息模块
	
	@RequestMapping("/baseinfoMain.action")
	public String baseinfoMain(){
		return "/baseinfo/main";
	}
	
	@RequestMapping("/baseinfoLeft.action")
	public String baseinfoLeft(){
		return "/baseinfo/left";
	}
	
	//货运管理模块
	
	@RequestMapping("/cargoMain.action")
	public String cargoMain(){
		return "/cargo/main";
	}
	
	@RequestMapping("/cargoLeft.action")
	public String cargoLeft(){
		return "/cargo/left";
	}
	@RequestMapping("/basicinfo/factory/create")
	public String create() {
		return "/baseinfo/factory/jFactoryCreate";
	}
}
	


