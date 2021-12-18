package com.demo.springcoreadproject.autowiring.assignment;

public class Reservation {

	private int id;
	
	private String time;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(int id, String time) {
		super();
		this.id = id;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

	
	
}
