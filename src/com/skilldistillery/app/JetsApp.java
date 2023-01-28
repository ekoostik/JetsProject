package com.skilldistillery.app;

import java.util.Scanner;

import com.skilldistillery.entities.Airfield;

public class JetsApp {
	protected Airfield field = new Airfield();
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		JetsApp ja = new JetsApp();
		ja.launch();
	}

	public void launch() {

		field.jets();
		userMenu();
	}

	public void userMenu() {

//		boolean go = true;
//
//		do {
		System.out.println("Please select a menu option 1-10:\n" + "1. List fleet of jets \n" + "2. Fly all jets \n"
				+ "3. View fastest jet \n" + "4. View jet with the longest range \n" + "5. Load cargo jet \n"
				+ "6. Fight \n" + "7. Create your own jet \n" + "8. Remove jet from fleet \n" + "9. Quit ");

		int userIn = sc.nextInt();
		switch (userIn) {

		case (1):
			field.listFleet();
			break;

		case (2):
			field.flyJets();
			break;

			case (3):
				field.fastest();
				break;

			case (4):
				field.longestRange();
				break;
//
//			case (5):
//				loadCargo();
//				break;
//
//			case (6):
//				fight();
//				break;
//
//			case (7):
//				makeJet();
//				break;
//
//			case (8):
//				removeJet();
//				break;

		case (9):
			System.out.println("Goodbye");
//				go = false;
			break;
		}
//			default:
//				continue;
//
//			}
//
//		} while (go == true);
//		return;
	}

}
