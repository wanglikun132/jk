package com.lanou.service;

import com.lanou.entity.Shippingorder;

public interface ShippingorderService {

	
	
	  /**
     * 根据id删除
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int deleteByPrimaryKey(String shippingOrderId);
    
    
    /**
     * 根据id查询
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    Shippingorder selectByPrimaryKey(String shippingOrderId);
    
    
    /**
     * 增加
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insertSelective(Shippingorder record);

    

    /**
     * 根据id修改
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKeySelective(Shippingorder record);
}
