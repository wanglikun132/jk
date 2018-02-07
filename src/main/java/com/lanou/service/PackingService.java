package com.lanou.service;

import java.util.List;

import com.lanou.entity.Eackinglist;

public interface PackingService {

	/**
	 * 查询装箱单列表
	 * 
	 * @return
	 */
	List<Eackinglist> selectAllPacking();

	/**
	 * 根据id查询
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	Eackinglist selectByPrimaryKey(String packingListId);

	/**
	 * 根据id删除
	 * 
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int deleteByPrimaryKey(String packingListId);

	/**
	 * 修改
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int updateByPrimaryKeySelective(Eackinglist record);
	
	/**
	 * 增加
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int insertSelective(Eackinglist record);
	
}
