import java.util.Scanner;

/*
 * Rahul Shah
 * 10/20/14
 * 
 * Rolls a die and displays the result and lets the  user enter the number of sides on the die
 */
public class RollTheDie {

	
	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner (System.in);
		int userSide;
		//input
		System.out.println("Enter the number of sides for the die");
		userSide = scan.nextInt();
		
		//create the Die
		Die d1 = new Die(userSide);
		//roll the die
		d1.roll();
		System.out.println("The die is rolled as a " + d1.getFaceVal());
		

	}//end of main

}//end of RollTheDie
