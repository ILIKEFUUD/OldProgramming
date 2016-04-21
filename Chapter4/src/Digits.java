import java.util.Scanner;
/*
 * Rahul Shah
 * 10/29/13
 * PD 2
 * Digits.java v1.0
 * This application prompts the user for a two digit number and reads it in  
 * and displays the ones place and the tens place digits separately.
 */


public class Digits {
	public static void main  (String [] args){
		
		//variables
		Scanner keyboard = new Scanner (System.in);
		int number;
		int ones, tens;
		
		//input
		System.out.print("Type in a 2 digit number : ");
		number =  keyboard.nextInt();
		
		ones = number % 10;                                                                     
		tens = number/10;
		
		//shortcut for System.out.println
		
		System.out.println("Ones: " + ones);
		System.out.println("Tens: " + tens);
		
		
		
		
		
	}//end of main
}//end of Digits