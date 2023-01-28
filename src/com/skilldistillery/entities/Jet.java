package com.skilldistillery.entities;

import java.util.Objects;

public abstract class Jet {

	protected String jetName;
	protected String jetModel;
	protected int speed;
	protected double range;
	protected double cost;

	public abstract String fly();

	public Jet(String jetName, String jetModel, int speed, double range, double cost) {
		super();
		this.jetName = jetName;
		this.jetModel = jetModel;
		this.speed = speed;
		this.range = range;
		this.cost = cost;
	}

	public String getJetName() {
		return jetName;
	}

	public void setJetName(String jetName) {
		this.jetName = jetName;
	}

	public String getJetModel() {
		return jetModel;
	}

	public void setJetModel(String jetModel) {
		this.jetModel = jetModel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, jetModel, jetName, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Objects.equals(jetModel, other.jetModel) && Objects.equals(jetName, other.jetName)
				&& Double.doubleToLongBits(range) == Double.doubleToLongBits(other.range) && speed == other.speed;
	}

	@Override
	public String toString() {
		return "Jet Type: " + jetName + ", Model: " + jetModel + ", speed:" + speed + " MPH, range:" + range
				+ " Miles, cost: $" + cost + "\n";
	}

}
