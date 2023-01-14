package com.core;

import java.time.LocalDate;

import com.core.enums.ServicePlan;

public class Customer {

	private int customer_id;
	private String name;
	private String password;
	private double regAmt;
	private LocalDate dob;
	private ServicePlan plan;
	private String email;
	private static int idGen;
	static {
		idGen = 10000;
	}

	public Customer(String email,String name, String password, LocalDate dob, ServicePlan plan) {
		this.email=email;
		this.customer_id = idGen++;
		this.name = name;
		this.password = password;
		this.regAmt = plan.getAmount();
		this.dob = dob;
		this.plan = plan;
	}

	public boolean equals(Object o) {
		if (o instanceof Customer)
			return this.customer_id == ((Customer) o).customer_id;
		return false;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", password=" + password + ", regAmt="
				+ regAmt + ", dob=" + dob + ", plan=" + plan + ", email=" + email + "]";
	}
	
	

}
