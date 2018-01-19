package com.example.ssmdemo.entity;

/**
 * 实体类
 *
 * @author jiangjianhui
 * @create 2018-01-15 15:33
 **/
public class User {
    private Integer id;
    private String username;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id + ", username='" + username +  ", age=" + age + '}';
    }
}
