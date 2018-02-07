package com.lanou.mapper;

import java.util.List;

import com.lanou.entity.Exportproduct;

public interface ExportproductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int deleteByPrimaryKey(String exportProductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insert(Exportproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insertSelective(Exportproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    Exportproduct selectByPrimaryKey(String exportProductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKeySelective(Exportproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKey(Exportproduct record);
    /**
     * 根据报运单id查询报运货物id
     * @param exportId
     * @return
     */
   List<Exportproduct> selectByExportId(String exportId);
   /**
    * 根据报运单id删除货物id
    * @param exportId
    * @return
    */
   int deleteByExportId(String exportId);
}