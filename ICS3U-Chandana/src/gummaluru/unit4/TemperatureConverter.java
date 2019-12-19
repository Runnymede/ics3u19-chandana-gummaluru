package gummaluru.unit4;

import java.util.Scanner;

public class TemperatureConverter {
	/**
	 * Thurs, Dec 19th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Asks the user to enter the temperature.
		System.out.println("Enter the temperature:");
		double temp = sc.nextDouble();
		
		//Asks the user to enter the units.
		System.out.println("Enter the units, F for fahrenheit or C for Celsius:");
		String units = sc.next();
		
		//Calls the fahrenheitToCelsius method if the user's input is in fahrenheit.
		if(units.equals("F")) {
			fahrenheitToCelsius(temp);
			double newtemp=temp;
			//Prints out the temperature in celsius.
			System.out.println("Temp in Celsius: " + fahrenheitToCelsius(temp));
		}
		//Calls the CelsiusToFahrenheit method if the user's input is in celsius.
		if(units.equals("C")) {
			celsiusToFahrenheit(temp);
			double newtemp2=temp;
			System.out.println("Temp in Fahrenheit: " + celsiusToFahrenheit(temp));		
		}

	}
	
	public static double fahrenheitToCelsius(double tempInFahrenheit) {
		double temperature = (tempInFahrenheit-32)*5/9;
		return temperature;
	}

	public static double celsiusToFahrenheit(double tempInCelsius) {
		double temperature = tempInCelsius*9/5+32;
		return temperature;
	}

}

