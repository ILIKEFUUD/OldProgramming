import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 1/28/14
 * Factorial v1.0
 * prompts the user for a number and then displays its factorial.
 */
public class Factorial {

	
	public static void main(String[] args) {
		//variables
		int num;
		
		int factorial = 1;
		Scanner scan = new Scanner (System.in);
		
		//output
		System.out.println("Enter a number");
		
		
		for(num = scan.nextInt(); num >= 1; num --){
			factorial *= num;
		}
		System.out.println("Factorial of" + num + " is " + factorial);
	
		

	}

}
