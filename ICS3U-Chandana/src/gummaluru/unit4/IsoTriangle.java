package gummaluru.unit4;

import java.util.Scanner;

public class IsoTriangle {
	/**
	 * Tues, Dec 17th, 2019
	 * @author Chandana Gummaluru
	 */	

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What size do you want for your isosceles triangle?");
		int lineNum = sc.nextInt();
		
		drawSpaces(lineNum);
		drawStars(lineNum);
	}

	public static void drawSpaces(int num){
		for(int n=1; n<num; n++) {
		System.out.println("*");	
		}
	
	}

	public static void drawStars(int stars){
		for (int n=1; n<=stars; n++) {
			System.out.print("*");
		}
	
	}
	
}
