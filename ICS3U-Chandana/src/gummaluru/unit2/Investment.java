package gummaluru.unit2;

import java.util.Scanner;

public class Investment {
	/**
	 * This programs tells how many years it will take for the investment to be worth $5000.
	 * Thurs, Nov 14th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);

		double investment = 2500;
		int year = 0;

		do {
			investment = investment * 1.075;
			year = year + 1;

		}while (investment<5000);
		System.out.println("It will take " + year + " years for the investment to be worth $5000.");
	}
}