package com.skilldistillery.entities;

import java.util.Objects;

public class CargoJet extends Jet{
private long cargoWeight;

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(cargoWeight);
	return result;
}

public CargoJet(String jetName, String jetModel, int speed, double range, double cost) {
	super(jetName, jetModel, speed, range, cost);
	// TODO Auto-generated constructor stub
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	CargoJet other = (CargoJet) obj;
	return cargoWeight == other.cargoWeight;
}

public long getCargoWeight() {
	return cargoWeight;
}

public void setCargoWeight(long cargoWeight) {
	this.cargoWeight = cargoWeight;
}

@Override
public String fly() {
//	this.speed=speed;
//	this.range=range;
	
	double time = range / speed;
	double newTime = Math.round(time * 100) /100.0;
	return  "The " + jetModel +  " Cargo jet can fly for " + newTime + " hours.";
	
}

@Override
public String toString() {
	return "CargoJet [cargoWeight=" + cargoWeight + "]";
}

}
