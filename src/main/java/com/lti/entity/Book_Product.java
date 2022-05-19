package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bookedproduct")
public class Book_Product 
{
	@Id
	@Column(name="id")
	private int id;
	private String prodname;
	private int cost_per_unit;
	private int emicost;
	private int emimonth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return prodname;
	}
	public void setName(String name) {
		this.prodname = name;
	}
	public int getCost_per_unit() {
		return cost_per_unit;
	}
	public void setCost_per_unit(int cost_per_unit) {
		this.cost_per_unit = cost_per_unit;
	}
	public int getEmicost() {
		return emicost;
	}
	public void setEmicost(int emicost) {
		this.emicost = emicost;
	}
	public int getEmimonth() {
		return emimonth;
	}
	public void setEmimonth(int emimonth) {
		this.emimonth = emimonth;
	}
	@Override
	public String toString() {
		return "Book_Product [id=" + id + ", name=" + prodname + ", cost_per_unit=" + cost_per_unit + ", emicost=" + emicost
				+ ", emimonth=" + emimonth + "]";
	}
	public Book_Product(int id, String name, int cost_per_unit, int emicost, int emimonth) {
		super();
		this.id = id;
		this.prodname = name;
		this.cost_per_unit = cost_per_unit;
		this.emicost = emicost;
		this.emimonth = emimonth;
	}
	public Book_Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
}
