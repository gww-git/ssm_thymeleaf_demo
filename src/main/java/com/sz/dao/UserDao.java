package com.sz.dao;

import com.sz.entity.User;

import java.util.List;

public interface UserDao {

    List<User> ByUserAll();
    User ByUserId(int id);
    void updateUser(User user);
    void deleteUserId(int id);
    void insertUser(User user);
    List<User> ByUserRole();

}
