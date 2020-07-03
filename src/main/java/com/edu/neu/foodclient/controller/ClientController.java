package com.edu.neu.foodclient.controller;

import com.edu.neu.foodclient.entity.Client;
import com.edu.neu.foodclient.service.ClientService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Resource
    private ClientService clientService;
    @RequestMapping("/update")
    public Object updateClient(@RequestBody Client client){
        Map<String, Object> map = new HashMap<>();
        int status = clientService.updateClientInfo(client);
        if(status==1 || status == 0){
            map.put("status", true);
        }else {
            map.put("status", false);
            map.put("msg", "系统异常");
        }
        return map;
    }

    @RequestMapping("/getClient")
    public Object getClient(@PathParam("clientid") Integer clientid){
        Client client = clientService.getClient(clientid);
        return client;
    }
}
