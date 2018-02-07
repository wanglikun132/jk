package com.lanou.service;

import java.util.List;

import com.lanou.bean.ContractHisDetail;
import com.lanou.entity.Contract;
import com.lanou.entity.Contracthis;
import com.lanou.entity.Contractproduct;
import com.lanou.entity.Extcproduct;

public interface HisService {
	/**
	 * 插入合同历史
	 * @param record
	 * @return
	 */
	int insertContractSelective(Contract contract);
	/**
	 * 添加合同货物
	 * @param record
	 * @return
	 */
	int insertContractproductSelective(Contractproduct contractproduct);
	/**
	 * 添加合同货物附件
	 * @param record
	 * @return
	 */
	int insertExtcproductSelective(Extcproduct cxtcproduct);
	/**
     * 查询所有合同历史
     * @return
     */
   List<Contracthis> selectAllContractHis();
   
   /**
    * 查询合同歷史详情
    * @param id
    * @return
    */
   public ContractHisDetail showDetail(String id);
}
