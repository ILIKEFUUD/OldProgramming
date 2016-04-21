import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/22/13
 * RandomNum.java v1.0
 * This application prompts the user for 2 numbers and finds a random number between them.
 */


public class RandomNum {

	public static void main(String[] args) {
		
		//variables
		int y = 1;
		int x = 3;
		while ( y < 4 ) {
		while ( x > 0) {
				System.out.println( x * y );
				x = x - 1;
		}//end while x > 0
		y++;
			x = 3;
		}//end while y < 4

		int high,low, random;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter a high value: ");
		high = scan.nextInt();
		
		System.out.println("Enter a lower value: ");
		low = scan.nextInt();
		
		//random number
		random = (int)(Math.random() * (high - low + 1) + low);
		System.out.println("Random number: " + random);
		
		int myNum = (int) (Math.random() * 50 + 13);
		System.out.println(myNum);
		
	
		

	}//end of main	

}//end of RandomNum

