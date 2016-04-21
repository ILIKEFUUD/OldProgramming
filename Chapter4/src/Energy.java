import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/7/13
 * Energy.java v1.0
 * This application determines the amount of energy released from an object with a certain
 * mass and how many 100-watt lightbulbs that energy can power.
 */



public class Energy {

	
	public static void main(String[] args) {
		
		//variables
		double mass, energy,bulbs;
		final double LIGHT = 3.0E8;
		final double JOULES = 3.6E5;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter the mass in Kilograms: ");
		mass = scan.nextDouble();
		
		//calculations and output
		energy = mass * LIGHT * LIGHT;
		System.out.println("The amount of energy released in Joules: " + energy);
		
		bulbs = energy / JOULES;
		System.out.println("Amount of 100-watt lightbulbs that can be powered: " + bulbs);
		

	}//end of main

}//end of Energy
