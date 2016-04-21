import java.text.DecimalFormat;
/*
 * Rahul Shah
 * Pd 6
 * 9/15/14
 * RandomPhoneNumber 
 * creates a random phone number within certain rules
 */

public class RandomPhoneNumber {

	
	public static void main(String[] args) {
		
		//variables
		int areaCode1, areaCode2 , areaCode3, middleNumbers, endNumbers;
		
		//generating
		areaCode1 = (int) ((8-0) * Math.random() + 0);
		areaCode2 = (int) ((8-0) * Math.random() + 0);
		areaCode3 = (int) ((8-0) * Math.random() + 0);
		
		middleNumbers = (int) ((743) * Math.random());
		
		endNumbers = (int) ((10000) * Math.random());
		
		//formatting
		DecimalFormat threeDigits = new DecimalFormat("000");
		DecimalFormat lastFour = new DecimalFormat("0000");
		
		//output
		System.out.println("Random Phone Number: " + areaCode1 + areaCode2 + areaCode3 + "-" +
		threeDigits.format(middleNumbers) + "-" + lastFour.format(endNumbers));
		
		
		

	}//end of main

}//end of RandomPhoneNumber
