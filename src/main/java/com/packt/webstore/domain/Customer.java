package com.packt.webstore.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String customerId;
	private String name;
	private String address;
	private List<Product> productsOwned = new ArrayList<Product>();
	private boolean noOfOrdersMode;

	public Customer(){
		super();
	}
	
	public Customer(String customerId, String name, String address){
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", noOfOrdersMode="
				+ noOfOrdersMode + "]";
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isNoOfOrdersMode() {
		return noOfOrdersMode;
	}

	public void setNoOfOrdersMode(boolean noOfOrdersMode) {
		this.noOfOrdersMode = noOfOrdersMode;
	}

	public List<Product> getProductsOwned() {
		return productsOwned;
	}

	public void setProductsOwned(List<Product> productsOwned) {
		this.productsOwned = productsOwned;
	}
	
	public boolean addProduct(Product product){
		return productsOwned.add(product);
	}
	
	public boolean returnProduct(Product product){
		return productsOwned.remove(product);
	}
}
