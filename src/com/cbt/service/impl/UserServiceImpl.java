package com.cbt.service.impl;

import java.util.List;

import com.cbt.dao.UserDao;
import com.cbt.entity.User;
import com.cbt.service.UserService;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    
    @Override
    public List<User> getAll() {
	return userDao.getAll();
    }

    public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
    }
}
