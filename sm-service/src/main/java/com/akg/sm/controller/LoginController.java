package com.akg.sm.controller;

import com.akg.sm.controller.mapper.DomainViewMapper;
import com.akg.sm.domain.system.User;
import com.akg.sm.service.LoginService;
import com.akg.sm.service.UserService;
import com.akg.sm.view.bean.LoginView;
import com.akg.sm.view.bean.UserView;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    private final static Logger logger = LogManager.getLogger(LoginController.class);

    @Resource(name = "loginService")
    private LoginService loginService;

    @Resource(name = "userService")
    private UserService userService;

    @Resource(name = "domainViewMapper")
    private DomainViewMapper mapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public UserView login(@RequestBody LoginView login){
        System.out.println("userName = [" + login.getUserName() + "], password = [" + login.getPassword() + "]");
        logger.trace("Login request for {userName} is received ");
        boolean isValidUser = loginService.validateUser(login.getUserName(), login.getPassword());
        UserView userView = new UserView();
        if (isValidUser){
            User user = userService.getUser(login.getUserName());
            UserView view = mapper.map(user, UserView.class);
            return view;
        }
        return userView;
    }
}
