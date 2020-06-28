package com.edu.neu.foodcilent.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.edu.neu.foodcilent.entity.Food;
import com.edu.neu.foodcilent.mapper.FoodMapper;
import com.edu.neu.foodcilent.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> getAll() {
        return foodMapper.getAll();
    }

    @Override
    public List<Food> getFoodBySecondType(int stid) {
        return foodMapper.getFoodBySecondType(stid);
    }

    @Override
    public List<Food> getFoodByName(String fname) {
        return foodMapper.getFoodByName(fname);
    }


    @Override
    public PageInfo<Food> getPageFood(int pageNum, int pageSize,int stid) {
        PageHelper.startPage(pageNum, pageSize);

        PageInfo<Food> pageInfo = new PageInfo<Food>(foodMapper.getFoodBySecondType(stid));

        return pageInfo;
    }


}
