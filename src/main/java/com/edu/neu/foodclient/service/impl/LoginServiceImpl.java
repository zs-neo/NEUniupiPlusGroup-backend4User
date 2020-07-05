/*
 * Author github: https://github.com/zs-neo
 * Author Email: 2931622851@qq.com
 */
package com.edu.neu.foodclient.service.impl;

import com.edu.neu.foodclient.entity.Client;
import com.edu.neu.foodclient.entity.UserVO;
import com.edu.neu.foodclient.mapper.LoginMapper;
import com.edu.neu.foodclient.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhousheng
 * @version 1.0
 * @since 2020/6/28 13:51
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public Client login(String username, String password) {
		List<Client> clientList = loginMapper.get(username,password);
		if (clientList == null || clientList.size() == 0) {
			return null;
		}
		return clientList.get(0);
	}
	
	@Override
	public int register(Client client) {
		try {
			loginMapper.register(client);
		} catch (Exception e) {
			return -1;
		}
		return 1;
	}
	
	@Override
	public int replace(UserVO user) {
		return loginMapper.update(user.getUsername(), user.getPassword());
	}
}
