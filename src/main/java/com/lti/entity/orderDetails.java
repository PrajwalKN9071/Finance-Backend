package com.lti.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class orderDetails 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int orderno;
private String cardno;
private String email;
private String cardtype;
private String id;
private String prodname;
private String cost_per_unit;
private String emicost;
private String emimonth;
public int getOrderno() {
	return orderno;
}
public void setOrderno(int orderno) {
	this.orderno = orderno;
}
public String getCardno() {
	return cardno;
}
public void setCardno(String cardno) {
	this.cardno = cardno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCardtype() {
	return cardtype;
}
public void setCardtype(String cardtype) {
	this.cardtype = cardtype;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getProdname() {
	return prodname;
}
public void setProdname(String prodname) {
	this.prodname = prodname;
}
public String getCost_per_unit() {
	return cost_per_unit;
}
public void setCost_per_unit(String cost_per_unit) {
	this.cost_per_unit = cost_per_unit;
}
public String getEmicost() {
	return emicost;
}
public void setEmicost(String emicost) {
	this.emicost = emicost;
}
public String getEmimonth() {
	return emimonth;
}
public void setEmimonth(String emimonth) {
	this.emimonth = emimonth;
}
@Override
public String toString() {
	return "orderDetails [orderno=" + orderno + ", cardno=" + cardno + ", email=" + email + ", cardtype=" + cardtype
			+ ", id=" + id + ", prodname=" + prodname + ", cost_per_unit=" + cost_per_unit + ", emicost=" + emicost
			+ ", emimonth=" + emimonth + "]";
}
public orderDetails(int orderno, String cardno, String email, String cardtype, String id, String prodname,
		String cost_per_unit, String emicost, String emimonth) {
	super();
	this.orderno = orderno;
	this.cardno = cardno;
	this.email = email;
	this.cardtype = cardtype;
	this.id = id;
	this.prodname = prodname;
	this.cost_per_unit = cost_per_unit;
	this.emicost = emicost;
	this.emimonth = emimonth;
}
public orderDetails() {
	super();

}


}
