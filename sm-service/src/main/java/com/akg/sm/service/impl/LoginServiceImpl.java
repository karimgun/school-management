package com.akg.sm.service.impl;

import com.akg.sm.dao.UserDao;
import com.akg.sm.domain.system.User;
import com.akg.sm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "loginService")
public class LoginServiceImpl implements LoginService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public boolean validateUser(String userName, String password) {
        if (userName == null || password == null) return false;
        User user = userDao.getUser(userName);
        return user.validateUser(userName, password);
    }
}
