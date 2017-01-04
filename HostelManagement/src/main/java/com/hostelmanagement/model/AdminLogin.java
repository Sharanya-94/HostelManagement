package com.hostelmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminlogin")
public class AdminLogin {

	@Id
	private long userName;
	private String password;
	
	public AdminLogin(){
		
	}

	public AdminLogin(long userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	
	public long getUserName() {
		return userName;
	}

	public void setUserName(long userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}
	
}
