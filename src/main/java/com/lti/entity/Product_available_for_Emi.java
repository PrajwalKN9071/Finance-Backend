package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Productforemi")
public class Product_available_for_Emi 
{
	@Id
	
	@Column(name="id")
	private String id;
	private String name;
	private String model_name;
	private String brand_name;
	private String category;
	private String detail;
	private String image_path;
	private int cost_per_unit;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public int getCost_per_unit() {
		return cost_per_unit;
	}
	public void setCost_per_unit(int cost_per_unit) {
		this.cost_per_unit = cost_per_unit;
	}
	@Override
	public String toString() {
		return "Product_available_for_Emi [id=" + id + ", name=" + name + ", model_name=" + model_name + ", brand_name="
				+ brand_name + ", category=" + category + ", detail=" + detail + ", image_path=" + image_path
				+ ", cost_per_unit=" + cost_per_unit + "]";
	}
	public Product_available_for_Emi(String id, String name, String model_name, String brand_name, String category,
			String detail, String image_path, int cost_per_unit) {
		super();
		this.id = id;
		this.name = name;
		this.model_name = model_name;
		this.brand_name = brand_name;
		this.category = category;
		this.detail = detail;
		this.image_path = image_path;
		this.cost_per_unit = cost_per_unit;
	}
	public Product_available_for_Emi() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
