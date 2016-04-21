import java.util.Scanner;

/*
 * Write the code that determines how many times the character x 
 * appears in a  String named str, then displays the results – do this on 
 * Eclipse then show the teacher – use substring 
 * 
 */
public class WarmUpStr {

	
	public static void main(String[] args) {
		//variables
		int counter = 0;
		String str;
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter a word or sentence");
		str = scan.next();
		
		//counts X's
		for (int i = 0; i < str.length(); i++){
			if (str.substring(i, i+1).toUpperCase().equals("X")){
				counter++;
			}
				
		}
		//outputs # of X's
		System.out.println("The number of X's in the text is " + counter);

	}//end of main

}//end of WarmUpStr
