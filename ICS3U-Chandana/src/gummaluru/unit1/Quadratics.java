package gummaluru.unit1;

import java.util.Scanner;
/**
 * Tues, Oct 1st, 2019
 * @author Chandana Gummaluru
 * Using the quadratic formula, this program displays the roots with the given values. 
 */

public class Quadratics {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value for a:");
		double a = sc.nextInt();
		System.out.println("Please enter a value for b:");
		double b = sc.nextDouble();
		System.out.println("Please enter a value for c:");
		double c = sc.nextDouble();
		double x;
		x = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("The first root is " + x);
		double y; 
		y = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("The second root is " + y);
	}
}
