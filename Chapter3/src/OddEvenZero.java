/*
 * Rahul Shah
 * Pd 6
 * Check the individual digits of the number to see if it is odd, even, or 0
 * 10/10/14
 * OddEvenZero.java
 */

import java.util.Scanner;

public class OddEvenZero {

	public static void main(String[] args) {
		// variable
		int userNum, even = 0, odd = 0, zero = 0;
		Scanner scan = new Scanner(System.in);
		boolean isZero = false;

		String stop = "y";

		// calculating
		while (!stop.equals("x")) {// decides to keep going if the user
			System.out.println("Enter a number");// wants to keep going
			userNum = scan.nextInt();
			if (userNum == 0) {
				isZero = true;
				zero++;
			}
			while (userNum != 0) {

				int num = userNum % 10;
				if (num == 0)
					zero++;
				else if (num % 2 == 0)
					even++;
				else
					odd++;
				userNum = userNum / 10;

			}// end of inner while

			System.out.println("The number of odd numbers : " + odd);
			odd = 0;
			System.out.println("The number of even numbers : " + even);
			even = 0;
			System.out.println("The number of zeros : " + zero);
			zero = 0;

			System.out.println("x to exit");
			stop = scan.next();
		}// end of outer while
	}// end of main

}// end of OddEvenZero
