package com.lanou.entity;

import java.util.Date;

public class Shippingorder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.SHIPPING_ORDER_ID
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String shippingOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.ORDER_TYPE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String orderType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.SHIPPER
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String shipper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.CONSIGNEE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String consignee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.NOTIFY_PARTY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String notifyParty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.LC_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String lcNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.PORT_OF_LOADING
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String portOfLoading;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.PORT_OF_TRANS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String portOfTrans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.PORT_OF_DISCHARGE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String portOfDischarge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.LOADING_DATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private Date loadingDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.LIMIT_DATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private Date limitDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.IS_BATCH
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String isBatch;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.IS_TRANS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String isTrans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.COPY_NUM
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String copyNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.CNOTE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String cnote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.SPECIAL_CONDITION
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String specialCondition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.FREIGHT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String freight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.CHECK_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String checkBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.STATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private Short state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.CREATE_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.CREATE_DEPT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String createDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHIPPING_ORDER_C.CREATE_TIME
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.SHIPPING_ORDER_ID
     *
     * @return the value of SHIPPING_ORDER_C.SHIPPING_ORDER_ID
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getShippingOrderId() {
        return shippingOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.SHIPPING_ORDER_ID
     *
     * @param shippingOrderId the value for SHIPPING_ORDER_C.SHIPPING_ORDER_ID
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setShippingOrderId(String shippingOrderId) {
        this.shippingOrderId = shippingOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.ORDER_TYPE
     *
     * @return the value of SHIPPING_ORDER_C.ORDER_TYPE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.ORDER_TYPE
     *
     * @param orderType the value for SHIPPING_ORDER_C.ORDER_TYPE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.SHIPPER
     *
     * @return the value of SHIPPING_ORDER_C.SHIPPER
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.SHIPPER
     *
     * @param shipper the value for SHIPPING_ORDER_C.SHIPPER
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.CONSIGNEE
     *
     * @return the value of SHIPPING_ORDER_C.CONSIGNEE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.CONSIGNEE
     *
     * @param consignee the value for SHIPPING_ORDER_C.CONSIGNEE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.NOTIFY_PARTY
     *
     * @return the value of SHIPPING_ORDER_C.NOTIFY_PARTY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getNotifyParty() {
        return notifyParty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.NOTIFY_PARTY
     *
     * @param notifyParty the value for SHIPPING_ORDER_C.NOTIFY_PARTY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setNotifyParty(String notifyParty) {
        this.notifyParty = notifyParty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.LC_NO
     *
     * @return the value of SHIPPING_ORDER_C.LC_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getLcNo() {
        return lcNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.LC_NO
     *
     * @param lcNo the value for SHIPPING_ORDER_C.LC_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setLcNo(String lcNo) {
        this.lcNo = lcNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.PORT_OF_LOADING
     *
     * @return the value of SHIPPING_ORDER_C.PORT_OF_LOADING
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getPortOfLoading() {
        return portOfLoading;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.PORT_OF_LOADING
     *
     * @param portOfLoading the value for SHIPPING_ORDER_C.PORT_OF_LOADING
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setPortOfLoading(String portOfLoading) {
        this.portOfLoading = portOfLoading;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.PORT_OF_TRANS
     *
     * @return the value of SHIPPING_ORDER_C.PORT_OF_TRANS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getPortOfTrans() {
        return portOfTrans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.PORT_OF_TRANS
     *
     * @param portOfTrans the value for SHIPPING_ORDER_C.PORT_OF_TRANS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setPortOfTrans(String portOfTrans) {
        this.portOfTrans = portOfTrans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.PORT_OF_DISCHARGE
     *
     * @return the value of SHIPPING_ORDER_C.PORT_OF_DISCHARGE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getPortOfDischarge() {
        return portOfDischarge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.PORT_OF_DISCHARGE
     *
     * @param portOfDischarge the value for SHIPPING_ORDER_C.PORT_OF_DISCHARGE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setPortOfDischarge(String portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.LOADING_DATE
     *
     * @return the value of SHIPPING_ORDER_C.LOADING_DATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public Date getLoadingDate() {
        return loadingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.LOADING_DATE
     *
     * @param loadingDate the value for SHIPPING_ORDER_C.LOADING_DATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setLoadingDate(Date loadingDate) {
        this.loadingDate = loadingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.LIMIT_DATE
     *
     * @return the value of SHIPPING_ORDER_C.LIMIT_DATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public Date getLimitDate() {
        return limitDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.LIMIT_DATE
     *
     * @param limitDate the value for SHIPPING_ORDER_C.LIMIT_DATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.IS_BATCH
     *
     * @return the value of SHIPPING_ORDER_C.IS_BATCH
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getIsBatch() {
        return isBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.IS_BATCH
     *
     * @param isBatch the value for SHIPPING_ORDER_C.IS_BATCH
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setIsBatch(String isBatch) {
        this.isBatch = isBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.IS_TRANS
     *
     * @return the value of SHIPPING_ORDER_C.IS_TRANS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getIsTrans() {
        return isTrans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.IS_TRANS
     *
     * @param isTrans the value for SHIPPING_ORDER_C.IS_TRANS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setIsTrans(String isTrans) {
        this.isTrans = isTrans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.COPY_NUM
     *
     * @return the value of SHIPPING_ORDER_C.COPY_NUM
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getCopyNum() {
        return copyNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.COPY_NUM
     *
     * @param copyNum the value for SHIPPING_ORDER_C.COPY_NUM
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCopyNum(String copyNum) {
        this.copyNum = copyNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.CNOTE
     *
     * @return the value of SHIPPING_ORDER_C.CNOTE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getCnote() {
        return cnote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.CNOTE
     *
     * @param cnote the value for SHIPPING_ORDER_C.CNOTE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCnote(String cnote) {
        this.cnote = cnote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.SPECIAL_CONDITION
     *
     * @return the value of SHIPPING_ORDER_C.SPECIAL_CONDITION
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getSpecialCondition() {
        return specialCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.SPECIAL_CONDITION
     *
     * @param specialCondition the value for SHIPPING_ORDER_C.SPECIAL_CONDITION
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setSpecialCondition(String specialCondition) {
        this.specialCondition = specialCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.FREIGHT
     *
     * @return the value of SHIPPING_ORDER_C.FREIGHT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getFreight() {
        return freight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.FREIGHT
     *
     * @param freight the value for SHIPPING_ORDER_C.FREIGHT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setFreight(String freight) {
        this.freight = freight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.CHECK_BY
     *
     * @return the value of SHIPPING_ORDER_C.CHECK_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getCheckBy() {
        return checkBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.CHECK_BY
     *
     * @param checkBy the value for SHIPPING_ORDER_C.CHECK_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCheckBy(String checkBy) {
        this.checkBy = checkBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.STATE
     *
     * @return the value of SHIPPING_ORDER_C.STATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public Short getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.STATE
     *
     * @param state the value for SHIPPING_ORDER_C.STATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.CREATE_BY
     *
     * @return the value of SHIPPING_ORDER_C.CREATE_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.CREATE_BY
     *
     * @param createBy the value for SHIPPING_ORDER_C.CREATE_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.CREATE_DEPT
     *
     * @return the value of SHIPPING_ORDER_C.CREATE_DEPT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getCreateDept() {
        return createDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.CREATE_DEPT
     *
     * @param createDept the value for SHIPPING_ORDER_C.CREATE_DEPT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHIPPING_ORDER_C.CREATE_TIME
     *
     * @return the value of SHIPPING_ORDER_C.CREATE_TIME
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHIPPING_ORDER_C.CREATE_TIME
     *
     * @param createTime the value for SHIPPING_ORDER_C.CREATE_TIME
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}