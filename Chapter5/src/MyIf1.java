import java.util.Scanner;

public class MyIf1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number;

		System.out.println("Enter a number");
		number = scan.nextInt();

		if (number >= 100){
			System.out.println(number);
			System.out.println("You entered a number in range");
			System.out.println("Your number is" + number);
		}
		else{
			System.out.println("You didn't follow directions");
			System.out.println("Next time follow directions");
		}

		System.out.println("Goodbye");

	}

}
