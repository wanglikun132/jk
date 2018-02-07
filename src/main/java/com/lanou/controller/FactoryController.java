package com.lanou.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lanou.bean.PageBean;
import com.lanou.entity.Authuser;
import com.lanou.entity.Factory;
import com.lanou.service.FactoryService;
import com.lanou.util.Constants;
import com.lanou.util.ExcelUtil;
import com.mysql.jdbc.StringUtils;

@Controller
public class FactoryController {

	@Resource
	private FactoryService factoryService;

	@RequestMapping("/basicinfo/factory/list")
	public ModelAndView FactoryList(HttpServletRequest re) {
		ModelAndView m = new ModelAndView("baseinfo/factory/jFactoryList");
		int type = -1;
		int pageNo = 1;
		String a = re.getParameter("f_type");
		if (a != null) {
			type = Integer.parseInt(a);
		}
		String condition = re.getParameter("f_conditionStr");

		String p = re.getParameter("pageNo");
		if (p != null) {
			pageNo = Integer.parseInt(p);
		}

		String pageSize = re.getParameter("pageSize");
		int size = Constants.PAGESIZE;
		if (!StringUtils.isNullOrEmpty(pageSize)) {
			size = Integer.parseInt(pageSize);
		}
		PageBean<Factory> page = factoryService.pageFactory(type, condition, pageNo, size);
		m.addObject("dataList", page.getList());
		m.addObject("pageNo", page.getPageNo());
		m.addObject("pageSize", page.getPagesize());
		m.addObject("totalCount", page.getTotalCount());
		m.addObject("totalPage", page.getTotalPage());
		return m;

	}

	// 查看详情
	@ResponseBody
	@RequestMapping("/basicinfo/factory/detail")
	public ModelAndView showById(HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println("//////*****进入查看***********////////");
		ModelAndView m = new ModelAndView("baseinfo/factory/jFactoryDetail");
		System.out.println("ID" + id + "*******************************");
		Factory factory = factoryService.selectFactoryById(id);
		m.addObject("obj", factory);
		return m;

	}

	// 根据id删除
	@RequestMapping("/basicinfo/factory/delete")
	public Object deleteById(@Param("id") String id) {
		System.out.println("//////*****进入删除***********////////");

		int ids = factoryService.deleteByPrimaryKey(id);
		if (ids > 0) {
			System.out.println("删除成功");
		}

		return "redirect:/basicinfo/factory/list.action";

	}

	/***********************************
	 * 汪立坤
	 ************************************************/
	/**
	 * 添加方法
	 * 
	 * @param f
	 * @return
	 */
	@RequestMapping("/basicinfo/factory/toinsert")

	public Object toinsertFactory() {
		return "baseinfo/factory/jFactoryCreate";
	}
	
	/**
	 * 添加方法
	 * 
	 * @param f
	 * @return
	 */
	@RequestMapping("/basicinfo/factory/insert")

	public Object insertFactory(Factory f,HttpServletRequest request) {
		if (f!=null) {
			Authuser user = (Authuser) request.getSession().getAttribute("user");
			f.setCreateBy(user.getUsername());
			int i = factoryService.insertSelective(f);
			if (i > 0) {
				return "redirect:/basicinfo/factory/list.action";
			}
			return "baseinfo/factory/jFactoryCreate";
		}
		return "redirect:/basicinfo/factory/toinsert";
	}

	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */

	@RequestMapping("/factory/exportExcel")
	public void exportExcel(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {

		PageBean<Factory> page = factoryService.pageFactory(-1, null, 1, 10);
		List<Factory> list = page.getList();

		Map<String, String> headMap = new HashMap<String, String>();
		headMap.put("factoryId", "id");
		headMap.put("fullName", "全称");
		headMap.put("factoryName", "简称");
		headMap.put("contacts", "联系人");
		headMap.put("inspector", "验货员");
		headMap.put("phone", "联系电话");
		System.out.println(JSON.toJSONString(list));
		JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(list));
		ExcelUtil.downloadExcelFile("工厂信息", headMap, jsonArray, response);
	}

	/**
	 * 跳转到修改界面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/basicinfo/factory/toupdate")
	public Object toupdate(HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println("//////*****进入修改***********////////");
		ModelAndView m = new ModelAndView("baseinfo/factory/jFactoryUpdate");
		System.out.println("ID" + id + "*******************************");
		Factory factory = factoryService.selectFactoryById(id);
		m.addObject("obj", factory);
		return m;
	}

	/**
	 * 修改
	 * 
	 * @param id
	 * @param f
	 * @return
	 */
	@RequestMapping("/basicinfo/factory/update")
	public Object updateFactory(@RequestParam(value="id",required=false) String id, Factory f) {
		int i = factoryService.updateByPrimaryKeySelective(f);
		if (i > 0) {
			return "redirect:/basicinfo/factory/list.action";
		}
		return "/basicinfo/factory/toupdate";
	}

	/***********************************************************************************/
	/**
	 * 导出数据到excel表格
	 */
	@RequestMapping("/basicinfo/factory/exportExcel")
	public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int type = -1;
		int pageNo = 1;
		String f_type = request.getParameter("f_type");
		if (!StringUtils.isNullOrEmpty(f_type)) {
			type = Integer.parseInt(f_type.trim());
		}
		String condition = request.getParameter("f_conditionStr");
		String number = request.getParameter("pageNo");
		String pageSize = request.getParameter("pageSize");
		if (!StringUtils.isNullOrEmpty(number)) {
			pageNo = Integer.parseInt(number);
		}
		int size = Constants.PAGESIZE;
		if (!StringUtils.isNullOrEmpty(pageSize)) {
			size = Integer.parseInt(pageSize);
		}
		PageBean<Factory> page = factoryService.pageFactory(type, condition, pageNo, size);
		List<Factory> list = page.getList();

		Map<String, String> headMap = new HashMap<String, String>();
		headMap.put("factoryId", "id");
		headMap.put("fullName", "全称");
		headMap.put("factoryName", "简称");
		headMap.put("contacts", "联系人");
		headMap.put("inspector", "验货员");
		headMap.put("phone", "联系电话");
		System.out.println(JSON.toJSONString(list));
		JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(list));
		ExcelUtil.downloadExcelFile("工厂信息", headMap, jsonArray, response);

	}
}
