import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 12/4/13
 * Eggs.java
 * Application that prompts the user for the number of eggs, and then calculates the bill
 */
public class Eggs {

	
	public static void main(String[] args) {
		
		//variables
		Scanner scan = new Scanner (System.in);
		int eggs, dozen, extra;
		
		//input
		System.out.println("Enter amount of eggs: ");
		eggs = scan.nextInt();
		dozen = eggs / 12;
		extra = eggs % 12;
		
		//determining price
		if (dozen >= 0 && dozen < 4){
			System.out.println("The bill is equal to: " + ((dozen * 0.5) + (extra * (0.5/12))));
		}
		else if (dozen >= 4 && dozen < 6){
			System.out.println("The bill is equal to: " + ((dozen * 0.45) + (extra * (0.5/12))));
		}
		else if (dozen >= 6 && dozen < 11){
			System.out.println("The bill is equal to: " + ((dozen * 0.4) + (extra * (0.5/12))));
		}
		else {
			System.out.println("The bill is equal to: " + ((dozen * 0.35) + (extra * (0.5/12))));
		}

	}//end of main

}//end of Eggs
