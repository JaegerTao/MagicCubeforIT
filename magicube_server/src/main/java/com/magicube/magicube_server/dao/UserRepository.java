package com.magicube.magicube_server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magicube.magicube_server.model.User;//这个接口对User类进行增删查改

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}