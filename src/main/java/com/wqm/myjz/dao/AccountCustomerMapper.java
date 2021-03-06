package com.wqm.myjz.dao;

import com.wqm.myjz.bean.AccountCustomer;
import com.wqm.myjz.bean.AccountCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    long countByExample(AccountCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int deleteByExample(AccountCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int insert(AccountCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int insertSelective(AccountCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    List<AccountCustomer> selectByExample(AccountCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    AccountCustomer selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByExampleSelective(@Param("record") AccountCustomer record, @Param("example") AccountCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByExample(@Param("record") AccountCustomer record, @Param("example") AccountCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByPrimaryKeySelective(AccountCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_customer
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByPrimaryKey(AccountCustomer record);
}