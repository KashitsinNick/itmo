package com.myproject;

public class Store {

	public String name;
	public String model;
	public String location;
	public String price;
	public String telephone;
	public String information;
	public String website;

	public Store(String name, String model, String location, String price, String telephone,	String information, String website) {
		this.name = name;
		this.model = model;
		this.location = location;
		this.price = price;
		this.telephone = telephone;
		this.information = information;
		this.website = website;
	}

	public String getName() {
		return this.name;
	}

	public String getHardware() {
		return this.model;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getPrice() {
		return this.price;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public String getInformation() {
		return this.information;
	}

	
	public String getWebsite() {
		return this.website;
	}

}