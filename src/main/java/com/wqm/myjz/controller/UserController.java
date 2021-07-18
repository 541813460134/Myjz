package com.wqm.myjz.controller;

import com.wqm.myjz.bean.User;
import com.wqm.myjz.service.UserService;
import com.wqm.myjz.utils.Message;
import com.wqm.myjz.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/11 17:12
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/findAll")
    public Message findAll()
    {
        List<User> list = userService.findAll();

        return MessageUtil.success(list);

    }

    @GetMapping("/deleteById")
    public Message deleteById(Long id)
    {
       userService.deteteById(id);

       return MessageUtil.success("删除成功");
    }


    @GetMapping("/findById")
    public Message findById(Long id)
    {
        User u = userService.findById(id);

        return MessageUtil.success("success",u);

    }

    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(User user)
    {
        userService.saveorUpdate(user);

        return  MessageUtil.success("保存成功");

    }



}
