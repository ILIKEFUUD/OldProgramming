/*
 * Rahul Shah
 * PD2
 * 4/8/14
 * PlanetWeight.java
 */
import java.util.Scanner;


public class PlanetWeight {

	
	public static void main(String[] args) {
		double weight, newWeight;
		int planet;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your weight on earth");
		weight = scan.nextDouble();
		planet = planetChoice();
		
		switch (planet){
		case 1: System.out.println("Weight " + mercuryWeight(weight));
		break;
		case 2: System.out.println("Weight " + venusWeight(weight));
		break; 
		case 3: System.out.println("Weight " + marsWeight(weight));
		break;
		case 4: System.out.println("Weight " + jupiterWeight(weight));
		break;
		case 5: System.out.println("Weight " + saturnWeight(weight));
		break;
		case 6: System.out.println("Weight " + uranusWeight(weight));
		break;
		case 7: System.out.println("Weight " + neptuneWeight(weight));
		break;
		
		}//end of main
		

	}
	public static int planetChoice(){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a planet");
		System.out.println("1.Mercury");
		System.out.println("2.Venus");
		System.out.println("3.Mars");
		System.out.println("4.Jupiter");
		System.out.println("5.Saturn");
		System.out.println("6.Uranus");
		System.out.println("7.Neptune");
		int planets = scan.nextInt();
		return planets;
	}//end of planetChoice
	public static double mercuryWeight(double weight){
		double newWeight = weight * 0.38;
		return newWeight;
	}//end of mercuryWeight
	public static double venusWeight(double weight){
		double newWeight = weight * 0.78;
		return newWeight;
	}//end of venusWeight
	public static double marsWeight (double weight){
		double newWeight = weight * 0.39;
		return newWeight;
	}//end of marsWeight
	public static double jupiterWeight (double weight){
		double newWeight = weight * 2.65;
		return newWeight;
	}//end of jupiterWeight
	public static double saturnWeight (double weight){
		double newWeight = weight * 1.17;
		return newWeight;
	}//end saturnWeight
	public static double uranusWeight (double weight){
		double newWeight = weight * 1.05;
		return newWeight;
	}//end of uranusWeight
	public static double neptuneWeight (double weight){
		double newWeight = weight * 1.23;
		return newWeight;
	}//neptuneWeight
	
}//end of PlanetWeight
