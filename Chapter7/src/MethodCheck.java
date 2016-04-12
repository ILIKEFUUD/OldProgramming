import java.util.Scanner;

/*
 * Rahul Shah
 * PD 2
 * 
 */
public class MethodCheck {

	public static void main(String[] args) {
		double score1, score2, score3;
		boolean passing;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 3 test scores: ");
		score1 = scan.nextDouble();
		score2 = scan.nextDouble();
		score3 = scan.nextDouble();

		// call method and store answer
		passing = isPassing(score1, score2, score3);

		// display method
		System.out.println(passing);

	}// end of main

	public static boolean isPassing(double score1, double score2, double score3) {
		return ((score1 + score2 + score3) / 3 >= 70);
	}// end of isPassing

}// end of MethodCheck
