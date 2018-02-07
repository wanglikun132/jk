package com.lanou.service;


import java.util.List;


import javax.servlet.http.HttpServletRequest;


import com.lanou.bean.PageBean;
import com.lanou.entity.Factory;

public interface FactoryService {

	/**
	 * 通过id查找生产厂家
	 * 
	 * @param factoryId
	 * @return
	 */
	Factory selectFactoryById(String factoryId);

	/**
	 * 动态修改生产厂家
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Factory record);

	/**
	 * 动态插入生产厂家
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(Factory record);

	/**
	 * 通过id删除厂家
	 * 
	 * @param factoryId
	 * @return
	 */
	int deleteByPrimaryKey(String factoryId);

	/**
	 * 分页查询工厂信息
	 * 
	 * @param condition
	 * @param start
	 * @param end
	 * @return
	 */
	public PageBean<Factory> pageFactory(int type,String condition, int pageNo,int pageSize);
	/**
	 * 工厂下来选列表
	 * @return
	 */
	public List<Factory> selectAll();

}
