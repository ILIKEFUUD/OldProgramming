import java.util.Scanner;
/*
 * Rahul Shah
 * Pd2
 * 10/30/13
 * GradeAvg.java v1.0
 * 
 * This program calculates the average grade of 5 test grades
 * 
 */


public class GradeAvg{
	public static void main (String [] args){
		
		//variables
		int grade1, grade2, grade3, grade4, grade5;
		double average;
		
		Scanner keyboard = new Scanner (System.in);
		
		//input
		System.out.println("Grade 1: ");
		grade1 = keyboard.nextInt();
		average = grade1;
		
		System.out.println("Grade 2: ");
		grade2 = keyboard.nextInt();
		average += grade2;
		
		System.out.println("Grade 3: ");
		grade3 = keyboard.nextInt();
		average += grade3;
		
		System.out.println("Grade 4: ");
		grade4 = keyboard.nextInt();
		average += grade4;
		
		System.out.println("Grade 5: ");
		grade5 = keyboard.nextInt();
		average += grade5;
		
		//calculating the average
		
		average /= 5;
		
		System.out.println("The average of the grades are: " + average + "%");
		
		
		
		
	}//end of main
}//end of GradeAvg