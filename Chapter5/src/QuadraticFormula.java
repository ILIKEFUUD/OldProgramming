import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/6/13
 * QuadraticFormula.java v1.0
 * This program can tell you the value of x when a value is put into the quadratic formula
 */
public class QuadraticFormula {

	
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
		
		System.out.println("The roots are " + rootOne + " and " + rootTwo);
		
		
		


	}//end of main

}//end of QuadraticFormula
