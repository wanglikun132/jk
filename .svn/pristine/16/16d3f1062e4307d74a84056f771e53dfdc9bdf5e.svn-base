package com.lanou.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.entity.Eackinglist;
import com.lanou.entity.Export;
import com.lanou.entity.Exportproduct;
import com.lanou.entity.Exteproduct;
import com.lanou.service.EackinglistService;
import com.lanou.service.ExportService;
import com.lanou.service.PackingService;

@Controller
public class MyPakingController {
	@Resource
	private EackinglistService eackinglistService;
	@Resource
	private PackingService packingService;
	@Resource
	private ExportService exportService;

	/**
	 * 跳转到主列表
	 * 
	 * @return
	 */
	@RequestMapping("/toMyPackingList")
	public Object selectAll() {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListList");
		List<Eackinglist> list = packingService.selectAllPacking();
		m.addObject("dataList", list);
		return m;
	}

	/**
	 * 查看详细内容
	 * 
	 * @return
	 */
	@RequestMapping("/showlist")
	public Object selectByPakingId(String id) {
		System.out.println(id);
		System.out.println("进入查看详情");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListView");
		Eackinglist eackinglist = packingService.selectByPrimaryKey(id);
		String exportIds = eackinglist.getExportIds();
		System.out.println(exportIds);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("exportIds", exportIds);
		List<Export> exportList = exportService.selectExportByExportIds(map);
		m.addObject("obj", eackinglist);
		m.addObject("exportList", exportList);
		return m;
	}

	/**
	 * 根据ids删除出口报运单
	 * 
	 * @return
	 */
	@RequestMapping("/deletePakings")
	public Object deletePackingById(String[] id) {
		int ii=0;
		/*for (String i : id) {
			Eackinglist eackinglist = packingService.selectByPrimaryKey(i);
			String exportNos = eackinglist.getExportNos();
			String [] no =  exportNos.split(",");
			if (no!=null) {
				for (String s : no) {
					s.trim();
					int j = exportService.deletecustomerContracts(s);
					
					 ii = eackinglistService.deleatePackings(id);
				}
			}
			
		}*/
		
		for (String i : id) {
			Eackinglist eackinglist = packingService.selectByPrimaryKey(i);
			int j = exportService.deleteByPrimaryKeySe(eackinglist.getExportIds());
			
			}
		int i = eackinglistService.deleatePackings(id);
		if (i>0) {
			return "redirect:/toMyPackingList";
		}
		return null;
			
		
		
	
	}

	
	
	/**
	 * 装箱,根据id修改状态
	 * 
	 * @return
	 */
	@RequestMapping("/boxup")
	public Object boxup(String[] id) {
		System.out.println(id);
		Eackinglist record = new Eackinglist();
		int j = 0;
		for (String i : id) {
			Eackinglist eackinglist = eackinglistService.selectByPrimaryKey(i);
			Short state = eackinglist.getState();
			if (state==0) {
				record.setPackingListId(i);
				record.setState((short) 1);
				eackinglistService.updateByPrimaryKeySelective(record);
				j++;
			}
		}
			return "redirect:/toMyPackingList";
	}

	/**
	 * 跳转到修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/toupdatepacking")
	public Object updatepacking(String id) {
		System.out.println("进入修改页面");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListUpdate");
		Eackinglist packinglist = eackinglistService.selectByPrimaryKey(id);
		String exportIds = packinglist.getExportIds();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("exportIds", exportIds);
		List<Export> exportList = exportService.selectExportByExportIds(map);
		m.addObject("obj", packinglist);
		m.addObject("exportList", exportList);
		return m;
	}
	
	/**
	 * 修改装箱单
	 * 
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/myupdatepacking")
	public Object UpdatePacking(Eackinglist obj ,HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("跳转");
		String id = request.getParameter("packingListId");
		obj.setPackingListId(id);
		int row = packingService.updateByPrimaryKeySelective(obj);
		if(row>0) {
			return "redirect:/toMyPackingList";
  		}
		return null;
		
	}
	
	/**
	 * 取消,根据id修改状态
	 * 
	 * @return
	 */
	@RequestMapping("/cancel")
	public Object cancelmypacking(String[] id) {
		System.out.println(id);
		Eackinglist record = new Eackinglist();
		int j = 0;
		for (String i : id) {
			Eackinglist eackinglist = eackinglistService.selectByPrimaryKey(i);
			Short state = eackinglist.getState();
			if (state==1) {
				record.setPackingListId(i);
				record.setState((short) 0);
				eackinglistService.updateByPrimaryKeySelective(record);
				j++;
			}
		}
		if (j>0) {
			return "redirect:/toMyPackingList";
		}
		return null;
	}
	
	/**
	 * 修改装箱单
	 * 
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/cargo/packinglist/insert")
	public Object insertPacking(Eackinglist obj){
		int row = packingService.insertSelective(obj);
		if(row>0) {
			return "redirect:/toMyPackingList";
  		}
		return null;
		
	}
	
}
