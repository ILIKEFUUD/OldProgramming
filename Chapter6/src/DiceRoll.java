/*
 * Rahul Shah
 * Pd2
 * DiceRoll.java
 * application that displays five rolls of two dice where each die is numbered from 1
	to 6.
 */
public class DiceRoll {

	
	public static void main(String[] args) {
		
		//variables
		int num1, num2, sum;
		
		//output
		System.out.println("Dice 1" + " Dice 2" + "	Total");
		
		for (int counter = 0; counter < 6; counter++){
			num1 = (int) (6 * Math.random() + 1);
			num2 = (int) (6 * Math.random() + 1);
			sum = num1 + num2;
			System.out.println(num1 + "         " + num2 + "        " + sum);
			
			
		}
		
		
	}//end of main

}//end of DiceRoll
