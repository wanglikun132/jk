package com.lanou.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lanou.entity.Export;
import com.lanou.entity.Exportproduct;
import com.lanou.entity.Exteproduct;

public interface ExportService {
	/**
	 * 查询所有报运单
	 * @return
	 */
public List<Export> selectAllExport();
/**
 * 根据报运单id查询报运货物id
 * @return
 */
public List<Exportproduct> selectExportproductByExportId(String exportId);

/**
 * 根据报运货物id查询报运附件id
 * @return
 */
List<Exteproduct> selectByExportProductId(String exportProductId);

/**
 * 根据expotId查询export
 * @return
 */
public List<Export> selectExportByExportIds(Map<String,Object>map);
/**
 * 多个合同添加报运单
 */
public void baoyun(String[]ids);
/**
 * 查询多个报运单
 * @param ids
 * @return
 */
public List<Export> selectByExportIdss(String[] ids);
/**
 * 根据装箱单的customerContracts查到报运单
 * @param customerContracts
 * @return
 */
List<Export> selectByCustomerContracts(List<String>customerContracts);
/**
 * 装箱级联删除
 * @param customerContract
 * @return
 */
int deletecustomerContracts(String customerContract);
/**
 * 删除
 * @param customerContract
 * @return
 */
int deleteByPrimaryKeySe(String id);

/**
 * 根据exportProductId删除附件
 * @param exportProductId
 * @return
 */
int deleteByExportProductId(String exportProductId);

/**
 * 根据报运单id删除货物id
 * @param exportId
 * @return
 */
int deleteByExportId(String exportId);
/**
 * 修改报运单
 * @param record
 * @return
 */
int updateByPrimaryKeySelective(Export record);
/**
 * 修改报运单
 * @param exportId
 * @return
 */
Export selectByPrimaryKey(String exportId);
}
