package com.lanou.mapper;

import java.util.List;

import com.lanou.entity.Exteproduct;

public interface ExteproductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_EPRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int deleteByPrimaryKey(String extEproductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_EPRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insert(Exteproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_EPRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insertSelective(Exteproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_EPRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    Exteproduct selectByPrimaryKey(String extEproductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_EPRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKeySelective(Exteproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXT_EPRODUCT_C
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKey(Exteproduct record);
    /**
     * 根据报运货物id查询报运附件
     * @param exportProductId
     * @return
     */
    List<Exteproduct> selectByExportProductId(String exportProductId);
    /**
     * 根据exportProductId删除附件
     * @param exportProductId
     * @return
     */
    int deleteByExportProductId(String exportProductId);
    
    
}