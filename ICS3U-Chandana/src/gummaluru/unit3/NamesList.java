package gummaluru.unit3;
import java.util.Scanner;
public class NamesList {
	/**
	 * This program prints list of names forwards and reverse
	 * Fri, Nov 22nd, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter how many names they would like on the list.
		System.out.println("How many names would you like to print?");
		
		//Declares the variable, numNames, as the value the user inputed for the number of names.
		int numNames = sc.nextInt(); 
		String[] names = new String[numNames];
		
		System.out.println("Enter the " +numNames+ " names one by one.");
		for(int i = 0; i<numNames; i++) {
			names[i] = sc.next();
		}
		for(int i = 0; i<numNames; i++) {
			System.out.println(names[i]);
		}
		
		for(int i = numNames-1; i>=0; i--) {
			System.out.println(names[i]);
		}
			sc.close();	

	}
}
