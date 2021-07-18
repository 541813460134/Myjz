package com.wqm.myjz.bean;

import java.io.Serializable;

public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order.order_time
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order.total
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order.status
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order.customer_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order.employee_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_order.address_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private Long addressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jz_order
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order.id
     *
     * @return the value of jz_order.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order.id
     *
     * @param id the value for jz_order.id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order.order_time
     *
     * @return the value of jz_order.order_time
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order.order_time
     *
     * @param orderTime the value for jz_order.order_time
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order.total
     *
     * @return the value of jz_order.total
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order.total
     *
     * @param total the value for jz_order.total
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order.status
     *
     * @return the value of jz_order.status
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order.status
     *
     * @param status the value for jz_order.status
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order.customer_id
     *
     * @return the value of jz_order.customer_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order.customer_id
     *
     * @param customerId the value for jz_order.customer_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order.employee_id
     *
     * @return the value of jz_order.employee_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order.employee_id
     *
     * @param employeeId the value for jz_order.employee_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_order.address_id
     *
     * @return the value of jz_order.address_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_order.address_id
     *
     * @param addressId the value for jz_order.address_id
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}