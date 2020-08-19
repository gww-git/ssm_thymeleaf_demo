package com.sz.service.impl;

import com.sz.dao.UserDao;
import com.sz.entity.User;
import com.sz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> ByUserAll() {
        return userDao.ByUserAll();
    }

    @Override
    public User ByUserId(int id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserId(int id) {

    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public List<User> ByUserRole() {
        return null;
    }
}
