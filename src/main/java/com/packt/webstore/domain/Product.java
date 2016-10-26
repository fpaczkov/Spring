package com.packt.webstore.domain;
import java.math.BigDecimal;

import lombok.Data;

public @Data class Product {
	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discontinued;
	private String condition;
	
	public Product(){
		super();
	}
	
	public Product(String productId, String name, BigDecimal unitPrize){
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrize;
	}
}