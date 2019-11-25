package gummaluru.unit2;

import java.util.Scanner;
/**
 * DigitsDisplay.java <br>
 * Fri, Nov 1st
 * @author Chandana Gummaluru
 */

public class DigitsDisplay {
	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a non-negative integer:");
		int number = sc.nextInt();
		int mod = 1000;
		int div = 100;
		int digits = number;
		int counter = 0;
		
		do {
			number = digits%mod/div;
			System.out.println(number);
			mod = mod/10;
			div = div/10;
			counter += 1;
		
		}while (counter < 3);

	}
}
