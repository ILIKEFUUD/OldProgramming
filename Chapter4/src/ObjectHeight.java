import java.util.Scanner;

/*
 * Rahul Shah
 * Pd2
 * ObjectHeight.java v1.0
 * 
 * This application can determine the height of an object during any given moment during
 * a drop from 100 meters
 */


public class ObjectHeight{
	
	public static void main (String [] args){
		
		//variables
		double t,h;
		Scanner keyboard = new Scanner (System.in);
		
		//input
		System.out.println("Enter a time less than 4.5 seconds: ");
		t = keyboard.nextDouble();
		
		//calculations
		
		h = 100 - (4.9 * t * t);
		
		System.out.println("Height is: " + h);
		
	}//end of main
}//end of ObjectHeight