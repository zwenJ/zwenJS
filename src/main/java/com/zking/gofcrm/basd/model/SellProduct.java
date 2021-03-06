package com.zking.gofcrm.basd.model;

import java.io.Serializable;

/**
 * 说明：这是产品实体
 * User: jzw
 * Date: 2018-02-15
 * Time: 12:35
 */
public class SellProduct implements Serializable{
    /**
     * Database Column Remarks:
     *   产品编号，主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sell_product.prod_id
     *
     * @mbg.generated
     */
    private String prodId;

    /**
     * Database Column Remarks:
     *   产品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sell_product.prod_name
     *
     * @mbg.generated
     */
    private String prodName;

    /**
     * Database Column Remarks:
     *   产品型号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sell_product.prod_type
     *
     * @mbg.generated
     */
    private String prodType;

    /**
     * Database Column Remarks:
     *   等级/批次
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sell_product.prod_batch
     *
     * @mbg.generated
     */
    private String prodBatch;

    /**
     * Database Column Remarks:
     *   单位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sell_product.prod_unit
     *
     * @mbg.generated
     */
    private String prodUnit;

    /**
     * Database Column Remarks:
     *   单价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sell_product.prod_price
     *
     * @mbg.generated
     */
    private Long prodPrice;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sell_product.prod_memo
     *
     * @mbg.generated
     */
    private String prodMemo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sell_product.prod_id
     *
     * @return the value of sell_product.prod_id
     *
     * @mbg.generated
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sell_product.prod_id
     *
     * @param prodId the value for sell_product.prod_id
     *
     * @mbg.generated
     */
    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sell_product.prod_name
     *
     * @return the value of sell_product.prod_name
     *
     * @mbg.generated
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sell_product.prod_name
     *
     * @param prodName the value for sell_product.prod_name
     *
     * @mbg.generated
     */
    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sell_product.prod_type
     *
     * @return the value of sell_product.prod_type
     *
     * @mbg.generated
     */
    public String getProdType() {
        return prodType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sell_product.prod_type
     *
     * @param prodType the value for sell_product.prod_type
     *
     * @mbg.generated
     */
    public void setProdType(String prodType) {
        this.prodType = prodType == null ? null : prodType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sell_product.prod_batch
     *
     * @return the value of sell_product.prod_batch
     *
     * @mbg.generated
     */
    public String getProdBatch() {
        return prodBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sell_product.prod_batch
     *
     * @param prodBatch the value for sell_product.prod_batch
     *
     * @mbg.generated
     */
    public void setProdBatch(String prodBatch) {
        this.prodBatch = prodBatch == null ? null : prodBatch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sell_product.prod_unit
     *
     * @return the value of sell_product.prod_unit
     *
     * @mbg.generated
     */
    public String getProdUnit() {
        return prodUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sell_product.prod_unit
     *
     * @param prodUnit the value for sell_product.prod_unit
     *
     * @mbg.generated
     */
    public void setProdUnit(String prodUnit) {
        this.prodUnit = prodUnit == null ? null : prodUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sell_product.prod_price
     *
     * @return the value of sell_product.prod_price
     *
     * @mbg.generated
     */
    public Long getProdPrice() {
        return prodPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sell_product.prod_price
     *
     * @param prodPrice the value for sell_product.prod_price
     *
     * @mbg.generated
     */
    public void setProdPrice(Long prodPrice) {
        this.prodPrice = prodPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sell_product.prod_memo
     *
     * @return the value of sell_product.prod_memo
     *
     * @mbg.generated
     */
    public String getProdMemo() {
        return prodMemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sell_product.prod_memo
     *
     * @param prodMemo the value for sell_product.prod_memo
     *
     * @mbg.generated
     */
    public void setProdMemo(String prodMemo) {
        this.prodMemo = prodMemo == null ? null : prodMemo.trim();
    }
}