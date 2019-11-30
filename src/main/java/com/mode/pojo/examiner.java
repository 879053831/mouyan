package com.mode.pojo;

import org.springframework.stereotype.Repository;
//体检人员类
@Repository
public class examiner {
	String name;
	String personid;//体检人id
	String gender;//性别
	String balance;//余额
	String password;
	String item;//体检项目
	String cardid;//体检卡号
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public examiner(String name, String personid, String gender, String balance, String password, String item,
			String cardid) {
		super();
		this.name = name;
		this.personid = personid;
		this.gender = gender;
		this.balance = balance;
		this.password = password;
		this.item = item;
		this.cardid = cardid;
	}
	public examiner() {
		super();
	}
	
}
