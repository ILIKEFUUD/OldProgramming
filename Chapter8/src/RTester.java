/*
 * tester for student Rational class
 */
public class RTester {

	
	public static void main(String[] args) {
	  Rational r1 = new Rational(1, 3);
	  Rational r2 = new Rational(1, 6);
	  Rational r3 = new Rational(1, 2);
	  Rational r4 = new Rational(3, 6);
	  Rational r5 = new Rational(6, 20);
	  Rational r6 = new Rational(14, 49);
	  
	  System.out.println("checking toString with println...");
	  System.out.println(r1);
	  System.out.println(r2);
	  System.out.println(r3);
	  System.out.println(r4);
	  System.out.println(r5);
	  System.out.println(r6);
	  System.out.println();
	  
	  //testing addition
	  System.out.println("\nAddition...");
	  System.out.println( r1 + " + " + r2 + " = " + r1.add(r2) );
	  System.out.println( r2 + " + " + r4 + " = " + r2.add(r4) );
	  System.out.println( r2 + " + " + r2 + " = " + r2.add(r2) );
	  System.out.println( r5 + " + " + r6 + " = " + r5.add(r6) );
	  
	  System.out.println("\nSubtraction...");
	  System.out.println( r3 + " - " + r2 + " = " + r3.subtract(r2) );
	  System.out.println( r4 + " - " + r2 + " = " + r4.subtract(r2) );
	  System.out.println( r3 + " - " + r6 + " = " + r3.subtract(r6) );
	  System.out.println( r5 + " - " + r6 + " = " + r5.subtract(r6) );
	  
	  
	  System.out.println("\nMultiplication...");
	  System.out.println( r3 + " * " + r2 + " = " + r3.multiply(r2) );
	  System.out.println( r2 + " * " + r4 + " = " + r2.multiply(r4) );
	  System.out.println( r3 + " * " + r4 + " = " + r3.multiply(r4) );
	  System.out.println( r5 + " * " + r1 + " = " + r5.multiply(r1) );
	  
	  System.out.println("\nDivision...");
	  System.out.println( r3 + " / " + r2 + " = " + r3.divide(r2) );
	  System.out.println( r2 + " / " + r4 + " = " + r2.divide(r4) );
	  System.out.println( r3 + " / " + r4 + " = " + r3.divide(r4) );
	  System.out.println( r5 + " / " + r1 + " = " + r5.divide(r1) );
	  
	  System.out.println("\nEquals...");
	  System.out.println (r3 + " equals " + r4 + " " + r3.equals(r4));
	  System.out.println (r3 + " equals " + r5 + " " + r3.equals(r5));
	  
	}

}
