package com.lanou.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ContractAndProductBean implements Serializable {
	/**
	 * 合同货物编号
	 */
	private String contractproductid;
	
	/**
	 * 客户名称
	 */
	private String customname;
	/**
	 * 合同编号
	 */
	private String contractno;
	/**
	 * 交货期限
	 */
	private String deliveryperiod;
	/**
	 * 船期
	 */
	private String shiptime;
	/**
	 * 贸易条款
	 */
	private String tradeterms;
	/**
	 * 工厂名字
	 */
	private String factoryname;
	/**
	 * 货号
	 */
	private String productno;
	/**
	 * 数量
	 */
	private int cnumber;

	public String getContractproductid() {
		return contractproductid;
	}

	public void setContractproductid(String contractproductid) {
		this.contractproductid = contractproductid;
	}

	public String getCustomname() {
		return customname;
	}

	public void setCustomname(String customname) {
		this.customname = customname;
	}

	public String getContractno() {
		return contractno;
	}

	public void setContractno(String contractno) {
		this.contractno = contractno;
	}

	public String getDeliveryperiod() {
		return deliveryperiod;
	}

	public void setDeliveryperiod(String deliveryperiod) {
		this.deliveryperiod = deliveryperiod;
	}

	public String getShiptime() {
		return shiptime;
	}

	public void setShiptime(String shiptime) {
		this.shiptime = shiptime;
	}

	public String getTradeterms() {
		return tradeterms;
	}

	public void setTradeterms(String tradeterms) {
		this.tradeterms = tradeterms;
	}

	public String getFactoryname() {
		return factoryname;
	}

	public void setFactoryname(String factoryname) {
		this.factoryname = factoryname;
	}

	public String getProductno() {
		return productno;
	}

	public void setProductno(String productno) {
		this.productno = productno;
	}

	public int getCnumber() {
		return cnumber;
	}

	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}

}
