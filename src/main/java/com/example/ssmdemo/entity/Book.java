package com.example.ssmdemo.entity;

/**
 * @author jiangjianhui
 * @create 2018-01-16 10:06
 **/
public class Book {
    private Integer id;
    private String name;
    private User User;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return User;
    }

    public void setUser(com.example.ssmdemo.entity.User user) {
        User = user;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", User=" + User +
                '}';
    }
}
