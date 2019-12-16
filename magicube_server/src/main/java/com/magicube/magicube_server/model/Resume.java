package com.magicube.magicube_server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity   /*能够使之变成数据库表的配置*/
@Table(name="Resume") /*映射到哪个表*/

public class Resume {
	/*重启spring boot后可以自动在数据库简表*/
	@Id   /*组件*/
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private Long id;/*id只读*/
	private String username;
	private String realname;
	private String sex;
	private String age;
	private String city;
	private String telephone;
	private String email;
	private String jobtype;
	private String salary;
	private String introduce;
	
	public Resume() {
		
	}

	
	public Resume(String username, String realname, String sex, String age, String city, String telephone, String email, String jobtype,
			String salary, String introduce) {
		this.username = username;
		this.realname = realname;
		this.sex = sex;
		this.age = age;
		this.city = city;
		this.telephone = telephone;
		this.email = email;
		this.jobtype = jobtype;
		this.salary = salary;
		this.introduce = introduce;
	}

	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getJobtype() {
		return jobtype;
	}


	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Long getId() {
		return id;
	}
	
	

}
