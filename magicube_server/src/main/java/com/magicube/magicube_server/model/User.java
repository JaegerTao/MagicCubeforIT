package com.magicube.magicube_server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity   /*能够使之变成数据库表的配置*/
@Table(name="user") /*映射到哪个表*/

public class User {
	/*重启spring boot后可以自动在数据库简表*/
	@Id   /*组件*/
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private Long id;/*id只读*/
	private String username;
	private String phonenumber;
	private String email;
	private String password;
	
	public User() {
		
	}
	
	public User(String username, String phonenumber, String email, String password) {
		this.username = username;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}
	
}
