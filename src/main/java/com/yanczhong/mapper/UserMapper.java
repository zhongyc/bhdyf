package com.yanczhong.mapper;


import com.yanczhong.domain.User;

public interface UserMapper {
	
	public User queryUserById(Integer id) throws Exception;
	
}