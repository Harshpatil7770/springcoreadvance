package com.demo.springcoreadproject.autowiring.assignment;

public class Customer {

	private String name;
	
	private Reservation reservation;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, Reservation reservation) {
		super();
		this.name = name;
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}
	
	
}
