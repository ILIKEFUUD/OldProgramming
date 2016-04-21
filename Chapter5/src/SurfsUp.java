import java.util.Scanner;
/*
 * Rahul Shah
 * 11/19/13
 * PD2
 * SurfsUp.java v1.0
 * 
 * This application tells whether the waves are good for surfing
 */



public class SurfsUp {

	
	public static void main(String[] args) {
		
		//variables
		int waveHeight;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter the height of the waves: ");
		waveHeight = scan.nextInt();
		
		//output
		if (waveHeight >= 6)
			System.out.println("Great day to surf!");
		else if (waveHeight > 3)
			System.out.println("Go body boarding!");
		else if (waveHeight > 0)
			System.out.println("Go for a swim");
		else 
			System.out.println("Whoah, what kind of surf is that?");

	}//end of main

}//end of SurfsUp
