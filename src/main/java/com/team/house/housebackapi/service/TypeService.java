package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Type;

import java.util.List;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:49
 **/
public interface TypeService {
    /**
     * 获取所有type信息
     * @return
     */
    List<Type> getAll();
}
