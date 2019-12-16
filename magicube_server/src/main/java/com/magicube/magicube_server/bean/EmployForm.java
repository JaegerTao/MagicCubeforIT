package com.magicube.magicube_server.bean;

public class EmployForm {
	private String jobname;
	private String pay;
	private String education;
	private String workexperience;
	private String age;
	private String employnumber;
	private String askphone;
	private String workaddress;
	private String worktime;
	
	public EmployForm() {
		
	}

	
	public EmployForm(String jobname, String pay, String education, String workexperience, String age,
			String employnumber, String askphone, String workaddress, String worktime) {
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
	
	
}
