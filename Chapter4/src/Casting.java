/*
 * Rahul Shah
 * 10/29/13
 * PD2
 * 
 * Casting.java version 1.0
 * 
 * This is a program that demonstrates the use of casting variables to different data types
 */


public class Casting {
	public static void main (String [] args){
		
		//variables
		int a,b,c;
		double x,y,z;
		
		a = 5;
		
		b = 3;
		
		c = a + b;
		
		System.out.println(c);
		
		c = a / b;
		System.out.println(c);
		
		x = a / b;
		System.out.println(x);
		
		y = (double) a / b;
		System.out.println(y);
		
		//I can assign an integer value into a double
		z = a;
		System.out.println(z);
		
		//can't directly put a double into an int. Must cast into an int
		c = (int)z;
		System.out.println(c);
		
		
		
		
	}//end of main
}//end of Casting