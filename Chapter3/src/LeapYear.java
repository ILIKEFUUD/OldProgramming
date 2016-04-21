import java.util.Scanner;

/*
 * Rahul Shah
 * LeapYear
 * 10/2/14
 * checks to see if a year was a leap year
 */
public class LeapYear {

	
	public static void main(String[] args) {
		
		//variables
		int year;
		Scanner scan = new Scanner (System.in);
		String cont;
		
		do{
			System.out.println("Enter the year");
			year = scan.nextInt();
			if (year < 1582)
				System.out.println("The leap year didn't exist in this year");
		
			else
				if (year % 4 == 0)
					if (year % 100 == 0 && year % 400 != 0)
						System.out.println("This year is not a leap year");
					else
						System.out.println("This year is a leap year");
				else
					System.out.println("This year is not a leap year");
			
			System.out.println("Do you want to continue? (y or x)");
			scan.nextLine();
			cont = scan.nextLine();
			
		}while (cont.equals("y"));

	}//end of main

}//end of LeapYear

