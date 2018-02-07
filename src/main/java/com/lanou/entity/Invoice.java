package com.lanou.entity;

import java.util.Date;

public class Invoice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.INVOICE_ID
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String invoiceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.SC_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String scNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.BL_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String blNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.TRADE_TERMS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String tradeTerms;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.STATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private Short state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.CREATE_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.CREATE_DEPT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private String createDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INVOICE_C.CREATE_TIME
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.INVOICE_ID
     *
     * @return the value of INVOICE_C.INVOICE_ID
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.INVOICE_ID
     *
     * @param invoiceId the value for INVOICE_C.INVOICE_ID
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.SC_NO
     *
     * @return the value of INVOICE_C.SC_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getScNo() {
        return scNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.SC_NO
     *
     * @param scNo the value for INVOICE_C.SC_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setScNo(String scNo) {
        this.scNo = scNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.BL_NO
     *
     * @return the value of INVOICE_C.BL_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getBlNo() {
        return blNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.BL_NO
     *
     * @param blNo the value for INVOICE_C.BL_NO
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setBlNo(String blNo) {
        this.blNo = blNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.TRADE_TERMS
     *
     * @return the value of INVOICE_C.TRADE_TERMS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.TRADE_TERMS
     *
     * @param tradeTerms the value for INVOICE_C.TRADE_TERMS
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.STATE
     *
     * @return the value of INVOICE_C.STATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public Short getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.STATE
     *
     * @param state the value for INVOICE_C.STATE
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.CREATE_BY
     *
     * @return the value of INVOICE_C.CREATE_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.CREATE_BY
     *
     * @param createBy the value for INVOICE_C.CREATE_BY
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.CREATE_DEPT
     *
     * @return the value of INVOICE_C.CREATE_DEPT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public String getCreateDept() {
        return createDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.CREATE_DEPT
     *
     * @param createDept the value for INVOICE_C.CREATE_DEPT
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INVOICE_C.CREATE_TIME
     *
     * @return the value of INVOICE_C.CREATE_TIME
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INVOICE_C.CREATE_TIME
     *
     * @param createTime the value for INVOICE_C.CREATE_TIME
     *
     * @mbg.generated Mon Jan 08 14:49:59 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}