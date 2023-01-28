package com.skilldistillery.entities;

public class SpyJet extends Jet {

	public SpyJet(String jetName, String jetModel, int speed, double range, double cost) {
		super(jetName, jetModel, speed, range, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fly() {

		double time = range / speed;
		double newTime = Math.round(time * 100) / 100.0;
		return "The " + jetModel + " Spyjet can fly for " + newTime + " hours.";
	}

}