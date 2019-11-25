package gummaluru.unit1;

import java.util.Scanner;

/**
 * Tues, Sept 24th, 2019
 * @author Chandana Gummaluru
 * Calculates the height of an object using a time under 4.5 seconds 
   with the equation h = 100 - 2.9 * t^2 where t is the time in seconds. 
 */
public class ObjectHeight {
	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a time less than 4.5 seconds.");
		double t = sc.nextDouble();
		double h;
		h = 100 - 2.9*t*t;
		System.out.println("The height of the object in meters is:" + h);

	}

}
