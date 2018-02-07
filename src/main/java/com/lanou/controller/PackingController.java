package com.lanou.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.entity.Eackinglist;
import com.lanou.service.PackingService;

@Controller
public class PackingController {
	@Resource
	private PackingService packingService;

	@RequestMapping("/toPackingList")
	public Object selectPackingList() {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListList");
		List<Eackinglist> list = packingService.selectAllPacking();
		m.addObject("dataList", list);
		return m;
	}

	/**
	 * 跳转添加报运单页面
	 * 
	 * @return
	 */
	@RequestMapping("/toAddPacking")
	public Object toAddPacking() {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListCreate");
		return m;
	}

	/**
	 * 根据id查找出口报运单
	 */
	@RequestMapping("/selectPackingById")
	public Object selectPackingById(String id) {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListView");
		Eackinglist packing = packingService.selectByPrimaryKey(id);
		m.addObject("obj", packing);
		return m;
	}

	/**
	 * 根据id删除出口报运单
	 * 
	 * @return
	 */
	@RequestMapping("/deletePackingById")
	public Object deletePackingById(String id) {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListList");
		packingService.deleteByPrimaryKey(id);
		return m;
	}

	/**
	 * 跳转修改出口报运单页面
	 * 
	 * @return
	 */
	@RequestMapping("/toUpdatePackingById")
	public Object toUpdatePackingById(HttpServletRequest request) {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListUpdate");
		String id = request.getParameter("id");
		Eackinglist packing = packingService.selectByPrimaryKey(id);
		m.addObject("obj", packing);
		return m;
	}
	
	
	/**
	 * 修改装箱单
	 * 
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/updatePacking")
	public void UpdatePacking(Eackinglist obj ,HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("跳转");
		String id = request.getParameter("packingListId");
		obj.setPackingListId(id);
		int row = packingService.updateByPrimaryKeySelective(obj);
		if(row>0) {
			request.getRequestDispatcher("/toPackingList").forward(request,response);
		}else {
			request.getRequestDispatcher("/toPackingList").forward(request,response);
		}
		
	}
	
	/**
	 * 根据id查找装箱单
	 */
	@RequestMapping("/toview")
	public Object toview(String packingListId) {
		System.out.println("跳转");
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListView");
		Eackinglist packing = packingService.selectByPrimaryKey(packingListId);
		m.addObject("obj", packing);
		return m;
	}

	
	
}
