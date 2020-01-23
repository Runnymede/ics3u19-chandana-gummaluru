package gummaluru.unit4;

import java.util.Arrays;
import java.util.Scanner;

public class MathPlus {
	/**
	 * Mon, Jan 6th, 2020
	 * @author Chandana Gummaluru
	 * @return 
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		double []myArray = {2,4,2,7,8,2,8,5,3,4,2,2};

		//Asks the user to enter how many numbers they want in the array.
		System.out.println("How many numbers would you like in your array?");

		//Saves the user's input in a variable named arrayNum.
		int arrayNum = sc.nextInt();

		//Creates a new array with the given indices. 
		int[] array = new int[arrayNum];
		double[]array2 = new double [arrayNum];


		//Asks the user to enter values for each index.
		System.out.println("Enter the " +arrayNum+ " index values one by one.");
		for(int i = 0; i<arrayNum; i++) {
			array[i] = sc.nextInt();
			array2[i]= array[i];
		}
		
		//prints out the minimum number of the array.
		int small = min(array);
		System.out.println("The smallest number is at index: " + small);
		
		//prints out the maximum number of the array.
		int big = max(array);
		System.out.println("The biggst number is at index: " + big);
		
		//prints out the sum of the array.
		int sum = sum(array);
		System.out.println("The sum of all the numbers is: " + sum);
		
		//prints out the average of the array.
		double average = average(array);
		System.out.println("The average of all the numbers is: " +average);
		
		//prints out the median of the array.
		double median = median(array2);
		System.out.println("The median of all the numbers is: " +median);

		//prints out the mode of the array.
		double m = mode(myArray);
		System.out.println("The mode of all the numbers is: " +m);
		
		//prints whether or not the number is prime.
		System.out.println("Enter a number to determine if it is prime:");
		int checkPrime = sc.nextInt();
		boolean p = prime(checkPrime);


		//Prints "Not prime!" if the number is divisible by numbers other than itself or 1.
		if (!p)
		{
			System.out.println("Not prime!");
		}
		//Prints "Prime!" if the number is only divisible itself and 1.
		else
		{
			System.out.println("Prime!");
		}

		System.out.println("Enter a number to find it's factorial:");
		//prints out the factorial of the number.
		int facNum = sc.nextInt();
		long fac = factorial(facNum);
		System.out.println("The factorial is " + fac);

		System.out.println("Enter a number to find the number of factors it has:");
		int findFacNum = sc.nextInt();
		//prints out the number of factors for the number.
		int numFactors = numOfFactors(findFacNum);
		System.out.println("There are " + numFactors + " factors for your number");
		
		System.out.println("Enter a number to find the values of it's factors");
		int num = sc.nextInt();
		
		//prints out the factors of the number.
		System.out.println("The factors are ");
		int []facs = factors(num);
		for (int i=0; i<facs.length; i++) {
			System.out.print(facs[i] + ",");
		}

	}

	/**
	 * This method determines the lowest number value in the array.	
	 * @param smallestNum
	 * @return the smallest number value in the array.
	 */
	public static int min(int[]smallestNum){
		int smallestIndex = 0;
		for(int i=0; i<smallestNum.length; i++) {

			if(smallestNum[i]<smallestNum[smallestIndex]) {
				smallestIndex=i;
			}		
		}
		//Sends the smallIndex to the main method.
		return smallestIndex;
	}

	/**
	 * This method determines the highest number value in the array.
	 * @param biggestNum
	 * @return the biggest number value in the array.
	 */
	public static int max(int[]biggestNum){
		int biggestIndex = 0;
		for(int i=0; i<biggestNum.length; i++) {

			if(biggestNum[i]>biggestNum[biggestIndex]) {
				biggestIndex=i;
			}		
		}
		//Sends the biggestIndex to the main method.
		return biggestIndex;
	}

	/**
	 * This method determines the sum of all the values in the array.
	 * @param sumNum
	 * @return the sum of all the values in the array. 
	 */
	public static int sum(int[]sumNum){
		int indexSum = sumNum[0];
		for(int i=1; i<sumNum.length; i++) {
			indexSum = indexSum + sumNum[i];
		}
		//Sends the indexSum to the main method.
		return indexSum;
	}
	/**
	 * This method finds the average.
	 * @param avNum
	 * @return av - the average of all the values in the array.
	 */
	public static double average(int[]avNum){
		int indexAv = avNum[0];
		for(int i=1; i<avNum.length; i++) {
			indexAv = indexAv + avNum[i];
		}
		int av = indexAv/avNum.length;

		//Sends the av to the main method.
		return av;
	}

	/**
	 * This method finds the minimum value.
	 * @param smallestNum
	 * @return smallestIndex - the minimum value
	 */
	public static int min(double[]smallestNum){
		int smallestIndex = 0;
		for(int i=0; i<smallestNum.length; i++) {

			if(smallestNum[i]<smallestNum[smallestIndex]) {
				smallestIndex=i;
			}		
		}
		//Sends the smallIndex to the main method.
		return smallestIndex;
	}
	/**
	 * This method finds the maximum value.
	 * @param biggestNum
	 * @return biggestIndex - the maximum value.
	 */
	public static int max(double[]biggestNum){
		int biggestIndex = 0;
		for(int i=0; i<biggestNum.length; i++) {

			if(biggestNum[i]>biggestNum[biggestIndex]) {
				biggestIndex=i;
			}		
		}
		//Sends the biggestIndex to the main method.
		return biggestIndex;
	}
	/**
	 * This method finds the sum.
	 * @param sumNum
	 * @return indexSum - the sum.
	 */
	public static double sum(double[]sumNum){
		double indexSum = sumNum[0];
		for(int i=1; i<sumNum.length; i++) {
			indexSum = indexSum + sumNum[i];
		}
		//Sends the indexSum to the main method.
		return indexSum;
	}
	/**
	 * This method finds the average.
	 * @param avNum
	 * @return av - the average.
	 */
	public static double average(double[]avNum){
		double indexAv = avNum[0];
		for(int i=1; i<avNum.length; i++) {
			indexAv = indexAv + avNum[i];
		}
		double av = indexAv/avNum.length;

		//Sends the av to the main method.
		return av;
	}
	/**
	 * This method finds the median.
	 * @param medNum
	 * @return num - median if the list of numbers in the array is odd.
	 * @return median = median if the list of numbers in the array is even.
	 */
	public static double median(double[]medNum){

		//Sorts the array values in order from smallest to greatest.
		Arrays.sort(medNum);

		//If it's an odd number, it has one median value.
		if (medNum.length%2 != 0) {
			int med = medNum.length/2;
			double num = medNum[med];
			return num;

		}
		else {
			int med = medNum.length/2;
			int med2 = med-1;
			double num = medNum[med];
			double num2 = medNum[med2];
			double median = (num+num2)/2;

			return median;
		}
	}
	/**
	 * This method finds the mode.
	 * @param modeNum
	 * @return mostOccur - the mode.
	 */
	public static double mode(double[]modeNum) {
		double mostOccur = 0;
		//goes through the entire array to find the most occurring number.
		for (int a=0; a<modeNum.length; a++) {
			int counter1 = 0;
			for (int b=0; b<a; b++) {	

				if (modeNum[a]==modeNum[b]) {
					int counter2 = counter1;
					if (counter2 > counter1) {
						mostOccur = modeNum[a];
					}
				}
			}
		}

		return mostOccur;

	}
	/**
	 * This method determines if the number is prime or not prime.
	 * @param checkPrime
	 * @return prime2 - true or false.
	 */
	public static boolean prime(int checkPrime) {
		//Variables...
		int div = 2;
		int num2;
		boolean prime2 = true;

		//Determines the remainder of the given number after divided by 2.
		while(div<checkPrime)
		{
			num2 = checkPrime%div;	
			div ++;
			if (num2 == 0)
			{
				prime2 = false;
				break;

			}

		}
		return prime2;
	}
	/**
	 * This method finds the factorial 
	 * @param facNum
	 * @return
	 */
	public static long factorial(int facNum) {
		long num = facNum;
		//multiplies the number by all numbers lower than it.
		for (int nextNum = facNum-1; nextNum>1; nextNum--) {
			num = nextNum*num;
		}
		return num;
	}
	/**
	 * This method finds the number of factors for the number.
	 * @param findFacNum
	 * @return counter - the number of factors.
	 */
	public static int numOfFactors(int findFacNum) {
		int counter = 0;
		int end = findFacNum;
		int end2 = (int)Math.rint(end);
		for (int i = 1; i<=end2; i++) {
			double find = findFacNum%i;
			if (find == 0) {
				counter++;
			}

		}
		return counter;	
	}
	/**
	 * This method finds the factors of the number.
	 * @param findFactors
	 * @return factors2 - the factors of the number.
	 */
	public static int[] factors (int findFactors) {
		int counter = 0;
		int counter2 = 0;
		int end = findFactors;
		int end2 = end;
		for (int i=1; i<=end2; i++) {
			double find = findFactors%i;
			if (find==0) {
				counter++;
			}
		}
		
		int[] factors2 = new int[counter];
		
		for(int i =1; i<=end2; i++) {
			double find = findFactors%i;
			if(find==0) {
				factors2[counter2]=i;
				counter2++;
			}
			
		}
		return factors2;
		
	}

}



