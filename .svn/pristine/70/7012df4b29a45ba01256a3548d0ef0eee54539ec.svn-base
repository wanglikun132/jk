package com.lanou.service;

import java.util.List;

import javax.jws.WebService;

import com.lanou.entity.Contracthis;

@WebService
public interface HelloService {
	/**
     * 查询所有合同历史
     * @return
     */
   List<Contracthis> selectAllContractHis();
   /**
    * 2：根据合同id ，查询合同详情
    * @param contractId
    * @return
    */
   Contracthis selectByPrimaryKey(String contractId);
   
   /**
    * 根据厂家，查询该厂家下所有的合同信息
    * @param factoryId
    * @return
    */
   List<Contracthis> selectByFactoryId(String factoryId);
   /**
    * 求出总金额最大的合同信息
    * @return
    */
   List<Contracthis> selectMaxTotalAcount();
   
   /**
    * 5：求出近三月以来，合同列表
		6：求出近半年以来，合同列表
    * @return
    */
   List<Contracthis> selectContactByMonth(Integer month);
   /**
    * 根据年份，合同列表
    * @return
    */
   List<Contracthis> selectContactByYear(Integer year);
	
}