package com.demo.springcoreadproject.sterortype.scpe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* @Value("66962") */
	/* @Value("#{10+330}") */
	/* @Value("#{T(java.lang.Math).abs(-99)}") */
	/* @Value("#{T(java.lang.Integer).MIN_VALUE}") */
	@Value("#{new Integer(20)}")
	private int id;
	
	/* @Value("Harshawardhan Patil") */
	/* @Value("#{'HARSHAWARDHAN PATIL'}") */
	/* @Value("#{'Harshawardhan Patil'.toUpperCase()}") */
	@Value("#{new java.lang.String('Harsh Patil')}")
	private String name;

@Value("#{skills}")
	private List<String> skills;

@Autowired
private Profile profile;

	public Instructor(int id, String name, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", skills=" + skills + ", profile=" + profile + "]";
	}

	
	
	
}
