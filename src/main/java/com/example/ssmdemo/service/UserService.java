package com.example.ssmdemo.service;

import com.example.ssmdemo.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User getUsers(String name);

    void save(String name,Integer age);
}
