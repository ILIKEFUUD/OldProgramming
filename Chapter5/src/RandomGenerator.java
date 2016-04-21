import java.util.Random;
import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 12/6/13
 * RandomGenerator.java
 * This application displays a list of random numbers based on a seed 
 * inputed by the user
 */


public class RandomGenerator {

	
	public static void main(String[] args) {
		
		//variables
		Scanner scan = new Scanner (System.in);
		int seed;
		System.out.println("Enter seed");
		seed = scan.nextInt();
		
		Random random = new Random(seed);
		System.out.println(random.nextInt(5));
		System.out.println(random.nextInt(5));
		System.out.println(random.nextInt(5));
		System.out.println(random.nextInt(5));
		System.out.println(random.nextInt(5));
		System.out.println(random.nextInt(5));
		
		

			int x =  7;

			if ( x >= 5 )
			  	System.out.println ("one star awarded");
			else if ( x >=7 )
			  	System.out.println ("two stars awarded");
			else if ( x>=10)
			  	System.out.println ("three stars awarded");
			else
			   	System.out.println ("no stars awarded");

		

	}

}
