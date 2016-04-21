import java.util.Scanner;

/*
 * Rahul Shah
 * Heba Elradi
 * PD2
 * 12/2/13
 * CarRecall.java
 * This program tells if a car is not fit to drive and should be recalled
 */


public class CarRecall {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int modelNumber;
		
		System.out.println("Enter your car's model number");
		modelNumber = scan.nextInt();
		
		if (modelNumber == 119 || modelNumber == 179 || modelNumber == 189 || modelNumber == 190 || modelNumber == 191 || modelNumber == 192 || modelNumber == 193 || modelNumber == 194 || modelNumber == 195 || modelNumber == 221 || modelNumber == 780)
			System.out.println("Your car is defective. It must be repaired.");
		else 
			System.out.println("Your car is not defective.");
		System.out.println(7/6.0);

	}//end of main

}//end of CarRecall
