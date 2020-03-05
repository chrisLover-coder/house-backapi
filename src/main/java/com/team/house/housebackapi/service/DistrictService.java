package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.District;

import java.util.List;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:47
 **/
public interface DistrictService {
    /**
     * 查询所有数据
     * @return
     */
    List<District> getAllDistrict();
}
