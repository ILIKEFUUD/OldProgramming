import java.util.Scanner; 
/*Heba Elradi
 * Rahul Shah
 * PackageCheck.java
 * 12.2.13
 * PD2
 * This application checks if a package is too big
 */
public class PackageCheck {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int weight, length, width, height, volume;
		System.out.println("Enter the package weight in kilograms");
		weight= scan.nextInt();
		System.out.println("Enter package length in cm" );
		length = scan.nextInt();
		System.out.println("Enter the width in cm");
		width = scan.nextInt();
		System.out.println("Enter the height in cm");
		height = scan.nextInt();
		volume = length * width* height;
		
		
		if (weight > 27 && volume > 100000)
			System.out.println("Too heavy and too large");
		else if (weight > 27 )
			System.out.println("Too heavy ");
		else if (volume > 100000)
			System.out.println("Too big");
		else
			System.out.println("Package ok");
	}//end of main

}//end of PackageCheck
