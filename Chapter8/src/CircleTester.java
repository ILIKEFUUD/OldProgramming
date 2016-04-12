import java.util.Scanner;


public class CircleTester {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Circle circ1 = new Circle(3);
		Circle circ2 = new Circle();
		double area;
		
//		area = circ1.area();
//		System.out.println("Area of a circle witha radius of 3 =" + area );
//		
//		area = circ2.area();
//		System.out.println("Area of a circle witha radius of 1 =" + area );
//		
//		System.out.println(circ1.getRadius());
//		
//		System.out.println(circ1.getCircumference());
//		
//		circ1.setRadius(4);
//		System.out.println();
		
		//interactiely create a circle
//		double radius;
//		System.out.println("Enter the radius of the circle: ");
//		radius = scan.nextDouble();
//		
//		Circle myCirc = new Circle(radius);
//		System.out.println("The area of the circle is: " + myCirc.area());
//		
		Circle circ3 = new Circle (3);

		System.out.println(circ1);
		System.out.println(circ2);
		System.out.println(circ2);
		System.out.println(circ1.equals(circ2));
	}//end of main

}//end of CircleTester
