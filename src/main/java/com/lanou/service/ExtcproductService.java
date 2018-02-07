package com.lanou.service;

import java.util.List;

import com.lanou.entity.Extcproduct;

public interface ExtcproductService {
	/**
	 * 添加货物附件
	 * 
	 * @param extcproduct
	 * @return
	 */
	public int insertSelective(Extcproduct extcproduct);

	/**
	 * 返回附件集合
	 * 
	 * @return
	 */
	public List<Extcproduct> selectAll(String id);

	/**
	 * 修改
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int updateByPrimaryKeySelective(Extcproduct record);

	/**
	 * 根据id查找附件
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	Extcproduct selectByPrimaryKey(String extCproductId);
	
	/**
	 * 根据id删除附件表
	 * 
	 * @param cProductId
	 * @return
	 */
	int deleteExtCproductBycProductId(String cProductId);

}
