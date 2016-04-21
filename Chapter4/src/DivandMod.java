import java.util.Scanner;

/*
 * Rahul Shah
 * 11/6/13
 * PD2
 * DivandMod.java v1.0
 * 
 *This application can prompt the user for two integers and then display the result of
integer and modulus division in either order.
 */


public class DivandMod {

	
	public static void main(String[] args) {
		
		//variables
		int num1, num2;
		
		
		Scanner scan = new Scanner (System.in);
		
		//input
		System.out.println("Enter an integer: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter another integer:");
		num2 = scan.nextInt();
		
		//calculations
		System.out.println(num1 + " / " + num2 + " = " + num1/num2);
		System.out.println(num1 + " % " + num2 + " = " + num1%num2);
		System.out.println(" ");
		System.out.println(num2 + " / " + num1 + " = " + num2/num1);
		System.out.println(num2 + " % " + num1 + " = " + num2%num1);
		

	}//end of main

}//end of DivandMod
