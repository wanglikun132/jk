package com.lanou.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Invoice;
import com.lanou.mapper.InvoiceMapper;
import com.lanou.service.InvoiceService;
@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Resource
	InvoiceMapper invoiceMapper;
	
	public List<Invoice> selectAllInvoice() {
		// TODO Auto-generated method stub
		return invoiceMapper.selectAllInvoice();
	}

	public Invoice selectByPrimaryKey(String invoiceId) {
		// TODO Auto-generated method stub
		return invoiceMapper.selectByPrimaryKey(invoiceId);
	}

	public int deleteByPrimaryKey(String invoiceId) {
		// TODO Auto-generated method stub
		return invoiceMapper.deleteByPrimaryKey(invoiceId);
	}

	public int insertSelective(Invoice record) {
		// TODO Auto-generated method stub
		return invoiceMapper.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(Invoice record) {
		// TODO Auto-generated method stub
		return invoiceMapper.updateByPrimaryKeySelective(record);
	}

}
