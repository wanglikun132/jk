package com.lanou.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.bean.ContractDetail;
import com.lanou.bean.ContractHisDetail;
import com.lanou.entity.Contracthis;
import com.lanou.service.HisService;

@Controller
@RequestMapping("/cargo/contracthis/")
public class HisController {
	@Resource
	private HisService hisService;
	@RequestMapping("contracthis")
	public ModelAndView showlist() {
		ModelAndView m = new ModelAndView("cargo/contracthis/jContractList");
		List<Contracthis> contractHisList = hisService.selectAllContractHis();
		m.addObject("dataList", contractHisList);
		return m;
	}
	
	/**
	 * 查询详情（查看）
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("contractView")
	public Object selectById(String id) {
		ModelAndView m = new ModelAndView();
		if (id==null||"".equals(id)) {
			m.setViewName("redirect:contracthis");
			return m;
		}else {
			m.setViewName("cargo/contracthis/jContractView");
		ContractHisDetail contractDetail = hisService.showDetail(id);
		m.addObject("obj", contractDetail);
		return m;
		}
	}
}
