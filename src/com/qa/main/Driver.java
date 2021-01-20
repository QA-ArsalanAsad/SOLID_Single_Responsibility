package com.qa.main;

public class Driver {
	
	private int mileage;
	
	public Driver(int milesDriven) {
		
		this.setMileage(this.getMileage() + milesDriven);
		
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	

}
