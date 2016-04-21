import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/11/13
 * Sleep.java v1.0
 * This application determines how many hours of your life you have spent sleeping. 
 */


public class Sleep {

	
	public static void main(String[] args) {
		
		//variables
		int birthYear, birthMonth, birthDay, currentYear, currentMonth; 
		int currentDay, totalAlive, totalAsleep;
		
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter your birth year: ");
		birthYear = scan.nextInt();
		
		System.out.println("Enter your birth month: ");
		birthMonth = scan.nextInt();
		
		System.out.println("Enter your day (number) of birth: ");
		birthDay = scan.nextInt();
		
		System.out.println("Enter today's year: ");
		currentYear = scan.nextInt();
		
		System.out.println("Enter today's month: ");
		currentMonth = scan.nextInt();
		
		System.out.println("Enter today's day (number): ");
		currentDay = scan.nextInt();
		
		//calculations
		
		totalAlive = ((currentYear - birthYear) * 365) +((currentMonth - birthMonth) * 30) +(currentDay - birthDay); 
		System.out.println("You have been alive for " + totalAlive + " days");
		totalAsleep = totalAlive * 8;
		System.out.println("You have slept for " + totalAsleep + " hours");
		


	}//end of Sleep

}//end of main
