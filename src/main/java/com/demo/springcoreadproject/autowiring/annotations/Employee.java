package com.demo.springcoreadproject.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
public class Employee {

	private int id;
	@Autowired
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* @Autowired */
	 Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	/*
	 * @Autowired
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	
	
}
