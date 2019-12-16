package com.magicube.magicube_server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicube.magicube_server.bean.EmployForm;
import com.magicube.magicube_server.model.Employ;
import com.magicube.magicube_server.service.EmployService;
@RestController
@RequestMapping("/addemploy")
public class AddEmployController {

	@Autowired   //这层只需要绑定service
	EmployService EmployService;
	

	@ResponseBody
	@RequestMapping(value="/doaddemploy",method=RequestMethod.POST)
	public Employ dosend(EmployForm getemploy,Model model) {
		//数据库表实体类，获取之前注册得到的信息存入数据库中
		Employ user = new Employ(getemploy.getJobname(),getemploy.getPay(),getemploy.getEducation(),getemploy.getWorkexperience(),getemploy.getAge(),getemploy.getEmploynumber(),getemploy.getAskphone(),getemploy.getWorkaddress(),getemploy.getWorktime());
		Employ addemploy = EmployService.addResume(user,model);
		if(addemploy == null) {
			return null;
		}
		return addemploy;
	}
}
