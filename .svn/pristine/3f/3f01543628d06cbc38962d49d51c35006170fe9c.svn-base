package com.lanou.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lanou.entity.Authuser;
import com.lanou.entity.Loginlog;
import com.lanou.mapper.LoginlogMapper;
import com.lanou.service.USerService;

@Controller
public class UserController {
	@Resource
	USerService userService;
	@Resource
	LoginlogMapper loginlogMapper;

	@RequestMapping("/login")
	public Object login(HttpServletRequest re, HttpServletResponse response,
			@RequestParam(value = "userName", required = false) String username,
			@RequestParam("password") String password) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		map.put("password", password);
		System.out.println("***************************************登录");
		Authuser authuser = userService.login(map);
		List<Authuser> list = userService.selectByName(username);
		
		
		if (authuser != null) {
			
			
			// 创建两个Cookie对象
			Cookie nameCookie = new Cookie("username", username);
			// 设置Cookie的有效期为3天
			nameCookie.setMaxAge(60 * 60 * 24 * 3);
			Cookie pwdCookie = new Cookie("password", password);
			pwdCookie.setMaxAge(60 * 60 * 24 * 3);
			response.addCookie(nameCookie);
			response.addCookie(pwdCookie);
			re.getSession().setAttribute("user", authuser);
			
			Loginlog l = new Loginlog();
			l.setLoginLogId(UUID.randomUUID().toString());
			l.setIpAddress(re.getRemoteAddr());
			l.setLoginName(username);
			l.setLoginTime(new Date());
			loginlogMapper.insert(l);
			return "/home/fmain";
		} else {
			if (list == null || list.size() == 0) {
				re.setAttribute("loginFailed", 2);
			} else {
				re.setAttribute("loginFailed", 1);
			}
		}
		return "index";
	}

	/**
	 * 退出
	 * 
	 * @return
	 */
	@RequestMapping("/home")
	public String loginout(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		return "index";
	}

	public boolean isExist(HttpServletRequest request) {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {// 对cookies中的数据进行遍历，找到用户名、密码的数据
			if ("username".equals(cookies[i].getName())) {
				username = cookies[i].getValue();
			} else if ("password".equals(cookies[i].getName())) {
				password = cookies[i].getValue();
			}
		}
		return false;
	}
}
