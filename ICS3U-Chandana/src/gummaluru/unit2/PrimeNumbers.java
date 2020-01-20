package gummaluru.unit2;

import java.util.Scanner;

/**
 * This program determines if the number is prime or not.
 * Mon, Oct 4th, 2019
 * @author Chandana Gummaluru
 */
public class PrimeNumbers {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//Part 1 

		//Prompts user to enter a number.
		System.out.println("Enter a number:");

		//Variables...
		int num = sc.nextInt();
		int div = 2;
		int num2;
		boolean prime = true;

		//Determines the remainder of the given number after divided by 2.
		while(div<num)
		{
			num2 = num%div;	
			div ++;
			if (num2 == 0)
			{
				prime = false;
				break;
			}
		}
		//Prints "Not prime!" if the number is divisible by numbers other than itself or 1.
		if (!prime)
		{
			System.out.println("Not prime!");
		}
		//Prints "Prime!" if the number is only divisible itself and 1.
		else
		{
			System.out.println("Prime!");
		}

		//Bonus
		System.out.println("Enter a number:");
		System.out.println("Enter a second number:");
		int firstNum = sc.nextInt();
		int secondNum  = sc.nextInt();
		int divisor = 2;

		while(divisor<firstNum || divisor<firstNum)
		{

		}


	}
}

