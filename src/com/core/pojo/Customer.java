package com.core.pojo;

import java.util.Date;
import com.core.utils.StringUtils;

public class Customer {
	private String fullName;
	private String email;
	private String password;
	private Date bdate;
	private double regAmount;
	
	public Customer(String fullName, String email, String password, Date bdate, double regAmount) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.bdate = bdate;
		this.regAmount = regAmount;
	}
	
	public String getEmail() {
		return email;
	}

	public Date getBdate() {
		return bdate;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public boolean setPassword(String password) {
		this.password = password;
		return true;
	}

	public String getPassword() {
		return password;
	}

	public double getRegAmount() {
		return regAmount;
	}

	@Override
	public String toString() {
		return fullName + "[Email: " + email + ", Pwd: " + password + ", B'Date: " + StringUtils.getSdf().format(bdate)
				+ ", RegAmount: Rs." + regAmount + "]";
	}
	
}
