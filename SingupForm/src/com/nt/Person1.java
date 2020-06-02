package com.nt;

import java.util.List;

//bean class

public class Person1 {

	private String name;
	private String age;
	private String email;
	private String pwd;
	private String bio;
	private String job;
	private List<String> interest;
	public Person1(String name, String age, String email, String pwd, String bio, String job, List<String> interest) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.bio = bio;
		this.job = job;
		this.interest = interest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public List<String> getInterest() {
		return interest;
	}
	public void setInterest(List<String> interest) {
		this.interest = interest;
	}
	

}
