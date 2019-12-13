package com.magicube.magicube_server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.magicube.magicube_server.dao.UserRepository;
import com.magicube.magicube_server.model.User;
import com.magicube.magicube_server.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/getUser",method = RequestMethod.POST)
	@ResponseBody
	public List<User> getUser(){
		return userRepository.findAll();
	}
}
