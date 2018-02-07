package com.lanou.service;

import java.util.List;
import java.util.Map;

import com.lanou.bean.ContractAndProductBean;
import com.lanou.bean.ContractDetail;
import com.lanou.bean.FactoryRecordBean;
import com.lanou.entity.Contract;
import com.lanou.entity.Contractproduct;
import com.lanou.entity.Extcproduct;

public interface ContractService {
	/**
	 * 根据id删除对应的购销合同
	 * 
	 * @param contractId
	 * @return
	 */
	int deleteContractById(String contractId);

	/**
	 * 查询返回列表
	 * 
	 * @return
	 */

	public List<Contract> selectAll();

	/**
	 * 动态添加购销合同
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(Contract record);

	/**
	 * 根据id查询合同详情
	 * 
	 * @param contractId
	 * @return
	 */
	Contract selectByPrimaryKey(String contractId);
	
	/**
	 * 通过id查找合同货物表
	 * 
	 * @param id
	 * @return
	 */
	List<Contractproduct> selectByContractId(String id);
	
	
	Extcproduct selectExtCproductByFactoryId(String id);
	/**
	 * 根据id修改
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int updateByPrimaryKeySelective(Contract record);
	
	
	
	
	  /**
     * 查询出货表月统计显示
     * @param map
     * @return
     */
    List<ContractAndProductBean> showJOutProduct(Map<String , Object> map);
    
    /**
	  * 级联删除
	  * @param contractId
	  * @return
	  */
	 int deleteByContractId(String contractId);
	 
	 /**
		 * 级联删除附件
		 * @param contractProductId
		 * @return
		 */
		int deleteByContractProductId(String contractProductId);
		
		/**
		 * 根据合同货物id查询附件集合
		 * 
		 * @param contractProductId
		 * @return
		 */
		List<Extcproduct> selectByContractProductId(String contractProductId);

		
		/**
	     * 厂家销售记录
	     * @return
	     */
	    List<FactoryRecordBean> selectFactoryName();
	    /**
	     * 查询合同详情
	     * @param id
	     * @return
	     */
	    public ContractDetail showDetail(String id);
	    
}
