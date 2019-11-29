package gummaluru.unit2;

import java.util.Scanner;
/**
 * DigitsDisplay.java <br> This program displays each digit of your number separately. 
 * Fri, Nov 1st
 * @author Chandana Gummaluru
 */

public class DigitsDisplay {
	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		//Prompts the user to enter in any positive number.
		System.out.println("Enter a non-negative integer:");
		
		//Variable declarations.
		int number = sc.nextInt();
		int mod = 1000;
		int div = 100;
		int digits = number;
		int counter = 0;
		
		//Allows the program to print out each number separately.
		do {
			number = digits%mod/div;
			System.out.println(number);
			mod = mod/10;
			div = div/10;
			counter += 1;
		
		}while (counter < 3);

	}
}
