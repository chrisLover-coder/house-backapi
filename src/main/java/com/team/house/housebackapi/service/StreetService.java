package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Street;

import java.util.List;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:48
 **/
public interface StreetService {

    /**
     * 根据did查询
     * @param did
     * @return
     */
    List<Street> getStreetByDid(Integer did);
}
