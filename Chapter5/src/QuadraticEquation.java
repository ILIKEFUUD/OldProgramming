import java.util.Scanner;
/*
 * Rahul Shah
 * PD2
 * 12/5/13
 * QuadraticEquation.java
 * This program can tell you the value of x when a value is put into the quadratic formula
 */


public class QuadraticEquation {

	
	public static void main(String[] args) {
		//variables
		double a,b,c,discriminant,rootOne, rootTwo;
		Scanner keyboard = new Scanner(System.in);
		
		//input
		System.out.println("a = ");
		a = keyboard.nextDouble();
		
		System.out.println("b = ");
		b = keyboard.nextDouble();
		
		System.out.println("c = ");
		c = keyboard.nextDouble();
		
		//calculating
		
		discriminant = ((b * b)- (4 * a * c));
		
		
		rootOne = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
		
		
		rootTwo = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
		
		//output
		
		if (discriminant < 0){
			System.out.println("This equation has no roots");
		}
		else if (discriminant == 0){
			System.out.println("The equation has one root");
			System.out.println("The root is " + rootOne);
		}
		else {
			System.out.println("This equation has two roots");
			System.out.println("The roots are " + rootOne + " and " + rootTwo);
		}
		
		
		
	}//end of main

}//end of QuadraticEquation
