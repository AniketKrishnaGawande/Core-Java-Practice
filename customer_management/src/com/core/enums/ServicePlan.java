package com.core.enums;

public enum ServicePlan {

	SILVER(5000), GOLD(7000), PLATINUM(9000), DIAMOND(12000);

	double regAmount;

	ServicePlan(double regAmount) {
		this.regAmount = regAmount;
	}

	public double getAmount() {
		return regAmount;
	}

}
