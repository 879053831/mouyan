package com.mode.pojo;

import org.springframework.stereotype.Repository;
//企业类
@Repository
public class team {
	String name;
	String password;
	String bill;//企业账单 也就是记账
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public team(String name, String password, String bill) {
		super();
		this.name = name;
		this.password = password;
		this.bill = bill;
	}
	public team() {
		super();
	}
	
}
