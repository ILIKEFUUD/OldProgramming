/*
 * Rahul Shah
 * PD2
 * 3/24/14
 * 
 */
import java.util.Scanner;
public class MetricConversion {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice; 
		double number, answer = 0;
		
		System.out.println("Enter a number to convert");
		number = scan.nextInt();
		
		choice = choices();
		
		switch (choice){
		case 1: answer = inchesToCentimeters(number);
		break;
		case 2: answer = feetToCentimeters(number);
		break;
		case 3: answer = yardsToMeters(number);
		break;
		case 4: answer = milesToKilometers(number);
		break;
		case 5: answer = centimetersToInches(number);
		break;
		case 6: answer = centimetersToFeet(number);
		break;
		case 7: answer = metersToYards(number);
		break;
		case 8: answer = kilometersToMiles(number);
		break;
		}
		
		System.out.println(answer);
		

	}
	//precondition: a number is inputed to convert
	//postcondition: tells computer which conversion the user wants
	public static int choices (){
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a conversion");
		
		System.out.println("1.inches to centimeters");
		System.out.println("2.feet to centimeters");
		System.out.println("3.yards to meters");
		System.out.println("4.miles to kilometers");
		System.out.println("5.centimeters to inches");
		System.out.println("6.centimeters to feet");
		System.out.println("7.meters to yards");	
		System.out.println("8.kilometers to miles");
		int choice = scan.nextInt();
		
		return choice;
		
	}
	
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double inchesToCentimeters ( double number){
		return (number * 2.54);
	}
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double feetToCentimeters (double number){
		return (number * 30);
	}
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double yardsToMeters (double number){
		return (number * 0.91);
	}
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double milesToKilometers (double number){
		return (number * 1.6);
	}
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double centimetersToInches (double number){
		return (number / 2.54);
	}
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double centimetersToFeet (double number){
		return (number / 2.54);
	}
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double metersToYards (double number){
		return (number / 0.91);
	}
	//pre: a number is inputed to convert
	//post: converts the number to the appropriate type
	public static double kilometersToMiles (double number){
		return (number / 1.6);
	}

}//end of MetricConversion
