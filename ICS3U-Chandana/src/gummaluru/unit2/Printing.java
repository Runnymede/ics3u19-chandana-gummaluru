package gummaluru.unit2;

import java.util.Scanner;
/**
 * Displays the price per copy and the total cost of printing a given number of copies.
 * Mon, Oct 7th, 2019
 * @author Chandana Gummaluru
 */
public class Printing {

	public static void main (String[]args) {
		/** 
		 * This is the entry point to the program.
		 * @param args
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("How many copies would you like to print?");

		//Declarations are here...
		int copies = sc.nextInt();
		double copyprice;
		double price;
		
		//Determines the price for each copy and the price for the total copies based on how many copies the user would like.
		if (copies < 100)

		{
			copyprice = 0.30;
			price = copies*0.30;
		}

		else if (copies < 500 )
		{
			copyprice = 0.28;
			price = copies*0.28;
		}

		else if (copies < 749)

		{
			copyprice = 0.27;
			price = copies*0.27;
		}

		else if (copies < 1000)
		{
			copyprice = 0.26;
			price = copies*0.26;
		}

		else if (copies > 1000);

		{
			copyprice = 0.25;
			price = copies*0.25;
		}
		
		//Displays the price per copy.
		System.out.println("Price per copy: $" + copyprice);
		
		//Displays the total price.
		System.out.println("Total price: $" + price);



	}
}
