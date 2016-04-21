/*
 * Rahul Shah
 * PD2
 * 11/14/13
 * Luminosity.java v1.0
 * This program calculates the brightness of a lightbulb
 */

import java.util.Scanner;
public class Luminosity {

	
	public static void main(String[] args) {
		
		//variables 
		final double PI = 3.14159;
		int distance;
		int brightness;
		double luminosity;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter distance: ");
		distance = scan.nextInt();
		
		System.out.println("Enter brightness: ");
		brightness = scan.nextInt();
		
		//calculations
		
		luminosity = 4 * PI * distance * distance * brightness;
		System.out.println(luminosity);
		
	}

}
