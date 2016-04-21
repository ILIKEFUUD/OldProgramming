/*
 * Rahul Shah
 * 11/5/13
 * PD 2
 * Digits2.java v 1.0
 * 
 * This program can detect the ones, tens, and hundreds place value of a 3 digit number
 */
import java.util.Scanner;

public class Digits2 {

	
	public static void main(String[] args) {
	
		//variables
		int number;
		int ones, tens, hundreds;
		
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter a 3 digit number: ");
		number = scan.nextInt();
		
		//calculations
		
		ones = number % 10;
		tens = (number/10)%10;
		hundreds = number / 100;
		
		System.out.println("Ones: " + ones);
		System.out.println("Tens: " + tens);
		System.out.println("Hundreds: " + hundreds);

	}//end of main

}//end of Digits2
