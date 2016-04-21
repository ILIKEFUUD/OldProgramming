/*
 * Rahul Shah
 * PD6
 * Heron
 * determines the area based on the perimeter of a triangle
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Heron {

	
	public static void main(String[] args) {
		
		//variables
		Scanner scan = new Scanner (System.in);
		double a, b, c, s;
		double area;
		
		//input
		System.out.println("Enter a length for a: ");
	    a = scan.nextDouble();
		System.out.println("Enter a length for b: ");
		b = scan.nextDouble();
		System.out.println("Enter a length for c: ");
		c = scan.nextDouble();
		
		//calculation
		
		s = (a + b + c)/2;
		
		area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		//print area to 3 decimal places using DecimalFormat Object
		DecimalFormat answer = new DecimalFormat("0.###");
		
		
		//output
		System.out.println("The area of the triangle is: " + answer.format(area));

	}//end of main

	

}//end of Herons
