package com.magicube.magicube_server.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.magicube.magicube_server.bean.LoginForm;
import com.magicube.magicube_server.model.User;
import com.magicube.magicube_server.service.UserService;


@RestController
@RequestMapping("/index")
public class LoginController {
	
	@Autowired   //这层只需要绑定service
	UserService userService;
	
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
		public User doLogin(LoginForm getlogin,Model model,HttpSession session) {
			User user = new User(getlogin.getName(),getlogin.getPassword());
			User loginuser = userService.checkLogin(user,model);
			if(loginuser == null) {
				return null;
			}
			session.setAttribute("u", loginuser);
			return loginuser;
		}
}
