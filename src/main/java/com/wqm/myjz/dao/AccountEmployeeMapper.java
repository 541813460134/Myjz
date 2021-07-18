package com.wqm.myjz.dao;

import com.wqm.myjz.bean.AccountEmployee;
import com.wqm.myjz.bean.AccountEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountEmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    long countByExample(AccountEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int deleteByExample(AccountEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int insert(AccountEmployee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int insertSelective(AccountEmployee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    List<AccountEmployee> selectByExample(AccountEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    AccountEmployee selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByExampleSelective(@Param("record") AccountEmployee record, @Param("example") AccountEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByExample(@Param("record") AccountEmployee record, @Param("example") AccountEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByPrimaryKeySelective(AccountEmployee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_account_employee
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByPrimaryKey(AccountEmployee record);
}