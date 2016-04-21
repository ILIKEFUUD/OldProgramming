import java.util.Scanner;

/*
 * Rahul Shah
 * Prompt the user for a positive integer	
 * Display all the prime numbers from 2 to the number entered

 */
public class PrimeNumbers {

	
	public static void main(String[] args) {
		
		//variables
		int num;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number");
		num = scan.nextInt();
		
		for (int x = 2; x <= num; x++){//runs numbers 2 to num  through this
			int p = 0;
			for (int i = 2; i < x; i++){
				if (x%i == 0)
					p = 1;
			}
			if (p == 0)
				System.out.println(x);
		}
		
		
		
			
		

	}//end of main

}//end of PrimeNumbers
