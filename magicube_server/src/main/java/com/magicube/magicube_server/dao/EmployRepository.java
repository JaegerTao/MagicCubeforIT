package com.magicube.magicube_server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magicube.magicube_server.model.Employ;
//这个接口对resume类进行增删查改

@Repository
public interface EmployRepository extends JpaRepository<Employ, Long> {

	//Employ findByUsername(String username);
}
