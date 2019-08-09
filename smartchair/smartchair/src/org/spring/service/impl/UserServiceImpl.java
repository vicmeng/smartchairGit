package org.spring.service.impl;


import org.spring.entity.User;
import org.spring.mapper.UserMapper;
import org.springservice.UserService;

public class UserServiceImpl implements UserService{
	
	private UserMapper userMapper;
	
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	@Override
	public User queryUserById(int u_id) {
		return userMapper.queryUserById(u_id);
	}
	
	
}
