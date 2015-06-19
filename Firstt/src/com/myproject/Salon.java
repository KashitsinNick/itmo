package com.myproject;
import com.myproject.Store;

public class Salon {
		
	public String name;
	Store[] stores;

	public Salon(String name, Store[] stores) {
		this.name = name;
		this.stores = stores;
	}

	public String getName() {
		return this.name;
	}
}

