package com.qa.main;

public class Mechanic {
	
	private String upgrade;
	private double costOfCar;
	private double numberOfUpgrades;
	private double totalCost;
	
	public void mechanic (String upgrade) {
		
		totalCost =  (this.costOfCar*numberOfUpgrades);
		
		System.out.println("Your upgrades:" +upgrade+ "%n Your cost=" + totalCost);
		
	}
	
	
	
	public double getNumberOfUpgrades() {
		return numberOfUpgrades;
	}



	public void setNumberOfUpgrades(double numberOfUpgrades) {
		this.numberOfUpgrades = numberOfUpgrades;
	}



	public double getTotalCost() {
		return totalCost;
	}



	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}



	public String getUpgrade() {
		return upgrade;
	}
	public void setUpgrade(String upgrade) {
		this.upgrade = upgrade;
	}
	public double getCost() {
		return costOfCar;
	}
	public void setCost(double cost) {
		this.costOfCar = cost;
	}
	
	

}
