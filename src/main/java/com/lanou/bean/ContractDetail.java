package com.lanou.bean;

import java.io.Serializable;
import java.util.List;

import com.lanou.entity.Contract;

public class ContractDetail implements Serializable{

	private Contract c;
	private List<ContractProductBean> cpb;
	public Contract getC() {
		return c;
	}
	public void setC(Contract c) {
		this.c = c;
	}
	public List<ContractProductBean> getCpb() {
		return cpb;
	}
	public void setCpb(List<ContractProductBean> cpb) {
		this.cpb = cpb;
	}
	
}
