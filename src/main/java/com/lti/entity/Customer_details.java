package com.lti.entity;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.time.LocalDate;

import javax.persistence.Column;
@Entity
@Table(name="userdetails")
public class Customer_details
{
	@Id
	@Column(name="email")
	private String Email_id;
	
	@Column(name="fname")
	private String First_Name;
	
	@Column(name="mname")
	private String Middle_Name;
	
	@Column(name="lname")
	private String Last_Name;
	
	@Column(name="dob")
	private LocalDate Date_of_birth;
	
	@Column(name="phno")
	private String Phone_number;
	
	@Column(name="password")
	private String Password;
	
	@Column(name="address")
	private String Address;
	
	@Column(name="accountstatus")
	private String accountstatus;

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getMiddle_Name() {
		return Middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public LocalDate getDate_of_birth() {
		return Date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		Date_of_birth = date_of_birth;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}

	@Override
	public String toString() {
		return "Customer_details [Email_id=" + Email_id + ", First_Name=" + First_Name + ", Middle_Name=" + Middle_Name
				+ ", Last_Name=" + Last_Name + ", Date_of_birth=" + Date_of_birth + ", Phone_number=" + Phone_number
				+ ", Password=" + Password + ", Address=" + Address + ", accountstatus=" + accountstatus + "]";
	}

	public Customer_details(String email_id, String first_Name, String middle_Name, String last_Name,
			LocalDate date_of_birth, String phone_number, String password, String address, String accountstatus) {
		super();
		Email_id = email_id;
		First_Name = first_Name;
		Middle_Name = middle_Name;
		Last_Name = last_Name;
		Date_of_birth = date_of_birth;
		Phone_number = phone_number;
		Password = password;
		Address = address;
		this.accountstatus = accountstatus;
	}

	public Customer_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
