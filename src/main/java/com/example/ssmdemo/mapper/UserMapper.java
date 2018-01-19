package com.example.ssmdemo.mapper;

import com.example.ssmdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *
 *
 * @author jiangjianhui
 * @create 2018-01-15 15:35
 **/
@Repository //@Repository的类都将被注册为Spring Bean。
@Mapper
public interface UserMapper extends BaseMapper{
    User selectUserByName(String name);
}
