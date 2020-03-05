package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.Street;
import com.team.house.housebackapi.service.StreetService;
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
 * @date: 2020-02-25 16:53
 **/
@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class StreetController {

    @Autowired
    private StreetService streetService;

    @RequestMapping("/getStreetByDid")
    public List<Street> getStreetByDid(Integer did) {
        return streetService.getStreetByDid(did);
    }

}
