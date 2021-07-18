package com.wqm.myjz.dao.extend;

import com.wqm.myjz.bean.extend.UserExtend;

import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/11 17:04
 */
public interface UserExtendMapper {
    List<UserExtend> selectAllWithRole();
    List<UserExtend> selectAllWithEmployee();

}
