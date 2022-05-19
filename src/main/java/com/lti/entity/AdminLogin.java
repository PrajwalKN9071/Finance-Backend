package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminlogindetails")
public class AdminLogin {
	@Id
	@Column(name="loginid")
	private String loginid;
	@Column(name="loginpass")
	private String password;
	
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminLogin(String loginid, String password) {
		super();
		this.loginid = loginid;
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminLogin [loginid=" + loginid + ", password=" + password + "]";
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
