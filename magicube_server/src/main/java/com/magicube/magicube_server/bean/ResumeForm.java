package com.magicube.magicube_server.bean;

public class ResumeForm {
	private String realname;
	private String sex;
	private String age;
	private String city;
	private String telephone;
	private String email;
	private String jobtype;
	private String salary;
	private String introduce;
	
	public ResumeForm() {
		
	}
	
	

	public ResumeForm(String realname, String sex, String age, String city, String telephone, String email,
			String jobtype, String salary, String introduce) {
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



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	
}
