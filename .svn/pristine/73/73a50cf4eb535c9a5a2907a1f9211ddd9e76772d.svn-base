package com.lanou.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.entity.Export;
import com.lanou.entity.Exportproduct;
import com.lanou.entity.Exteproduct;
import com.lanou.service.ExportService;

@Controller
public class ExpotController {
	@Resource
	private ExportService exportService;
	@RequestMapping("/toExpot")
	public ModelAndView toExtcproduct(@RequestParam(value = "contractProductId", required = false) String id) {
		System.out.println("进入报运单");
		ModelAndView m = new ModelAndView("cargo/export/jExportList");
		List<Export> exportList = exportService.selectAllExport();
		for (Export export : exportList) {
			List<Exportproduct> exportproductList = exportService.selectExportproductByExportId(export.getExportId());
			int pnum = 0; 
			int cnumber=0;
			for (Exportproduct exportproduct : exportproductList) {
				pnum+=exportproduct.getCnumber();
				export.setPnum(pnum);
				List<Exteproduct> ExteproductList = exportService.selectByExportProductId(exportproduct.getExportProductId());
				for (Exteproduct exteproduct : ExteproductList) {
					cnumber+=exteproduct.getCnumber();
					export.setExtnum(cnumber);
				}
			}
		}
		m.addObject("dataList", exportList);
		return m;
	}
	/**
	 * 装箱
	 * @param id
	 * @return
	 */
	@RequestMapping("cargo/packinglist/tocreate")
	public ModelAndView zhaungxiang(String[]id) {
		System.out.println("装箱");
		for (String string : id) {
			Export export = exportService.selectByPrimaryKey(string);
			export.setState((short)2);
			exportService.updateByPrimaryKeySelective(export);
		}
		
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListCreate");
		List<Export> list = exportService.selectByExportIdss(id);
		m.addObject("extportlist", list);
		return m;
	}
	/**
	 * 进入修改报运单
	 * @param id
	 * @return
	 */
	@RequestMapping("toupdate")
	public ModelAndView toupdate(String id) {
		System.out.println("进入修改报运单");
		ModelAndView m = new ModelAndView("cargo/export/jExportUpdate");
		Export export = exportService.selectByPrimaryKey(id);
		m.addObject("obj", export);
		return m;
	}
	
	/**
	 * 修改报运单
	 * @param id
	 * @return
	 */
	@RequestMapping("updateexport")
	public ModelAndView update(Export record) {
		System.out.println("修改报运单");
		ModelAndView m = new ModelAndView("redirect:toExpot");
		exportService.updateByPrimaryKeySelective(record);
		return m;
	}
	
}
