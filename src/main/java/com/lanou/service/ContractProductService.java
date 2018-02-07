package com.lanou.service;

import java.util.List;

import com.lanou.entity.Contractproduct;
import com.lanou.entity.Extcproduct;

public interface ContractProductService {
	/**
	 * 添加货物信息
	 * 
	 * @param record
	 * @return
	 */
	public int insertProduct(Contractproduct record);

	/**
	 * 根据id删除货物
	 * 
	 * @param contractProductId
	 * @return
	 */
	int deleteByPrimaryKey(String contractProductId);
	
	/**
	 * 根据id删除附件表
	 * 
	 * @param cProductId
	 * @return
	 */
	int deleteExtCproductBycProductId(String cProductId);

/**
 * 根据id查找货物
 *
 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
 */
Contractproduct selectByPrimaryKey(String contractProductId);


/**
 * 根据id修改
 *
 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
 */
int updateByPrimaryKeySelective(Contractproduct record);

}
