import java.util.Scanner;


public class Searcher {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] ints;
		int size, value;
		
		
		System.out.print("Enter the number of integers");
		size = scan.nextInt();
		
		//clear the input line
		scan.nextLine();
		
		ints = new int [size];
		
		for (int i = 0; i < ints.length; i++){
			System.out.println("Enter an integer");
			ints[i] = scan.nextInt();
		}
		
		for (int i = ints.length-1; i >= 0; i--){
			System.out.println(ints[i]);
		}
		
		System.out.println("What value do you want to search for?");
		value = scan.nextInt();
		
		boolean found = false;
		
		for (int i = 0; i < ints.length; i++){
			if (value == ints[i]){
				found = true;
			}
		}
		
		System.out.println("Value found " + found);

	}//end of main

}//end of Searcher
