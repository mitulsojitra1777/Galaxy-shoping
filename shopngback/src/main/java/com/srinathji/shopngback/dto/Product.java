package com.srinathji.shopngback.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String  name;
	private  String  brand;
	private String  description;
	@Column(name="unit_price")
	private double unitPrice;
	private int quntity;
	@Column(name="is_active")
	private boolean active;
	@Column(name="category_id")
	private int categoryid;
	@Column(name="suplier_id")
	private int suplierid;
	private int purchases;
	private int views;
	public Product(){
		this.code= "PRD"+UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", brand=" + brand + ", description="
				+ description + ", unitPrice=" + unitPrice + ", quntity=" + quntity + ", active=" + active
				+ ", categoryid=" + categoryid + ", suplierid=" + suplierid + ", purchases=" + purchases + ", views="
				+ views + "]";
	}

	public Product(String name, String brand, String description, double unitPrice, int quntity, boolean active,
			int categoryid, int suplierid, int purchases, int views) {
		
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quntity = quntity;
		this.active = active;
		this.categoryid = categoryid;
		this.suplierid = suplierid;
		this.purchases = purchases;
		this.views = views;
		this.code= "PRD"+UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getSuplierid() {
		return suplierid;
	}
	public void setSuplierid(int suplierid) {
		this.suplierid = suplierid;
	}
	public int getPurchases() {
		return purchases;
	}
	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	
	
	
	

}
