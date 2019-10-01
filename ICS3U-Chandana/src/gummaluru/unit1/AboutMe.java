package gummaluru.unit1;
/**
 * Wed, Sept 18th, 2019 
 * @author Chandana Gummaluru
 * This program displays personal info about my name, 
 * my instructor, my school, and an encouraging phrase for my school's team
 */
public class AboutMe {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main (String[]args) {
		System.out.println("Chandana G");
		System.out.println("Ms.Kemp");
		System.out.println("Runnymede C.I.");
		System.out.println("\"LET'S GO RAVENS!\"");

		System.out.format("%-12s %-7s %14s", "Period", "Day 1", "Day 2\n");
		System.out.format("%-12s %-7s %16s", "1", "HSP3U1-01", "HSP3U1-01\n");
		System.out.format("%-12s %-7s %16s", "08:45", "ZZteacher,A", "ZZteacher,A\n");
		System.out.format("%-12s %-7s %12s", "10:02", "103", "103\n\n\n");	
		System.out.format("%-12s %-7s %16s", "2", "PSK4U1-01", "PSK4U1-01\n");
		System.out.format("%-12s %-7s %16s", "10:07", "Kostopoulos,K", "Kostopoulos,K\n");
		System.out.format("%-12s %-7s %16s", "11:24", "205", "205\n\n\n");
		System.out.format("%-12s %-7s %16s", "Lunch", "", "\n");
		System.out.format("%-12s %-7s %16s", "11:24", "", "\n");
		System.out.format("%-12s %-7s %16s", "12:26", "", "\n");
		System.out.format("%-12s %-7s %16s", "3", "ICS3U3-02", "ENG3U1-03\n");
		


	}


}