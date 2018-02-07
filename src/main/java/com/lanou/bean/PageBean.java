package com.lanou.bean;

import java.util.List;

public class PageBean<T> {
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 总条数
	 */
	private int totalCount;
	/**
	 * 一页显示多少条
	 */
	private int pagesize;
	/**
	 * 页码
	 */
	private int pageNo;
	/**
	 * 一页显示内容
	 */
	private List<T> list;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalPage() {
		return this.getTotalCount() % this.getPagesize() == 0 ? this.getTotalCount() / this.getPagesize()
				: this.getTotalCount() / this.getPagesize() + 1;
	}

}
