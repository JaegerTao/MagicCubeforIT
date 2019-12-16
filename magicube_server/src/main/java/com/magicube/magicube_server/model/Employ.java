package com.magicube.magicube_server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity   /*能够使之变成数据库表的配置*/
@Table(name="Employ") /*映射到哪个表*/

public class Employ {
	/*重启spring boot后可以自动在数据库简表*/
	@Id   /*组件*/
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private Long id;/*id只读*/
	private String jobname;
	private String pay;
	private String education;
	private String workexperience;
	private String age;
	private String employnumber;
	private String askphone;
	private String workaddress;
	private String worktime;
	
	public Employ() {
		
	}

	
	public Employ(String jobname, String pay, String education, String workexperience, String age, String employnumber,
			String askphone, String workaddress, String worktime) {
		this.jobname = jobname;
		this.pay = pay;
		this.education = education;
		this.workexperience = workexperience;
		this.age = age;
		this.employnumber = employnumber;
		this.askphone = askphone;
		this.workaddress = workaddress;
		this.worktime = worktime;
	}

	

	public String getJobname() {
		return jobname;
	}


	public void setJobname(String jobname) {
		this.jobname = jobname;
	}


	public String getPay() {
		return pay;
	}


	public void setPay(String pay) {
		this.pay = pay;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public String getWorkexperience() {
		return workexperience;
	}


	public void setWorkexperience(String workexperience) {
		this.workexperience = workexperience;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getEmploynumber() {
		return employnumber;
	}


	public void setEmploynumber(String employnumber) {
		this.employnumber = employnumber;
	}


	public String getAskphone() {
		return askphone;
	}


	public void setAskphone(String askphone) {
		this.askphone = askphone;
	}


	public String getWorkaddress() {
		return workaddress;
	}


	public void setWorkaddress(String workaddress) {
		this.workaddress = workaddress;
	}


	public String getWorktime() {
		return worktime;
	}


	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}


	public Long getId() {
		return id;
	}
	
	

}
