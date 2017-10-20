package com.yanczhong.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.yanczhong.domain.User;
import com.yanczhong.mapper.UserMapper;
import com.yanczhong.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	public User queryUserById(Integer id) throws Exception {
		return userMapper.queryUserById(id);
	}

}
