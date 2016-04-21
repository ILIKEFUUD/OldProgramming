import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		int sum = 0, value, count = 0;

		double average;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter and integer (0 to quit)");
		value = scan.nextInt();

		if (value == 0)
			System.out.println("YOU BROKE JAVA ERROR ERROR ERROR ABORT MISSION");
		    int defAverage = 0;

		while (value != 0) {
			count++;
			sum += value;
			System.out.println("The sum so far is " + sum);

			System.out.println("Enter an integer (0 to quit)");
			value = scan.nextInt();
		}

		System.out.println();
		System.out.println("Number of values entered " + count);

		average = (double) sum / count;
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		
		if (defAverage == 0)
			System.out.println("The average is 0");
		else
			System.out.println("The average is " + fmt.format(average));

	}

}
