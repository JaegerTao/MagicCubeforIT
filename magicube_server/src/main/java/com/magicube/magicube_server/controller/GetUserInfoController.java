package com.magicube.magicube_server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicube.magicube_server.dao.UserRepository;
import com.magicube.magicube_server.model.User;

@RestController
@RequestMapping("/getUserInfo")
public class GetUserInfoController {
	
	@Autowired
	UserRepository userRepository;
	
	@ResponseBody
	@RequestMapping(value="/getAllUsers",method=RequestMethod.POST)
	public List<User> getAllUser(){
		List<User> list;
		list = userRepository.findAll();
		if(list != null){
			return list;
		}else{
			return null;
		}
	}
}
