package com.example.ssmdemo.service;

import com.example.ssmdemo.entity.User;
import com.example.ssmdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jiangjianhui
 * @create 2018-01-15 15:51
 **/
@Transactional(rollbackFor = Exception.class)
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUsers(String userName) {
        return userMapper.selectUserByName(userName);
    }

    @Override
    public void save(String name, Integer age) {
        try {
            User user = new User();
            user.setUsername(name);
            user.setAge(age);
            userMapper.save(user);
        }
      catch (Exception e){
            throw  e;
      }

    }
}
