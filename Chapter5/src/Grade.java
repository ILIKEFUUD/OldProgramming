import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/26/13
 * Grade.java
 * This application tells the grade for the percent given by the user
 */


public class Grade {

	
	public static void main(String[] args) {
		
		//variables
		int percent;
		Scanner scan = new Scanner (System.in);
		
		
		
		//input
		System.out.println("Enter a percentage: ");
		percent = scan.nextInt();
		
		//output
		if (percent == 100 || percent >= 90){
			System.out.println("You got an A");
		}
		else if (percent < 90 && percent >= 80){
			System.out.println("You got a B");
		}
		else if (percent < 80 && percent >= 70){
			System.out.println("You got a C");
		}
		else if (percent < 70 && percent >= 60){
			System.out.println("You got a D");
			
		}
		else {
			System.out.println("You got an F!");
		}

	}

}
