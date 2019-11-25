package gummaluru.unit2;

import java.util.Scanner;

public class PowersTable {
	/**
	 * This program displays a table of powers.
	 * Tues, Nov 12th, 2019
	 * @author Chandana Gummaluru
	 */	

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Variable declarations...
		int row = 6;
		int column = 5;
		int format;
		int counter = 1;
		
		//This displays the header of the exponents.
		for(int y=1; y<=column; y++)			
		{
			System.out.format("%-8s","x^" + y);
		}
		System.out.println();
		
		
		//Displays the table of powers up to the exponent of 5 and base of 6.
		for(int i=1; i<=row; i++) {	
			for(int y=1; y<=column; y++)			
			{
				System.out.format("%-8s",(int)Math.pow(i, y));
			}
			System.out.println();	
		}
		
		//Bonus
		
		//Prompts the user to enter a value for the highest base.
		System.out.println("Enter a value for the base:");
		int column2 = sc.nextInt();
		
		//Prompts the user to enter a value for the highest exponent.
		System.out.println("Enter a value for the exponent:");
		int row2 = sc.nextInt();
		
		//Displays the header of the exponents.
		for(int y=1; y<=row2; y++)			
		{
			System.out.format("%8s","x^" + y);
		}
		System.out.println();
		
		//Displays the table of powers up to the given exponent.
		for(int i=1; i<=column2; i++) {	
			for(int y=1; y<=row2; y++)			
			{
				System.out.format("%8s",(int)Math.pow(i, y));
			}
			System.out.println();	
		}
		
	}
}
