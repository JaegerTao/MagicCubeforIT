package com.magicube.magicube_server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicube.magicube_server.model.Resume;
import com.magicube.magicube_server.bean.ResumeForm;
import com.magicube.magicube_server.service.ResumeService;

@RestController
@RequestMapping("/addresume")
public class AddResumeController {

	@Autowired   //这层只需要绑定service
	ResumeService ResumeService;
	

	@ResponseBody
	@RequestMapping(value="/doaddresume",method=RequestMethod.POST)
	public Resume dosend(ResumeForm getresume,Model model) {
		//数据库表实体类，获取之前注册得到的信息存入数据库中
		Resume user = new Resume(getresume.getUsername(),getresume.getRealname(),getresume.getSex(),getresume.getAge(),getresume.getCity(),getresume.getTelephone(),getresume.getEmail(),getresume.getJobtype(),getresume.getSalary(),getresume.getIntroduce());
		Resume addresume = ResumeService.addResume(user,model);
		if(addresume == null) {
			return null;
		}
		return addresume;
	}
}
