package gummaluru.unit1;

import java.util.Scanner;
/**
 * Digits.java <br>
 * Mon, Sept 30th, 2019
 * @author Chandana Gummaluru
 * Displays the hundreds, tens, and ones place value of a given number. 
 */

public class Digits {
	public static void main (String[]args) {

		System.out.println("Enter a three-digit number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h;
		h = n/100;
		System.out.println("Hundreds:" + h);
		int t;
		t = n%100/10;
		System.out.println("Tens:" + t);
		int o;
		o = n%10;
		System.out.println("Ones:" + o);

	}
}