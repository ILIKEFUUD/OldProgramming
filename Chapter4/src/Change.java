import java.util.Scanner;

/*
 * Rahul Shah
 * 11/6/13
 * PD2
 * Change.java v 1.0
 * 
 * This application prompts the user for an amount less than $1.00 and then displays
the minimum number of coins necessary to make the change.
 */


public class Change {

	
	public static void main(String[] args) {
		
		//variables
		int cents,quarters,dimes,nickels,pennies;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter the change in cents: ");
		cents = scan.nextInt();
		
		//calculations
		
		System.out.println("The minimum number of coins is: ");
		
		quarters = cents/25;
		System.out.println("Quarters: " + quarters);
		
		cents =  cents - (quarters * 25);
		
		dimes = cents/10;
		System.out.println("Dimes:" + dimes);
		
		cents = cents - (dimes * 10);
		
		nickels = cents/5;
		System.out.println("Nickels: "  + nickels);
		
		cents = cents - (nickels * 5);
		
		pennies = cents;
		System.out.println("Pennies: " + pennies);

	}//end of main

}//end of Change
