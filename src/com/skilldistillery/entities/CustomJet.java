package com.skilldistillery.entities;

public class CustomJet extends Jet {

	public CustomJet(String jetName, String jetModel, int speed, double range, double cost) {
		super(jetName, jetModel, speed, range, cost);

	}

	@Override
	public String fly() {
		double time = range / speed;
		double newTime = Math.round(time * 100) / 100.0;
		return "The " + jetModel + " jet can fly for " + newTime + " hours.";
	}

}
