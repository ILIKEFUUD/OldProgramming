/*
 * Rahul Shah
 * PD2
 * 3/19/14
 */
import java.util.Scanner;

//class that provides methods for basic geometry formulas
public class Geometry {

	
	public static void main(String[] args) {
		
		//variables
		double length, width, area, perimeter, r, circleArea, circumference;
		double s, volume, surfaceArea;
		Scanner scan = new Scanner (System.in);		
		
		//input
		System.out.print("enter length: ");
		length = scan.nextDouble();
		
		System.out.print("enter width: ");
		width = scan.nextDouble();
		
		System.out.println("Enter radius: ");
		r = scan.nextDouble();
		
		System.out.println("Enter a side length: ");
		s = scan.nextDouble();
		//processing
		area = getRectArea(length, width);
		perimeter = getRectPerimeter(length, width);
		circleArea = getCircleArea(r);
		circumference = getCircumference(r);
		volume = getCubeVolume(s);
		surfaceArea = getCubeSurfaceArea(s);
		//output
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Circle area: " + circleArea);
		System.out.println("Circumference of circle: " + circumference);
		System.out.println("Volume of cube: " + volume);
		System.out.println("Surface Area of cube: " + surfaceArea);
	}//end main
	


	//preconditions: receives a positive value for len 
	//               and a positive value for width
	//postconditions: returns the area of a rectangle with  
	//                dimensions len and width
	public static double getRectArea (double len, double width){

		double area;
		area = len * width;
		return area;

	}//end getRectArea


	//preconditions: receives a positive value for len 
	//               and a positive value for width
	//postconditions: returns the perimeter of a rectangle with  
	//                dimensions len and width
	public static double getRectPerimeter (double len, double width){

		return 2 * len + 2 * width;

	}//end getRectPerimeter
	
	public static double getCircleArea ( double r ){
		double area;
		area = Math.PI * r * r;
		return area;
	}//end of getCircleArea
	public static double getCircumference ( double r ){
		double circumference;
		circumference = Math.PI * (2 * r);
		return circumference;
	}//end of getCircumference
	public static double getCubeVolume ( double s ){
		double volume;
		volume = s*s*s;
		return volume;
	}//end of getCubeVolume
	public static double getCubeSurfaceArea ( double s ){
		double surfaceArea;
		surfaceArea = s * s * 6;
		return surfaceArea;
	}//end of getCubeSurfaceArea



}//end Geometry

