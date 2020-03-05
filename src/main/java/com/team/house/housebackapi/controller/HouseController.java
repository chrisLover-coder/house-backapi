package com.team.house.housebackapi.controller;

import com.github.pagehelper.PageInfo;
import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.entity.Users;
import com.team.house.housebackapi.service.HouseService;
import com.team.house.housebackapi.utils.FileUploadUtil;
import com.team.house.housebackapi.utils.HouseCondition;
import com.team.house.housebackapi.utils.PagePrameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:52
 **/
@RestController

public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("/addHouse")
    @CrossOrigin(value = "*",allowCredentials = "true")
    public String addHouse(House house, HttpSession session, @RequestParam(value = "pfile",required = false) MultipartFile file) {
        try {
            //文件上传
            //设置文件存储的位置
            String path = "/Users/link/java/imgs";
            String filename = FileUploadUtil.upload(file, path);
            house.setId(System.currentTimeMillis()+"");
            Users users = (Users) session.getAttribute("logininfo");
            if (users != null) {
                house.setUserId(users.getId());
            } else {
                house.setUserId(1000);
            }
            house.setPath( filename);
            houseService.addHouse(house);
            return "{\"result\":1}";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "{\"result\":0}";
    }

    @RequestMapping("/getHouseByPage")
    @CrossOrigin(value = "*", allowCredentials = "true")
    public Map<String, Object> getHouseByPage(PagePrameter pagePrameter,HttpSession session) {
        pagePrameter.setPageSize(5);
        Users users = (Users) session.getAttribute("logininfo");
        PageInfo<House> pageInfo = houseService.getHouseByUserId(users.getId(), pagePrameter);
        HashMap<String, Object> map = new HashMap<>();
        map.put("totalPage", pageInfo.getPages());
        map.put("rows", pageInfo.getList());
        return map;
    }

    @RequestMapping("/delHouse")
    @CrossOrigin(value = "*",allowCredentials ="true")
    public String delHouse(String id,String filename){
        //调用业务删除出租房
        int temp=houseService.deletHouse(id);
        if(temp>0) {
            //删除的图片
            File file=new File("/Users/link/java/imgs/"+filename);
            if(file.exists()){
                file.delete();  //删除
            }
            return "{\"result\":1}";
        }
        else{
            return "{\"result\":0}";
        }

    }

    @RequestMapping("/searchHouse")
    @CrossOrigin(value = "*",allowCredentials ="true")
    public Map<String,Object> searchHouse(HouseCondition houseCondition){
        //调用业务
        PageInfo<House> pageInfo=houseService.getBroswerHouse(houseCondition);
        //返回数据
        Map<String,Object> map=new HashMap<>();
        map.put("totalPage",pageInfo.getPages());
        map.put("rows",pageInfo.getList());
        return map;
    }

}
