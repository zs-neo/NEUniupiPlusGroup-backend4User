package com.edu.neu.foodcilent.service;

import com.github.pagehelper.PageInfo;
import com.edu.neu.foodcilent.entity.Food;


import java.util.List;

public interface FoodService {

    List<Food> getAll();
    List<Food> getFoodBySecondType(int stid);
    List<Food> getFoodByName(String fname);
    PageInfo<Food> getPageFood(int pageNum, int pageSize, int stid);
}
