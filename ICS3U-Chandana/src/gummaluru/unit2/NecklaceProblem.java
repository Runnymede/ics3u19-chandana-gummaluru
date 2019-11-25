package gummaluru.unit2;

import java.util.Scanner;

public class NecklaceProblem {
	/**
	 *This program begins with two single-digit numbers. 
	 * Mon, Oct 4th, 2019
	 * @author Chandana Gummaluru
	 */	

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Variable declarations...
		int firstNum;
		int secondNum;
		int a = 0;
		int b = 0;
		int sum = 0;
		
		//Prompts user to enter a digit.
		System.out.println("Enter a single-digit number:");
		a = sc.nextInt();
		firstNum = a;
		
		//Prompts user to enter another digit.
		System.out.println("Enter a second single-digit number:");
		b = sc.nextInt();
		secondNum = b;

		do
		{
			sum = firstNum + secondNum;
			firstNum = secondNum;
			sum = sum%10;
			System.out.println(sum);
			secondNum = sum;				
		} 
		while(firstNum!=a || secondNum!=b);

	}
}
