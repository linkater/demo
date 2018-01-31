package org.demo.service.impl;

import java.util.List;

import org.demo.dao.domain.User;
import org.demo.dao.service.UserMapper;
import org.demo.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;  

	@Override
	public List<User> queryUsers() {
		return userMapper.queryUsers();
	}

}
