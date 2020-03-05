package com.team.house.housebackapi;

import com.team.house.housebackapi.entity.District;
import com.team.house.housebackapi.mapper.DistrictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseBackapiApplicationTests {

    @Autowired(required = false)
    private DistrictMapper districtMapper;

    @Test
    public void contextLoads() {
       districtMapper.selectByExample(null);

    }

}
