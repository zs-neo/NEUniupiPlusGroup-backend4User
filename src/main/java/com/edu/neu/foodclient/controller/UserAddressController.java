package com.edu.neu.foodclient.controller;

import com.edu.neu.foodclient.entity.UserAddress;
import com.edu.neu.foodclient.mapper.UserAddressMapper;
import com.edu.neu.foodclient.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userAddress")
public class UserAddressController {

    @Autowired
    UserAddressService userAddressService;

    @RequestMapping("/insertUserAddress")
    public int insertUserAddress(@RequestBody UserAddress userAddress){
        System.out.println(userAddress);
        return userAddressService.insertAddress(userAddress);
    }
    @RequestMapping("getUserAddress")
    public List<UserAddress> getUserAddress(@RequestParam("userid") int userid){
        return userAddressService.getUserAddress(userid);
    }

    @RequestMapping("deleteUserAddress")
    public int deleteUserAddress(@RequestParam("addressid") int addressid){
        userAddressService.deleteUserAddress(addressid);
        return 1;
    }

    @RequestMapping("updateUserAddress")
    public int updateUserAddress(@RequestBody UserAddress userAddress){
        userAddressService.updateUserAddress(userAddress);
        return 1;
    }
}
