import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/25/13
 * Delivery.java
 * Application that tells if a package is too large.
 */


public class Delivery {

	
	public static void main(String[] args) {
		
		//variables
		int height, width, length;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter a length :");
		length = scan.nextInt();
		
		System.out.println("Enter a width: ");
		width = scan.nextInt();
		
		System.out.println("Enter a heigth: ");
		height = scan.nextInt();
		
		if (length > 10 || width > 10 || height > 10){
			System.out.println("Reject");
		}
		else{
			System.out.println("Accept");
		}

	}//end of main

}//end of Delivery
