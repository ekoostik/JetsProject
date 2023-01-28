package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {
	private List<Jet> jets = new ArrayList<>();

	private String fileName = "jets.txt";

	public List<Jet> jets() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetList = line.split(",");
				String jetName = jetList[0];
				String jetModel = jetList[1];
				int speed = Integer.parseInt(jetList[2]);
				double range = Double.parseDouble(jetList[3]);
				double cost = Double.parseDouble(jetList[4]);
				Jet a = null;
				if (jetName.equalsIgnoreCase("CargoJet")) {
					a = new CargoJet(jetName, jetModel, speed, range, cost);

				} else if (jetName.equalsIgnoreCase("FighterJet")) {
					a = new FighterJet(jetName, jetModel, speed, range, cost);

				} else if (jetName.equalsIgnoreCase("SpyJet")) {
					a = new SpyJet(jetName, jetModel, speed, range, cost);

				}

				jets.add(a);
//				System.out.println(a);
			}

		} catch (

		IOException e) {
			System.err.println(e);
		}
//		System.out.println(jets);
		return jets;
	}

	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet.toString());
		}
	}

	public void flyJets() {
		for (Jet jet : jets) {
			System.out.println(jet.fly());
		}
	}

	public void fastest() {
		Jet fastest = jets.get(0);
		for (Jet jet : jets) {
			if (fastest.getSpeed() < jet.getSpeed()) {
				fastest = (jet);

			}
		}
		System.out.println("The fastest Jet is: " + fastest);
	}
	
	public void longestRange() {
		Jet longest = jets.get(0);
		for (Jet jet : jets) {
			if(longest.getRange()<jet.getRange()) {
				longest =(jet);
			}
		}
		System.out.println("The jet with the longest range is: " + longest);
	}
}
