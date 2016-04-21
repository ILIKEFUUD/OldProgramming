import java.util.Scanner;

/*
 * Rahul Shah
 * 11/5/13
 * PD 2
 * PizzaCost.java v 1.0
 * 
 * This program calculates the cost of a pizza based on the size of it.
 */



public class PizzaCost {

	
	public static void main(String[] args) {
		
		//variables
		double diameter, cost;
		
		final double LABOR = 0.75;
		final double RENT = 1.00;
		
		Scanner scan = new Scanner (System.in);
		
		//input
		
		System.out.println("Enter the diameter of pizza in inches: ");
		diameter = scan.nextDouble();
		
		//calculations
		
		cost = (0.05 * diameter * diameter) + RENT + LABOR;
		
		System.out.println("The cost of making the pizza is $" + cost);
		
		

	}//end of main

}//end of PizzaCost
