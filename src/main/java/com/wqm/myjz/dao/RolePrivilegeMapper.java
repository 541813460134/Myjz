package com.wqm.myjz.dao;

import com.wqm.myjz.bean.RolePrivilege;
import com.wqm.myjz.bean.RolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    long countByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int deleteByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int insert(RolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int insertSelective(RolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    List<RolePrivilege> selectByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByExampleSelective(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Mon Jun 07 15:49:53 CST 2021
     */
    int updateByExample(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);
}