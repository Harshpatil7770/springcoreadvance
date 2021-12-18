package com.demo.springcoreadproject.standalone.collection;

import java.util.List;

public class Product {

	private List<String> products;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(List<String> products) {
		super();
		this.products = products;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Product [products=" + products + "]";
	}
	
	
}
