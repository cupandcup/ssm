package com.zzzy.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzzy.mapper.UserMapper;
import com.zzzy.po.User;
import com.zzzy.service.interfaces.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User get(int id)throws Exception {
		// TODO Auto-generated method stub
		
		return userMapper.selectByPrimaryKey(id);
	}
}
