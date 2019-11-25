package gummaluru.unit2;

import java.util.Scanner;

public class DigitsSum {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a non-negative integer:");
		int number = sc.nextInt();
		int mod = 1000;
		int div = 100;
		int digits = number;
		int counter = 0;
		int sum  = 0;
		
		do {
			number = digits%mod/div;
			mod = mod/10;
			div = div/10;
			counter += 1;
			sum = sum+number;
		
		}while (counter < 3);
		System.out.println("The sum of the digits is: " + sum);

	}
}

