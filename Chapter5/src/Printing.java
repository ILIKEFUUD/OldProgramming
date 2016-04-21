import java.util.Scanner;

/*
 * Rahul Shah
 * Heba Elradi
 * Printing.java
 * PD2
 * This application determines the price of an amount of copies of paper
 */

public class Printing {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int printCopies;
		
		//input
		System.out.println("Enter the number of copies: ");
		printCopies = scan.nextInt();
		
		//price
		
		if(printCopies >= 0 && printCopies <= 99){
			System.out.println("30 cents per copy");
			System.out.println("Total cost: " + printCopies * 30.0 / 100);
		}
		else if (printCopies >=100 && printCopies <= 499){
			System.out.println("28 cents per copy");
			System.out.println("Total cost: " + printCopies * 28.0 /100);
		}
		else if (printCopies >= 500 && printCopies <= 749){
			System.out.println("27 cents per copy");
			System.out.println("Total cost: " + printCopies * 27.0 /100);
		}
		else if (printCopies >= 750 && printCopies <= 1000){
			System.out.println("26 cents per copy");
			System.out.println("Total cost: " + printCopies * 26.0 /100);
		}
		else if (printCopies < 0){
			System.out.println("Error. Invalid number of copies");
		}
		else {
			System.out.println("25 cents per copy");
			System.out.println("Total cost: " + printCopies * 25.0 / 100);
		}
	}//end of main

}//end of Printing
