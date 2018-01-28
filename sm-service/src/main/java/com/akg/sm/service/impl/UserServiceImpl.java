package com.akg.sm.service.impl;

import com.akg.sm.dao.UserDao;
import com.akg.sm.domain.system.User;
import com.akg.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String userName) {
        return userDao.getUser(userName);
    }
}
