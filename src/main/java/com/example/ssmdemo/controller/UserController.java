package com.example.ssmdemo.controller;

import com.example.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ssmdemo.entity.User;


/**
 * @author jiangjianhui
 * @create 2018-01-15 15:55
 **/
//证明是controller层并且返回json
@RestController
public class UserController {
    @Autowired
    UserService userservice;

    /**
     * @Author: JiangJianHui
     * @Description:新增
     * @param name
     * @param age
     * @Date 11:26 2018/1/19 0019
     */
    @RequestMapping(value = "saveUser")
    public String saveBook(String name,Integer age){
        String result = "false";
        try {
            userservice.save(name,age);
            result = "sucess";
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "getUser")
    public User getUser(){
        User user = userservice.getUsers("小明");
        return user;
    }
}
