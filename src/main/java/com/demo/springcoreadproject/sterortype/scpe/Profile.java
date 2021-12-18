package com.demo.springcoreadproject.sterortype.scpe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
@Value("Java Developer")
	private String designation;
	
@Value("Xoriant Solutions Pvt Ltd")
 	private String companyName;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String designation, String companyName) {
		super();
		this.designation = designation;
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Profile [designation=" + designation + ", companyName=" + companyName + "]";
	}
 	
 	
}
