package com.magicube.magicube_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.magicube.magicube_server.dao.EmployRepository;
import com.magicube.magicube_server.model.Employ;
@Service   //对接数据库表和注册页面得到的信息，但service本身没有读写能力*/
public class EmployService {
    @Autowired              //不需要创建直接就可使用
    EmployRepository EmployRepository;
    
	public Employ addResume(Employ Employlist,Model model) {
		try {
		Employ Employlists = EmployRepository.save(Employlist);
		return Employlists;
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("error",e.getMessage());//传递错误信息
		}
		return null;
	}
}
