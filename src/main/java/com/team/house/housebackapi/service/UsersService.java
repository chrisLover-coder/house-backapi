package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Users;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:51
 **/
public interface UsersService {
    /**
     * 添加用户
     * @param users
     * @return
     */
    int regUser(Users users);

    /**
     * 登入
     * @param name
     * @param password
     * @return
     */
    Users login(String name, String password);
}
