package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.District;
import com.team.house.housebackapi.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:52
 **/
@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @RequestMapping("/getAllDistrict")
    public List<District> getAllDistrict() {
        return districtService.getAllDistrict();
    }

}
