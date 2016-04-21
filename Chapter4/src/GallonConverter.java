import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/8/13
 * GallonConverter.java v1.0
 * This application prompts the user for an amount in gallons and displays the
 * number of quarts, pints, cups, and tablespoons. 
 */



public class GallonConverter {

	
	public static void main(String[] args) {
		
		//variables
		double gallons, quarts, pints, cups, tableSpoons;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter the number of gallons");
		gallons = scan.nextDouble();
		
		//calculations
		System.out.println("In " + gallons + " gallons there are: ");
		
		quarts = gallons * 4;
		System.out.println(quarts + " quarts");
		
		pints = gallons * 8;
		System.out.println(pints + " pints");
		
		cups = gallons * 16;
		System.out.println(cups + " cups");
		
		tableSpoons = gallons * 256;
		System.out.println(tableSpoons + " tablespoons");
		

	}//end of main

}//end of GallonConverter
