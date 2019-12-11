package com.magicube.magicube_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.magicube.magicube_server.bean.RegisterForm;
import com.magicube.magicube_server.model.User;
import com.magicube.magicube_server.service.UserService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired   //这层只需要绑定service
	UserService userService;
	
	@RequestMapping(value="/doRegister",method=RequestMethod.POST)
	public String doRegister(RegisterForm getregister,Model model) {
		//数据库表实体类，获取之前注册得到的信息存入数据库中
		User user = new User(getregister.getName(),getregister.getPhonenumber(),getregister.getEmail(),getregister.getPassword());
		User addUser = userService.addUser(user,model);
		if(addUser == null) {
			return null;
		}
		return "1";
	}
}
