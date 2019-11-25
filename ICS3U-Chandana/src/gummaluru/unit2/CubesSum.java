package gummaluru.unit2;
import java.util.Scanner;

public class CubesSum {
	/**
	 * This program counts down from 10 to 1, then displays "Blast off!"
	 * Fri, Nov 1st, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter a non-negative integer.
		System.out.println("Enter a non-negative integer:");
		
		
		int number = sc.nextInt();
		int mod = 1000;
		int div = 100;
		int digits = number;
		int counter = 0;
		int sum  = 0;
		
		do {
			number = digits%mod/div;
			number = (int)Math.pow(number, 3);
			mod = mod/10;
			div = div/10;
			counter += 1;
			sum = sum+number;
		
		}while (counter < 3);
		System.out.println("The sum of the digits is: " + sum);

	}
}