package com.packt.webstore.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public @Data class Customer {
	
	private String customerId;
	
	private String name;
	
	private String address;
	
	private List<Product> productsOwned = new ArrayList<Product>();
	
	private boolean noOfOrdersMode;

	protected Customer(){
		super();
	}
	
	public Customer(String customerId, String name, String address){
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}

	public boolean addProduct(Product product){
		return productsOwned.add(product);
	}
	
	public boolean returnProduct(Product product){
		return productsOwned.remove(product);
	}
}
