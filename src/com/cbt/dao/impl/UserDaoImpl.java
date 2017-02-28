package com.cbt.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.cbt.dao.UserDao;
import com.cbt.entity.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

    @Override
    public List<User> getAll() {
	return getSqlSession().selectList("com.cbt.entity.user.mapper.getAll");
    }

}
