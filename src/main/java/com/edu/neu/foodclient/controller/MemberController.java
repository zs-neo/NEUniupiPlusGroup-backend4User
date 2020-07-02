package com.edu.neu.foodclient.controller;

import com.edu.neu.foodclient.entity.Member;
import com.edu.neu.foodclient.entity.RedPacket;
import com.edu.neu.foodclient.service.MemberService;
import com.edu.neu.foodclient.service.RedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {


    @Autowired
    private MemberService memberService;


    @RequestMapping("/getMember")
    public Object getMember(@RequestParam("clientid") int clientid) {
        Map<String,Object> map = new HashMap<String, Object>();
            Member member=memberService.getMember(clientid);
            if(member!=null){
                map.put("getMember","success");
                map.put("member",member);
            }else{
                map.put("getMember","fail");
            }
        return map;
    }
}
