import java.util.Scanner;



/*
 * Rahul Shah
 * 10/25/13
 * Pd2
 * Distance2.java
 * This program demonstrates the use of a Scanner for input for a computer
 */


public class Distance2{
	public static void main (String [] args){
		
		//variables
		double first, second, third, distance;
		//makes a scanner object named keyboard
		//and connects it to the keyboard of my computer
		Scanner keyboard = new Scanner (System.in);
		String units;
		
		
		
		//prompt for and read data
		
		System.out.println("Please enter the distance for the first leg:  ");
		first = keyboard.nextDouble();
		
		System.out.println("Please enter the distance for the second leg:  ");
		second = keyboard.nextDouble();
		
		System.out.println("Please enter the distance for the third leg:  ");
		third = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter the units for the race: ");
		units = keyboard.nextLine();
		
		
		
		
		
		//calculations
		distance = first + second + third;
		
		System.out.println("The total distance of the race is " + distance + " " + units);
		
		
		
		
	
		
	}//end of main	
}//end of Distance