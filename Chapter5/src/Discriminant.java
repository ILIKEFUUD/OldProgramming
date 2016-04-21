import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/20/13
 * 
 * Discriminant.java v1.0
 * This application shows the number of roots of a discriminant
 */


public class Discriminant {

	
	public static void main(String[] args) {
		
		//variables
		int a, b, c;
		double discriminant;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter the value of a: ");
		a = scan.nextInt();
		
		System.out.println("Enter value of b: ");
		b = scan.nextInt();
		
		System.out.println("Enter value of c: ");
		c = scan.nextInt();
		
		//calculations
		
		discriminant = (b * b) - (4 * a * c);
		
		if (discriminant < 0){
			System.out.println("No real roots");
		}else if (discriminant == 0){
			System.out.println("One real root");
		}else{
			System.out.println("Two real roots");
		}
		
		
		
		
	}//end of main

}//end of discriminant
