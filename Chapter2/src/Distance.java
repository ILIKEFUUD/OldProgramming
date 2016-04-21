/*
 * Rahul Shah
 * PD6
 * Distance
 * Uses 2 (x,y) coordinates and determines their distance
 */
import java.util.Scanner;
public class Distance {

	
	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner (System.in);
		double x1, x2, y1, y2;
		double distance;
		
		//input
		System.out.println("Enter the first X value");
		x1 = scan.nextDouble();
		System.out.println("Enter the first Y value");
		y1 = scan.nextDouble();
		System.out.println("Enter the second X value");
		x2 = scan.nextDouble();
		System.out.println("Enter the second Y value");
		y2 = scan.nextDouble();
		
		//computing
		distance = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
		distance = Math.sqrt(distance);
		
		
		
		//output
		System.out.println("The distance is: " + distance);
		

	}//end of main

}//end of Distance
