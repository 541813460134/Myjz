package com.wqm.myjz.service;

import com.wqm.myjz.bean.User;
import com.wqm.myjz.bean.UserExample;
import com.wqm.myjz.bean.extend.UserExtend;

import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/11 16:52
 */
public interface UserService {

    List<User> findAll();


    List<UserExtend> findAllWithRole();

    void deteteById(Long id);

    void saveorUpdate(User user);




    User findById(Long id);




}
