package com.edu.neu.foodclient.controller;


import com.edu.neu.foodclient.entity.RedPacketReceive;
import com.edu.neu.foodclient.service.RedPacketReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/redpacketreceive")
public class RedPacketReceiveController {

    @Autowired
    private RedPacketReceiveService redPacketReceiveService;

    @RequestMapping("/getByClientId")
    public Object getByClientId(@RequestParam("clientid") int clientid){
        Map<String,Object> map = new HashMap<String, Object>();
        List<RedPacketReceive> redPacketReceives=redPacketReceiveService.getByClientId(clientid);
        if(redPacketReceives.size()>0) {
            map.put("redPacketReceives", redPacketReceives);
            map.put("getmsg", true);
        }
        else{
            map.put("getmsg",false);
        }
        return map;

    }
    @RequestMapping("/insertRedPacketReceive")
    public Object insertRedPacketReceive(@RequestBody  RedPacketReceive redPacketReceive) {
        Map<String,Object> map = new HashMap<String, Object>();
        if(redPacketReceiveService.insert(redPacketReceive))
            map.put("insertmsg",true);
        else
            map.put("insertmsg",false);
        return map;
    }




}
