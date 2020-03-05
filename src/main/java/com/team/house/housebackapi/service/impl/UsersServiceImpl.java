package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.Users;
import com.team.house.housebackapi.entity.UsersExample;
import com.team.house.housebackapi.mapper.UsersMapper;
import com.team.house.housebackapi.service.UsersService;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.provider.MD5;

import java.util.List;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:51
 **/
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired(required = false)
    private UsersMapper usersMapper;

    @Override
    public int regUser(Users users) {
        users.setPassword(com.example.house_post.until.MD5Utils.md5Encrypt(users.getPassword()));
        return usersMapper.insertSelective(users);
    }

    @Override
    public Users login(String name, String password) {
        UsersExample exception = new UsersExample();
        UsersExample.Criteria criteria = exception.createCriteria();
        criteria.andNameEqualTo(name);
        criteria.andPasswordEqualTo(com.example.house_post.until.MD5Utils.md5Encrypt(password));
        List<Users> list = usersMapper.selectByExample(exception);
        if (list != null && list.size()==1) {
            return list.get(0);
        }
        return null;
    }
}
