package com.lanou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lanou.bean.FactoryRecordBean;
import com.lanou.bean.LoginRecordBean;
import com.lanou.entity.Loginlog;

public interface LoginlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOGIN_LOG_P
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int deleteByPrimaryKey(String loginLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOGIN_LOG_P
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insert(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOGIN_LOG_P
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int insertSelective(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOGIN_LOG_P
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    Loginlog selectByPrimaryKey(String loginLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOGIN_LOG_P
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKeySelective(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOGIN_LOG_P
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    int updateByPrimaryKey(Loginlog record);
    /**
     * 登录峰值统计
     * @return
     */
    List<FactoryRecordBean> selectLogLine(@Param("year")String year);
    /**
     * 查询所有年份
     * @return
     */
    List<String> selectYear();
    /**
     * 
     * @param yearTime
     * @return
     */
    List<LoginRecordBean> selectloginyeartime(@Param("yearTime")String yearTime);
}