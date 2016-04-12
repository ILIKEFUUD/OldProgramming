import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 3/20/14
 */
public class SpanishNumbers {

	
	public static void main(String[] args) {
		
		for (int x = 0; x <= 10; x++){
			spanishWords(x);
		}

	}//end of main
	
	public static void spanishWords (int x){
		
		switch (x){
		case 1: 
			System.out.println("Uno 1");
			break;
		case 2:
			System.out.println("Dos 2");
			break;
		case 3:
			System.out.println("Tres 3");
			break;
		case 4: 
			System.out.println("Cuatro 4");
			break;
		case 5:
			System.out.println("Cinco 5");
			break;
		case 6:
			System.out.println("Seis 6");
			break;
		case 7: 
			System.out.println("Siete 7");
			break;
		case 8:
			System.out.println("Ocho 8");
			break;
		case 9:
			System.out.println("Nueve 9");
			break;
		case 10:
			System.out.println("Diez 10");
		}
		
	}//end of spanishWords

}//end of SpanishNumbers
