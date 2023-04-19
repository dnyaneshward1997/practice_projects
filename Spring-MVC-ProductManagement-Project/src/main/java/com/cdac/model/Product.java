package com.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_Id;
	private String name;
	private String company;
	private double price;
	private String image;

	public Product() {

	}

	public Product(int product_Id) {
		super();
		this.product_Id = product_Id;

	}

	public Product(String name, String company, double price) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	
	public Product(int product_Id, String name, String company, double price, String image) {
		super();
		this.product_Id = product_Id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.image = image;
	}

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return product_Id + "  " + name + "  " + company + "  " + price;

	}

}
