package com.sz.service;

import com.sz.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {
    List<User> ByUserAll();
    User ByUserId(int id);
    void updateUser(User user);
    void deleteUserId(int id);
    void insertUser(User user);
    List<User> ByUserRole();
}
