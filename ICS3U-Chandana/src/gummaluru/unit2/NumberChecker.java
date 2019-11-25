package gummaluru.unit2;

import java.util.Scanner;

public class NumberChecker {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main (String[]args) {
		/**
		 * This is the entry point to the program
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer");

		//Declarations are here...
		int number = sc.nextInt();
		int remainder;

		//Determines if number is positive or negative.
		if (number >=0)

		{
			System.out.println("Your number is positive.");
		}
		else
		{
			System.out.println("Your number is negative.");
		}

		remainder = number%7;
		//Determines if number is divisible by 7.
		if (number == 0)
		{
			System.out.println("It's also divisible by 7.");
		}
		else
		{
			System.out.println("It's also not divisible by 7.");
		}

	}

}
