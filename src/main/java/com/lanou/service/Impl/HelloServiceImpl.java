package com.lanou.service.Impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.lanou.entity.Contracthis;
import com.lanou.mapper.ContracthisMapper;
import com.lanou.mapper.ContractproducthisMapper;
import com.lanou.mapper.ExtcproducthisMapper;
import com.lanou.service.HelloService;
@Service
@WebService(endpointInterface=
"com.lanou.service.HelloService",
serviceName="HelloService")
public class HelloServiceImpl implements HelloService{

	@Resource
	private ContracthisMapper contracthisMapper;
	@Resource
	private ContractproducthisMapper contractproducthisMapper;
	@Resource
	private ExtcproducthisMapper extcproducthisMapper;
	
	@Override
	public List<Contracthis> selectAllContractHis() {
		// TODO Auto-generated method stub
	 return contracthisMapper.selectAllContractHis();
	}

	@Override
	public Contracthis selectByPrimaryKey(String contractId) {
		// TODO Auto-generated method stub
		return contracthisMapper.selectByPrimaryKey(contractId);
	}

	@Override
	public List<Contracthis> selectByFactoryId(String factoryId) {
		// TODO Auto-generated method stub
		return contracthisMapper.selectByFactoryId(factoryId);
	}

	@Override
	public List<Contracthis> selectMaxTotalAcount() {
		// TODO Auto-generated method stub
		return contracthisMapper.selectMaxTotalAcount();
	}

	@Override
	public List<Contracthis> selectContactByMonth(Integer month) {
		// TODO Auto-generated method stub
		return contracthisMapper.selectContactByMonth(month);
	}

	@Override
	public List<Contracthis> selectContactByYear(Integer year) {
		// TODO Auto-generated method stub
		return contracthisMapper.selectContactByYear(year);
	}

}
