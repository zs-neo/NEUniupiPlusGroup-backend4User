package com.edu.neu.foodclient.controller;

import com.edu.neu.foodclient.entity.FirstType;
import com.edu.neu.foodclient.entity.SecondType;
import com.edu.neu.foodclient.service.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodtype")
public class FoodTypeController {
    @Autowired
    private FoodTypeService foodTypeService;

    /**
     * 根据第一分类id获取第二分类
     * @param ftid 第一分类id
     * @return 第二分类列表
     */
    @RequestMapping("/getSecondTypeByFtid")
    public List<SecondType> getSecondTypeByFtid(@RequestParam("ftid")int ftid){
        return foodTypeService.getSecondTypeByFtid(ftid);
    }

    /**
     * 获取全部第一分类列表
     * @return 第一分类列表
     */
    @RequestMapping("/getFirstType")
    public List<FirstType> getFirstType(){
        return foodTypeService.getFirstType();
    }

    /**
     * 获取含有第二分类列表的第一分类列表
     * @return 含有第二分类列表的第一分类列表
     */
    @RequestMapping("/getFirstTypeWithSecondType")
    public List<FirstType> getFirstTypeWithSecondType(){
        return foodTypeService.getFirstTypeWithSecondType();
    }

    @RequestMapping("/getSecondTypeByStid")
    public SecondType getSecondTypeByStid(@RequestParam("stid") int stid){
        return foodTypeService.getSecondTypeByStid(stid);
    }


}
