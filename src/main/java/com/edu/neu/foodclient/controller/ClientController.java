package com.edu.neu.foodclient.controller;

import com.edu.neu.foodclient.entity.Client;
import com.edu.neu.foodclient.service.ClientService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Resource
    ClientService clientService;
    @RequestMapping("/update")
    public Object updateClient(@RequestBody Client client){
        int status = clientService.updateClientInfo(client);
        return status;
    }

    @RequestMapping("/getClient")
    public Object getClient(@PathParam("clientid") Integer clientid){
        Client client = clientService.getClient(clientid);
        return client;
    }
}
