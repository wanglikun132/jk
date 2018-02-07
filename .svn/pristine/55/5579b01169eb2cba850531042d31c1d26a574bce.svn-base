package com.lanou.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lanou.bean.ContractAndProductBean;
import com.lanou.bean.PageBean;
import com.lanou.entity.Factory;
import com.lanou.service.ContractService;
import com.lanou.util.ExcelUtil;

@Controller
public class OutProductController {
	@Resource
	private ContractService contractService;

	@RequestMapping("/toOutProduct")
	public ModelAndView selectAll() {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/contract/jOutProduct");
		Map<String, Object> map = new HashMap<String, Object>();

		List<ContractAndProductBean> list = contractService.showJOutProduct(map);
		m.addObject("dataList", list);
		return m;
	}

	/**
	 * 导出到excelbiaoge
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping("/outProductPrint")
	public void exportExcel(HttpServletRequest request, HttpServletResponse response,@RequestParam(value = "inputDate", required = false) String shipTime)
			throws Exception {
		System.out.println("打印");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("shipTime", shipTime);
		List<ContractAndProductBean> list = contractService.showJOutProduct(map);
		Map<String, String> headMap = new HashMap<String, String>();
		headMap.put("contractproductid", "合同货物编号");
		headMap.put("customname", "客户名称");
		headMap.put("contractno", "合同编号");
		headMap.put("deliveryperiod", "交货期限");
		headMap.put("shiptime", "船期");
		headMap.put("factoryname", "工厂名字");
		headMap.put("productno", "货号");
		headMap.put("cnumber", "数量");
		System.out.println(JSON.toJSONString(list));
		JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(list));
		ExcelUtil.downloadExcelFile("工厂信息", headMap, jsonArray, response);
	}

	@RequestMapping("/toOutProductByDate")
	public ModelAndView selectAllByDate(@RequestParam(value = "inputDate", required = false) String shipTime) {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/contract/jOutProduct");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("shipTime", shipTime);

		List<ContractAndProductBean> list = contractService.showJOutProduct(map);
		m.addObject("dataList", list);
		m.addObject("inputDate", shipTime);
		return m;
	}

}
