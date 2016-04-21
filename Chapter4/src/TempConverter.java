import java.util.Scanner;
/*
 * Rahul Shah
 * 10/30/13
 * PD2
 * 
 * TempConverter.java v1.0
 * 
 * This program takes a Fahrenheit temperature and converts it to Celcius
 */


public class TempConverter{
	public static void main (String [] args){
		
		//variables
		double fahrenheit, celcius;
		Scanner keyboard = new Scanner (System.in);
		
		//input
		System.out.println("Fahrenheit: ");
		fahrenheit = keyboard.nextDouble();
		
		//calculations
		
		celcius = ((double)5/9) * (fahrenheit - 32.0);
		System.out.println("Celcius value: " + celcius + " degrees Celcius");
		
	}//end of main
}//end of TempConverter