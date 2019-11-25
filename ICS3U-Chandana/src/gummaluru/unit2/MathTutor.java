package gummaluru.unit2;

import java.util.Scanner;
/**
 * MathTutor.java <br>
 * Fri, Oct 24rd, 2019
 * @author Chandana Gummaluru
 */
public class MathTutor {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);

		//variable assignments.
		double num1 = (int)(Math.random() * 10) + 1;
		double num2 = (int)(Math.random() * 10) + 1;
		int operator = (int)(Math.random()* 4) + 1;
		double guess = 0;
		double answer = 0;
		
		//prompts user to give an answer for an addition expression.
		if (operator == 1)
		{
			System.out.println("What is " + num1 + " + " + num2 + "?");
			answer = num1 + num2;	
			guess = sc.nextDouble();
		}
		
		//prompts user to give an answer for a subtraction expression.
		else if (operator == 2)
		{
			System.out.println("What is " + num1 + " - " + num2 + "?");
			answer = num1 - num2;
			guess = sc.nextDouble();
		}
		
		//prompts user to give an answer for a multiplication expression.
		else if (operator == 3)
		{
			System.out.println("What is " + num1 + "*" + num2 + "?");
			answer = num1*num2;
			guess = sc.nextDouble();
		}
		
		//prompts the user to give an answer for a division expression.
		else if (operator == 4)
		{
			System.out.println("What is " + num1 + "/" + num2 + "?");
			answer = num1/num2;
			guess = sc.nextDouble();
		}
		
		//Prints "Correct!" if the guess is the same as the answer. 
		if (guess == answer)
		{
			System.out.println("Correct!");
		}
		
		//Prints "Wrong!" if the guess is not the same as the answer.
		else
		{
			System.out.println("Wrong!");
		}	
	}
}

