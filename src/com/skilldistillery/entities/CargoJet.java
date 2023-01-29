package com.skilldistillery.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet(String jetName, String jetModel, int speed, double range, double cost) {
		super(jetName, jetModel, speed, range, cost);

	}

	@Override
	public String fly() {

		double time = range / speed;
		double newTime = Math.round(time * 100) / 100.0;
		return "The " + jetModel + " Cargo jet can fly for " + newTime + " hours.";

	}

	@Override
	public void loadCargo() {

		System.out.println(jetModel + " is loading its cargo.");

	}

}
