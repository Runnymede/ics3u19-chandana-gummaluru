package gummaluru.unit2;

public class BlastOff {
	/**
	 * This program counts down from 10 to 1, then displays "Blast off!"
	 * Tues, Nov 12th, 2019
	 * @author Chandana Gummaluru
	 * @throws InterruptedException 
	 */	

	public static void main(String[]args) throws InterruptedException {
		
		//Subtracts 1 each time from 10 until it has reached 1.
		for(int i=10; i>=0; i--)
		{	
			System.out.println(i);
			
			//Delays for 1 second between each printed number.
			Thread.sleep(1000);
		}
		//Delays for 1 second before it prints "Blast off!"
		Thread.sleep(1000);
		System.out.println("Blast off!");
	}
}

