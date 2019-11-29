package com.mode.pojo;

import org.springframework.stereotype.Repository;
//医院员工类
@Repository
public class hospitalemp {
	String username;
	String password;
	String power;
	
	public hospitalemp() {
		super();
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public hospitalemp(String username, String password, String power) {
		super();
		this.username = username;
		this.password = password;
		this.power = power;
	}	
}
