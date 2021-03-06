package com.wqm.myjz.bean;

import java.io.Serializable;

public class AccountSystem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_system.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_system.money
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_system.transaction_time
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long transactionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_system.description
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_system.type
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_system.user_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_system.order_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jz_account_system
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_system.id
     *
     * @return the value of jz_account_system.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_system.id
     *
     * @param id the value for jz_account_system.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_system.money
     *
     * @return the value of jz_account_system.money
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_system.money
     *
     * @param money the value for jz_account_system.money
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_system.transaction_time
     *
     * @return the value of jz_account_system.transaction_time
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getTransactionTime() {
        return transactionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_system.transaction_time
     *
     * @param transactionTime the value for jz_account_system.transaction_time
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setTransactionTime(Long transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_system.description
     *
     * @return the value of jz_account_system.description
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_system.description
     *
     * @param description the value for jz_account_system.description
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_system.type
     *
     * @return the value of jz_account_system.type
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_system.type
     *
     * @param type the value for jz_account_system.type
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_system.user_id
     *
     * @return the value of jz_account_system.user_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_system.user_id
     *
     * @param userId the value for jz_account_system.user_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_system.order_id
     *
     * @return the value of jz_account_system.order_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_system.order_id
     *
     * @param orderId the value for jz_account_system.order_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}