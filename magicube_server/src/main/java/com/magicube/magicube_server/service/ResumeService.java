package com.magicube.magicube_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.magicube.magicube_server.dao.ResumeRepository;
import com.magicube.magicube_server.model.Resume;

@Service   //对接数据库表和注册页面得到的信息，但service本身没有读写能力*/
public class ResumeService {
    @Autowired              //不需要创建直接就可使用
    ResumeRepository ResumeRepository;
    
	public Resume addResume(Resume resume,Model model) {
		try {
		Resume sendResume = ResumeRepository.save(resume);
		return sendResume;
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("error",e.getMessage());//传递错误信息
		}
		return null;
	}
}
