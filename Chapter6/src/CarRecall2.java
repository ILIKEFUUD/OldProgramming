import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 12/19/13
 * CarRecall2.java
 * A modified version of Car Recall that lets the user enter as many serial numbers as
 * they want to
 */
public class CarRecall2 {

	
	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner (System.in);
		int modelNumber = -1;
		
		//test for defects
		while (modelNumber != 0){
			System.out.println("Enter a model number OR 0 to quit: ");
			modelNumber = scan.nextInt();
			if (modelNumber == 119 || modelNumber == 179 || modelNumber == 189 || modelNumber == 190 || modelNumber == 191 || modelNumber == 192 || modelNumber == 193 || modelNumber == 194 || modelNumber == 195 || modelNumber == 221 || modelNumber == 780){
				System.out.println("Your car is defective");
			}else 
				System.out.println("Your car is not defective");
		}
		
		

	}//end of main

}//end of CarRecall2
