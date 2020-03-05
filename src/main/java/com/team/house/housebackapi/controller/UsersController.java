package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.Users;
import com.team.house.housebackapi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:54
 **/
@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 注册控制器
     * @param users
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(Users users) {
        int i = usersService.regUser(users);
        return "{\"result\":"+i+"}";
    }

    /**
     * 登入控制器
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("/userLogin")
    public String userLogin(String name, String password, HttpSession session) {
        Users user = usersService.login(name, password);
        if (user == null) {
            return "{\"result\":0}";
        }
        session.setAttribute("logininfo", user);
        session.setMaxInactiveInterval(6000);
        return "{\"result\":1}";
    }

}
