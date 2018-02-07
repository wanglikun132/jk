package com.lanou.mapper;

import java.util.List;
import java.util.Map;

import com.lanou.entity.Factory;

public interface FactoryMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table FACTORY_C
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int deleteByPrimaryKey(String factoryId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table FACTORY_C
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int insert(Factory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table FACTORY_C
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int insertSelective(Factory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table FACTORY_C
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	Factory selectByPrimaryKey(String factoryId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table FACTORY_C
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int updateByPrimaryKeySelective(Factory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table FACTORY_C
	 *
	 * @mbg.generated Mon Jan 08 14:49:59 CST 2018
	 */
	int updateByPrimaryKey(Factory record);

	/**
	 * 一页显示的内容
	 * 
	 * @param map
	 * @return
	 */
	List<Factory> selectPageByFactory(Map<String, Object> map);

	/**
	 * 总条数
	 * 
	 * @param map
	 * @return
	 */
	int selectPageCount(Map<String, Object> map);
	/**
	 * 工厂下拉选列表
	 * @return
	 */
	List<Factory> selectAll();
}