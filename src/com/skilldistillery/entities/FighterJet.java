package com.skilldistillery.entities;

public class FighterJet extends Jet implements Combat {

	public FighterJet(String jetName, String jetModel, int speed, double range, double cost) {
		super(jetName, jetModel, speed, range, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fly() {
		double time = range / speed;
		double newTime = Math.round(time * 100) / 100.0;
		return "The " + jetModel + " fighter jet can fly for " + newTime + " hours.";
	}

	@Override
	public void dogFight() {
		System.out.println(jetModel + " is in a dogfight !! ");

	}

}
