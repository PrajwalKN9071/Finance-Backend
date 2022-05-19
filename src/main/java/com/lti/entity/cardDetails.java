package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carddetails")
public class cardDetails 
{
	@Id
	@Column(name="cardno")
	private String cardno;
	private String nameofholder;
	private String cardtype;
	private String email;
	private String Bank_name;
	private int Bank_Account_number;
	private String IFS_code;
	private String JoiningFeeStatus;
	private String cardStatus;
	private String limit;
	private String balance;
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getNameofholder() {
		return nameofholder;
	}
	public void setNameofholder(String nameofholder) {
		this.nameofholder = nameofholder;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBank_name() {
		return Bank_name;
	}
	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}
	public int getBank_Account_number() {
		return Bank_Account_number;
	}
	public void setBank_Account_number(int bank_Account_number) {
		Bank_Account_number = bank_Account_number;
	}
	public String getIFS_code() {
		return IFS_code;
	}
	public void setIFS_code(String iFS_code) {
		IFS_code = iFS_code;
	}
	public String getJoiningFeeStatus() {
		return JoiningFeeStatus;
	}
	public void setJoiningFeeStatus(String joiningFeeStatus) {
		JoiningFeeStatus = joiningFeeStatus;
	}
	public String getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "cardDetails [cardno=" + cardno + ", nameofholder=" + nameofholder + ", cardtype=" + cardtype
				+ ", email=" + email + ", Bank_name=" + Bank_name + ", Bank_Account_number=" + Bank_Account_number
				+ ", IFS_code=" + IFS_code + ", JoiningFeeStatus=" + JoiningFeeStatus + ", cardStatus=" + cardStatus
				+ ", limit=" + limit + ", balance=" + balance + "]";
	}
	public cardDetails(String cardno, String nameofholder, String cardtype, String email, String bank_name,
			int bank_Account_number, String iFS_code, String joiningFeeStatus, String cardStatus, String limit,
			String balance) {
		super();
		this.cardno = cardno;
		this.nameofholder = nameofholder;
		this.cardtype = cardtype;
		this.email = email;
		Bank_name = bank_name;
		Bank_Account_number = bank_Account_number;
		IFS_code = iFS_code;
		JoiningFeeStatus = joiningFeeStatus;
		this.cardStatus = cardStatus;
		this.limit = limit;
		this.balance = balance;
	}
	public cardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
