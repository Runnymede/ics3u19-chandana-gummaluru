package gummaluru.unit2;
import java.util.Scanner;

public class CubesSum {
	/**
	 * This program prints out the sum of the cube(s) of the digit(s).
	 * Fri, Nov 1st, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter a non-negative integer.
		System.out.println("Enter a non-negative integer:");
		
		//Variable declarations.
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
		
		//Prints out the sum of the cube if the counter is less than 3.
		}while (counter < 3);
		System.out.println("The sum of the cube(s) of your digit(s) is: " + sum);

	}
}