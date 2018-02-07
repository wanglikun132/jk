
package com.lanou.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lanou.bean.ContractDetail;
import com.lanou.bean.PageBean;
import com.lanou.entity.Authuser;
import com.lanou.entity.Contract;
import com.lanou.entity.Contractproduct;

import com.lanou.entity.Extcproduct;

import com.lanou.entity.Factory;
import com.lanou.service.ContractProductService;
import com.lanou.service.ContractProductService;
import com.lanou.service.ContractService;
import com.lanou.service.ExportService;
import com.lanou.service.ExtcproductService;
import com.lanou.service.FactoryService;
import com.lanou.util.ExcelUtil;

@Controller
public class ContractController {

	/***************************** wanglikun *************************************/
	@Resource

	ExtcproductService extcproductService;
	@Resource
	private ContractProductService contractProductService;

	@Resource
	private ContractService contractService;

	@Resource
	private FactoryService factoryService;
	@Resource
	private ExportService exportService;

	/**
	 * 级联删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/cargo/contract/del")
	public Object deleteById(String id) {
		System.out.println("//////*****进入级联删除***********////////");
		List<Contractproduct> contractproductList = contractService.selectByContractId(id);
		if (contractproductList!=null) {
			for (Contractproduct contractproduct : contractproductList) {
				List<Extcproduct> extcproductList = contractService.selectByContractProductId(contractproduct.getContractProductId());
				if (extcproductList!=null) {
					contractService.deleteByContractProductId(contractproduct.getContractProductId());
				}
			}
			contractService.deleteByContractId(id);
		}
		int i = contractService.deleteContractById(id);
		if (i>0) {
			return new ModelAndView("redirect:/list");
		}
		
	return null;
	}
	/**
	 * 删除购销合同
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteBatch")
	public Object deleteBatch(String[] id) {
		System.out.println("//////*****进入删除***********////////");
		int j=0;
		for (String i : id) {
			 j = contractService.deleteContractById(i);
		}
		if (j>0) {
			return new ModelAndView("redirect:/list");
		}
		
	return null;
	}

	@RequestMapping("/list")
	public ModelAndView selectAll() { 
		ModelAndView m = new ModelAndView("cargo/contract/jContractList");
		List<Contract> list = contractService.selectAll();
		m.addObject("dataList", list);
		return m;
	}

	/**
	 * 跳转到添加
	 * 
	 * @return  
	 */
	@RequestMapping("/cargo/contractproduct/tocreateproduct")
	public ModelAndView toadd() {
		ModelAndView m = new ModelAndView("cargo/contract/jContractCreate");
		return m;
	}

	@RequestMapping("/add")
	public String add(Contract record, HttpServletRequest request) {
		System.out.println("*********************添加******************" + record.toString());
		Authuser user = (Authuser) request.getSession().getAttribute("user");
		record.setCreateBy(user.getAuthUserId());
		record.setCreateDept(user.getCreateDept());
		record.setTotalAmount(new BigDecimal(0));
		int row = contractService.insertSelective(record);
		String offer = request.getParameter("offeror");
		System.out.println(offer);
		if (row > 0) {
			return "redirect:/list";
		} else {
			return "redirect:/add";
		}
	}

	/**
	 * 查询详情（查看）
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/cargo/contract/contractView")
	public Object selectById(String id) {
		ModelAndView m = new ModelAndView("cargo/contract/jContractView");
		ContractDetail contractDetail = contractService.showDetail(id);
		m.addObject("obj", contractDetail);
		return m;
	}

	/***
	 * 跳转到添加货物
	 * 
	 * @return
	 */
	@RequestMapping("/cargo/contractproduct/tocreate")
	public ModelAndView tocreate(@RequestParam("contractId") String id) {
		System.out.println("**********跳转到添加货物**********");
		System.out.println(id);
		List<Contractproduct> list = contractService.selectByContractId(id);
		List<Factory> factoryList = factoryService.selectAll();
		ModelAndView m = new ModelAndView("cargo/contract/jContractProductCreate");
		m.addObject("dataList", list);
		m.addObject("factoryList", factoryList);
		m.addObject("contractId", id);

		return m;
	}

	@RequestMapping("/insert")
	public String create(HttpServletRequest re, Contractproduct contractproduct,
			@RequestParam(value = "contractId", required = false) String contractId) {
		System.out.println("添加货物");
		String factoryId = re.getParameter("factoryId");
		Factory factory = factoryService.selectFactoryById(factoryId);
		contractproduct.setFactoryName(factory.getFactoryName());
		re.setAttribute("contractId", contractId);
		contractproduct.setContractId(contractId);
		BigDecimal price = contractproduct.getPrice();
		Short cnumber = contractproduct.getCnumber();
		BigDecimal totalAcount = price.multiply(new BigDecimal(cnumber));
		contractproduct.setAmount(totalAcount);
		Contract contract = contractService.selectByPrimaryKey(contractId);
		BigDecimal concatTotalAcount = contract.getTotalAmount();
		concatTotalAcount=totalAcount.add(concatTotalAcount);
		contract.setTotalAmount(concatTotalAcount);
		contractService.updateByPrimaryKeySelective(contract);
		System.out.println(contractId);
		int row = contractProductService.insertProduct(contractproduct);
		if (row > 0) {
			return "forward:/cargo/contractproduct/tocreate";
		} else {
			return "redirect:/list";
		} 
	}
 
	/***************************** wanglikun *************************************/

	/////////////////////////////////// 修改//////////////////////////////////

	@RequestMapping("/cargo/contract/toupdate")
	public ModelAndView toupdate(HttpServletRequest request) {
		ModelAndView m = new ModelAndView("cargo/contract/jContractUpdate");
		String id = request.getParameter("id");
		Contract factory = contractService.selectByPrimaryKey(id);
		m.addObject("obj", factory);

		return m;
	}

	@RequestMapping("/update")

	public String update(Contract c, @RequestParam(value = "id", required = false) String id) {

		System.out.println("////////////////**************修改********************///////////////////");

		int row = contractService.updateByPrimaryKeySelective(c);
		if (row > 0) {
			return "redirect:/list";
		} else {

			return "redirect:/update";
		}
	}

	/**
	 * <<<<<<< .mine 根据id删除对应货物和附件 ======= 跳转到附件
	 * 
	 * @return
	 */
	@RequestMapping("/toExtcproduct")
	public ModelAndView toExtcproduct(@RequestParam(value = "contractProductId", required = false) String id) {
		System.out.println("进入附件");
		ModelAndView m = new ModelAndView("cargo/contract/jExtCproductCreate");
		List<Extcproduct> extcproduct = extcproductService.selectAll(id);
		List<Factory> factoryList = factoryService.selectAll();
		m.addObject("dataList", extcproduct);
		m.addObject("factoryList", factoryList);
		m.addObject("contractProductId", id);
		return m;
	}

	@RequestMapping("/addExtcproduct")
	public String addExtcproduct(Extcproduct extcproduct,
			@RequestParam(value = "contractProductId", required = false) String contractProductId) {
		System.out.println("添加货物附件");
		System.out.println(contractProductId);
		//extcproduct.setAmount(extcproduct.getPrice().multiply(extcproduct.getCnumber()));
		Factory factory = factoryService.selectFactoryById(extcproduct.getFactoryId());
		extcproduct.setFactoryName(factory.getFactoryName());
		BigDecimal price = extcproduct.getPrice();
		Short cnumber = extcproduct.getCnumber();
		extcproduct.setAmount(price.multiply(new BigDecimal(cnumber)));
		Contractproduct contractproduct = contractProductService.selectByPrimaryKey(contractProductId);
		BigDecimal amount = contractproduct.getAmount();
		amount= amount.add(extcproduct.getAmount());
		contractproduct.setAmount(amount);
		contractProductService.updateByPrimaryKeySelective(contractproduct);
		Contract contract = contractService.selectByPrimaryKey(contractproduct.getContractId());
		BigDecimal concatTotalAcount = contract.getTotalAmount();
		concatTotalAcount=concatTotalAcount.add(extcproduct.getAmount());
		contract.setTotalAmount(concatTotalAcount);
		contractService.updateByPrimaryKeySelective(contract);
		int row = extcproductService.insertSelective(extcproduct);
		if (row > 0) {
			return "forward:/toExtcproduct";
		} else {
			return "redirect:/list";
		}
	}

	/*****************************
	 * wanglikun的结尾
	 *************************************/
	////////////////////// ***********修改货物******************////////////////////////
	@RequestMapping("/cargo/contract/toupdatep")
	public ModelAndView toupdatep(HttpServletRequest request) {
		ModelAndView m = new ModelAndView("cargo/contract/jContractProductUpdate");
		String id = request.getParameter("id");
		List<Factory> factoryList = factoryService.selectAll();
		Contractproduct factory = contractProductService.selectByPrimaryKey(id);
		m.addObject("factoryList", factoryList);
		m.addObject("obj", factory);
		return m;
	}

	@RequestMapping("/updatep")
	public String updatep(Contractproduct c, @RequestParam(value = "id", required = false) String id) {
		System.out.println("////////////////**************修改货物********************///////////////////");
		int row = contractProductService.updateByPrimaryKeySelective(c);
		if (row > 0) {
			return "redirect:/list";
		} else {

			return "redirect:/updatep";
		}
	}

	/**
<<<<<<< .mine
	 * 根据id删除对应货物

=======
	 * 根据id删除对应货物 >>>>>>> .r291
>>>>>>> .r299
	 * 
	 * @param contractProductId
	 * @return
	 */
	@RequestMapping("/cargo/contract/deleteProduct")
	public Object deleteContractproductById(@RequestParam(value = "id", required = false) String contractProductId) {
		int row = contractProductService.deleteByPrimaryKey(contractProductId);
		int flag = contractProductService.deleteExtCproductBycProductId(contractProductId);

		return "forward:/cargo/contractproduct/tocreate";
	}

	////////////////////// ***********修改附件******************////////////////////////
	@RequestMapping("/cargo/contract/toupdatepe")
	public ModelAndView toupdatepe(HttpServletRequest request) {
		ModelAndView m = new ModelAndView("cargo/contract/jExtCproductUpdate");
		String id = request.getParameter("id");
		List<Factory> factoryList = factoryService.selectAll();
		Extcproduct factory = extcproductService.selectByPrimaryKey(id);
		m.addObject("factoryList", factoryList);
		m.addObject("obj", factory);
		return m;
	}

	@RequestMapping("/updatepe")
	public String updatepe(Extcproduct c, @RequestParam(value = "id", required = false) String id) {
		System.out.println("////////////////**************修改货物********************///////////////////");
		int row = extcproductService.updateByPrimaryKeySelective(c);
		if (row > 0) {
			System.out.println("*************************修改成功*************************");
			return "forward:/toExtcproduct";
		} else {

			return "redirect:/list";
		}
	}

	/**
	 * 根据id删除货物附件
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteProduct")
	public Object deleteProduct(String id) {

		extcproductService.deleteExtCproductBycProductId(id);

		return "forward:/toExtcproduct";
	}
	
	@RequestMapping("/submit")
	public ModelAndView submit(String[] id) {
		ModelAndView m = new ModelAndView("redirect:toExpot");
		exportService.baoyun(id);
		
		for (String string : id) {
			System.out.println("//////*****进入级联删除***********////////");
			List<Contractproduct> contractproductList = contractService.selectByContractId(string);
			if (contractproductList!=null) {
				for (Contractproduct contractproduct : contractproductList) {
					List<Extcproduct> extcproductList = contractService.selectByContractProductId(contractproduct.getContractProductId());
					if (extcproductList!=null) {
						contractService.deleteByContractProductId(contractproduct.getContractProductId());
					}
				}
				contractService.deleteByContractId(string);
			}
			int i = contractService.deleteContractById(string);
		}
		
		return m;
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */

	@RequestMapping("/cargo/extcproduct/exportExcel")
	public void exportExcel(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {

	
		List<Contract> list = contractService.selectAll();

		Map<String, String> headMap = new HashMap<String, String>();
		

		headMap.put("contractId", "id");
		headMap.put("cnumber", "货物数");
		headMap.put("extnum", "附件数");
		headMap.put("customName", "客户名称");
		headMap.put("deliveryPeriod", "交期");
		headMap.put("shipTime", "船期");
		headMap.put("signingDate", "签单日期");
		headMap.put("totalAmount", "总金额");
		headMap.put("state", "状态");
		System.out.println(JSON.toJSONString(list));
		JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(list));
		ExcelUtil.downloadExcelFile("勾销合同信息信息", headMap, jsonArray, response);
	}
	/**
	 * 上报
	 * @param id
	 * @return
	 */
	@RequestMapping("/shangbao")
	public Object shangbao(String[] id) {
		if (id.length>0) {
			Contract c  = new Contract();
			for (String i : id) {
					c.setContractId(i);
					c.setState((short)1);
					contractService.updateByPrimaryKeySelective(c);
			}
		}
		return "redirect:/list";
		
	}
	/**
	 * 取消上报
	 * @param id
	 * @return
	 */
	@RequestMapping("/quxiaoshangbao")
	public Object quxiaoshangbao(String[] id) {
		Contract c  = new Contract();
		for (String i : id) {
				c.setContractId(i);
				c.setState((short)0);
				contractService.updateByPrimaryKeySelective(c);
		}
		return "redirect:/list";
	}

}
