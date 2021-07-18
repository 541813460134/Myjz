package com.wqm.myjz.service.impl;

import com.wqm.myjz.bean.User;
import com.wqm.myjz.bean.UserExample;
import com.wqm.myjz.bean.extend.UserExtend;
import com.wqm.myjz.dao.UserMapper;
import com.wqm.myjz.dao.extend.UserExtendMapper;
import com.wqm.myjz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/11 17:01
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserExtendMapper userExtendMapper;



    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public List<UserExtend> findAllWithRole() {
        return userExtendMapper.selectAllWithRole();
    }

    @Override
    public void deteteById(Long id) {
        userMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void saveorUpdate(User user) {
        if(user.getId()!=null)
            userMapper.updateByPrimaryKey(user);
            else
                userMapper.insert(user);

    }

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
