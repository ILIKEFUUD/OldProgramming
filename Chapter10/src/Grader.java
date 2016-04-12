import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 5/30/14
 * Grader.java
 * 
 * Lets the user enter test scores, finds the average, and tells the highest and lowest
 * scores
 */

public class Grader {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		double [] scores;
		int size;
		
		
		System.out.println("Enter the amount of test scores");
		size = scan.nextInt();
		
		scores = new double [size];
		for (int i = 0; i < size; i++){
			System.out.println("Enter a score");
			scores[i] = scan.nextDouble();
		}
		
		for (int i = 0; i < size; i++){
			System.out.println(scores[i]);
		}
		
		double total = 0;
		for (int i = 0; i < size; i++){
			total += scores[i];
		}
		System.out.println("The average is " + total/size);
		
		double low = scores[1];
		
		for (int i = 0; i < size; i++){
			if (low >= scores[i]){
				
				low = scores[i];
				
			}
		}
		
		System.out.println("The lowest number is " + low);
		
		for (int i = 0; i < size; i++){
			if (low <= scores[i]){
				
				low = scores[i];
				
			}
			
		}
		
		System.out.println("The highest number is " + low);

	}//end of main

}//end of Grader
