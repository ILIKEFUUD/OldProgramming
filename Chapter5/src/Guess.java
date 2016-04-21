import java.util.Scanner;


public class Guess {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int guess;
		final int number = 6;
		
		System.out.println("Guess a number between 1 and 10: ");
		guess = scan.nextInt();
		
		if (guess == number)
			System.out.println("You win!");
		else if (guess < number)
			System.out.println("Too low");
		else 
			System.out.println("Too High");
		
		

	}

}
