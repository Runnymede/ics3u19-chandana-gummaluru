package gummaluru.unit2;

import java.util.Scanner;

/**
 * Tues, Oct 15th, 2019
 * @author Chandana Gummaluru
 */
public class PackageCheck {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//prompts user to input the weight of package and then scans the value.
		System.out.println("Enter the package weight in kg:");
		double weight = sc.nextInt();
		
		//prompts user to input the dimensions of package and then scans the values.
		System.out.println("Enter the height in cm:");
		double height = sc.nextInt();
		System.out.println("Enter the width cm:");
		double width = sc.nextInt();
		System.out.println("Enter the length cm:");
		double length = sc.nextInt();
		
		//determines the volume of the package using the given dimensions.
		double volume = height*width*length;
		
		//determines if the weight of the package is over 27kg 
		//and if the volume is greater than 100000 cubic centimeters.	
		if (weight>27 && volume<=100000)
		{
			System.out.println("Too heavy.");
		}
		else if (weight>27 && volume>100000)
		{
			System.out.println("Too heavy and too large.");
		}
		else if (volume>100000 && weight<28)
		{
			System.out.println("Too large");
		}
		else 
		{
			System.out.println("Accepted.");
		}
		
		
		
		
	}
}
