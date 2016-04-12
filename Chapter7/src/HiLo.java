import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 3/26/14
 * Make a weird game 
 */
public class HiLo {

	
	public static void main(String[] args) {
		int check;
		int score = 1000;
		Scanner scan = new Scanner (System.in);
		while (score > 0){
		System.out.println("HI-LO GAME");
		System.out.println("RULES:");
		System.out.println("1-6 are low");
		System.out.println("7 is neither, you lose if it's 7 haha");
		System.out.println("and 8-13 are high");
		System.out.println("Try to guess the number! ");
		System.out.println("You have " + score + "points");
		System.out.println("How much do you wager?");
		int wager = scan.nextInt();
		}
	}
}
