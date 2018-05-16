package com.zzzy.controller;


import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzzy.po.User;
import com.zzzy.service.impl.UserServiceImpl;
import com.zzzy.service.interfaces.UserService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/login")
	public String queryAll(String title,String pageno,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		   
		System.out.println("login 5");
		
		User user = userService.get(1);
		System.out.println("user:" + user.getName());
		
		return "index";
	}
	
	
}