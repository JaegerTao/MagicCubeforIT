package com.magicube.magicube_server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//这个接口对resume类进行增删查改
import com.magicube.magicube_server.model.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {

	Resume findByRealname(String realname);
}
