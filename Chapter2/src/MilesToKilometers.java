import java.util.Scanner;

/*
 * Rahul Shah
 * Pd6
 * 9/4/14
 * MilesToKilometers
 * Reads in a value in miles from the user and converts it into kilometers and displays
 * it to the user.
 */

public class MilesToKilometers {

	
	public static void main(String[] args) {
		
		//variables
		Scanner scan = new Scanner (System.in);
		final double CONVERSION_FACTOR = 1.60935;
		double miles, kilometers;
		
		//read in
		System.out.println("Enter a mile value to convert to kilometers:");
		miles = scan.nextDouble();
		
		//convert
		kilometers = CONVERSION_FACTOR * miles;
		
		//display
		System.out.println("The length in kilometers is: " + kilometers + " kilometers.");
		
		String s1 = "Meghan Trainor";
		System.out.println( s1.substring (2,5)) ; 
		

	}//end of main

}//end of MilesToKilometers
