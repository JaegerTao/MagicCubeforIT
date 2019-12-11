package com.magicube.magicube_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.magicube.magicube_server.dao.UserRepository;
import com.magicube.magicube_server.model.User;

@Service   //对接数据库表和注册页面得到的信息，但service本身没有读写能力*/
public class UserService {
    @Autowired              //不需要创建直接就可使用
    UserRepository userRepository;
    
	public User addUser(User user,Model model) {
		try {
		User registeredUser = userRepository.save(user);
		return registeredUser;
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("error",e.getMessage());//传递错误信息
		}
		return null;
	}
}