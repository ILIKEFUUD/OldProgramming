import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/20/13
 * Month.java v1.0
 * This application tells what quarter a month falls in using switch statements
 */


public class Month {

	
	public static void main(String[] args) {
		
		//variables
		int month;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter a month using an integer value: ");
		month = scan.nextInt();
		
		//calculations and output
		switch (month){
			case 1:
			case 2:
			case 3:
				System.out.println("1st quarter");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("2nd quarter");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("3rd quarter");
				break;
			case 10:
			case 11:
			case 12: 
				System.out.println("4th quarter");
				break;
			default: System.out.println("ERROR");
		
		}

	}//end of main

}//end of Month
