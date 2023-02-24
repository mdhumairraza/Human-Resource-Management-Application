package com.humair.ui;

import java.util.Scanner;

import com.humair.CustomColour.ConsoleColors;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static void call(){
		
		System.out.println();
	    System.out.println(ConsoleColors.WHITE_BACKGROUND +"-----------------------------|");
		System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action||");
		System.out.println(ConsoleColors.GREEN_BOLD+"-----------------------------|");
		
		System.out.println("+----------------------------+" + "\n" + "| 1. Login As Admin          |" + "\n"
				+ "| 2. Login As Employee       |" + "\n" + "| 3. Quit App.		     |" + "\n"
				+ "+----------------------------+"+ConsoleColors.RESET);
		System.out.println(" ");
				
		int choice = 0;
		try {
			choice = Integer.parseInt(sc.next());
		} catch (Exception e) {

			System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"Your Choice must be a number");
		}

		if (choice == 1) {
			AdminUi.adminSide(sc);
		} else if (choice == 2) {
			EmployeeUi.employeeSide(sc);
		} else if (choice == 3) {
			System.out.println();
			System.out.println("-------------------------| Closed |-------------------------");
			System.out.println();
			System.exit(0);
		} else if (choice < 1 || choice > 3) {
			System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"Please choose a number from the options below");
			call();
		} else {
			System.out.println("Input type should be number");
		}
		

	}
	
	public static void main(String[] args) {
		call();
		sc.close();
	}
}
