package com.edu.neu.foodcilent.service;

import com.edu.neu.foodcilent.entity.FirstType;
import com.edu.neu.foodcilent.entity.SecondType;

import java.util.List;

public interface FoodTypeService {
    List<FirstType> getFirstTypeWithSecondType();
    List<FirstType> getFirstType();
    List<SecondType> getSecondTypeByFtid(int ftid);
}
