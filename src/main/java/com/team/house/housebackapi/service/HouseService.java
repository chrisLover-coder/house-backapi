package com.team.house.housebackapi.service;

import com.github.pagehelper.PageInfo;
import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.utils.HouseCondition;
import com.team.house.housebackapi.utils.PagePrameter;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:47
 **/
public interface HouseService {

    /**
     * 发布出租房
     * @param house
     * @return 影响行数
     */
    int addHouse(House house);

    /**
     * 查询某用户下所有出租房支持分页
     * @param uid 用户id
     * @param pagePrameter 页码，页大小
     * @return
     */
    PageInfo<House> getHouseByUserId(Integer uid,PagePrameter pagePrameter);

    int deletHouse(String id);

    PageInfo<House>  getBroswerHouse(HouseCondition houseCondition);
}
