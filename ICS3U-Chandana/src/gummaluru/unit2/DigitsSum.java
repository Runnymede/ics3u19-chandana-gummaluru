package gummaluru.unit2;

import java.util.Scanner;
/**
 * DigitsSum.java <br> This program displays the sum of each singular digit in the given integer.
 * Fri, Nov 1st
 * @author Chandana Gummaluru
 */
public class DigitsSum {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		//Prompts the user to enter any positive number.
		System.out.println("Enter a non-negative integer:");
		
		//Variable declarations.
		int number = sc.nextInt();
		int mod = 1000;
		int div = 100;
		int digits = number;
		int counter = 0;
		int sum  = 0;
		
		//Adds each digit of the number together.
		do {
			number = digits%mod/div;
			mod = mod/10;
			div = div/10;
			counter += 1;
			sum = sum+number;
		
		//Prints out the sum of the digits.
		}while (counter < 3);
		System.out.println("The sum of the digits is: " + sum);

	}
}

