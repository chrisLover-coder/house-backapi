package com.team.house.housebackapi.mapper;

import com.team.house.housebackapi.entity.House;
import com.team.house.housebackapi.entity.HouseExample;
import java.util.List;

import com.team.house.housebackapi.utils.HouseCondition;
import org.apache.ibatis.annotations.Param;

public interface HouseMapper {
    int countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    //通过用户编号查询当前用户下的出租房
    List<House> getHouseByUser(Integer id);

    List<House> getBroswerHouse(HouseCondition houseCondition);
}