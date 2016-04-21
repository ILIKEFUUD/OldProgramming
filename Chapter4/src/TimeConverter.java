import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/14/13
 * TimeConverter.java 
 * This program prompts the user for a time in minutes and then displays the time
 * in hours and minutes
 */


public class TimeConverter {

	
	public static void main(String[] args) {
		
		//variables
		int inputMinutes;
		Scanner scan = new Scanner (System.in);
		int hours;
		int minutes;
		String dayOrNight = "AM";
		//input
		System.out.println("Enter the time in minutes: ");
		inputMinutes = scan.nextInt();
		
		//calculations
		
		hours = inputMinutes / 60;
		minutes = inputMinutes % 60;
		
		if (hours > 12) {
			hours -= 12;
			dayOrNight = "PM";
		}else if (hours > 24){
			
		}
		System.out.println("The time is: " + hours + ":" + minutes + dayOrNight);
		
		

	}//end of main

}//end of TimeConverter
