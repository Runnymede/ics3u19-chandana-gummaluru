package gummaluru.unit2;

public class PrintEven {
	/**
	 * This program prints all the even numbers between 1 and 100.
	 * Tues, Nov 12th, 2019
	 * @author Chandana Gummaluru
	 */	

	public static void main(String[]args) {
		for (int i=2; i<100; i++)
		{
			//Finds the remainder of the number after it's divided by 2, to see if it's even or not.
			int even = i%2;
			if (even==0)
			{
				//Prints the number if it is even.
				System.out.println(i);
			}
		}

	}
}

