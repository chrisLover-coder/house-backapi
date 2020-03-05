package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.Type;
import com.team.house.housebackapi.mapper.TypeMapper;
import com.team.house.housebackapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: house-backapi
 * @description:
 * @author: link
 * @date: 2020-02-25 16:49
 **/
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired(required = false)
    private TypeMapper typeMapper;

    @Override
    public List<Type> getAll() {
        return typeMapper.selectByExample(null);
    }
}
