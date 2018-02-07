package com.lanou.service;

import java.util.List;

import com.lanou.entity.Invoice;

public interface InvoiceService {

	
    /**
     * 查询全部发票
     * @return
     */
    List<Invoice> selectAllInvoice();
    
    /**
     *根据id查询
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    Invoice selectByPrimaryKey(String invoiceId);
    
    /**
     * 根据id删除
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int deleteByPrimaryKey(String invoiceId);
    
    /**
     *增加
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insertSelective(Invoice record);
    
    

    /**
     * 根据id修改
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKeySelective(Invoice record);
    
    
}
