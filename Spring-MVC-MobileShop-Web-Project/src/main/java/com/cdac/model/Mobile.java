package com.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_table")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String company;
	private String model;
	private double price;
	private String image;

	public Mobile() {

	}

	public Mobile(int id) {
		super();
		this.id = id;

	}

	public Mobile(String company, String model, double price) {
		super();
		this.company = company;
		this.model = model;
		this.price = price;
	}

	public Mobile(int id, String company, String model, double price) {
		super();
		this.id = id;
		this.company = company;
		this.model = model;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		return id + "  " + company + "  " + model + "  " + price;
	}

}
