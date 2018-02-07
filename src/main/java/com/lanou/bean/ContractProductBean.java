package com.lanou.bean;

import java.io.Serializable;
import java.util.List;

import com.lanou.entity.Contractproduct;
import com.lanou.entity.Extcproduct;

public class ContractProductBean  implements Serializable{

	private Contractproduct cp;
	private List<Extcproduct> list;
	public Contractproduct getCp() {
		return cp;
	}
	public void setCp(Contractproduct cp) {
		this.cp = cp;
	}
	public List<Extcproduct> getList() {
		return list;
	}
	public void setList(List<Extcproduct> list) {
		this.list = list;
	}
	
	
	
	
	
}
