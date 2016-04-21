/*
 * Rahul Shah
 * 11/5/13
 * Pd2
 * CircleArea.java v 1.0
 * 
 * Calculates and displays the area of a circle
 */



import java.util.Scanner;
public class CircleArea {

	
	public static void main(String[] args) {
		
		//variables
		Scanner scan = new Scanner (System.in);
		double radius, area;
		
		//constants
		
		final double PI = 3.14;
		
		//input
		System.out.println("Radius:");
		radius = scan.nextDouble();
		
		// calculations
		
		area = PI * (radius *radius);
		System.out.println("Area of the circle is " + area);

	}

}
