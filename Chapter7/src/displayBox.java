import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 3/21/14
 */

public class displayBox {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a width");
		int width = scan.nextInt();

		System.out.println("Enter a height");
		int height = scan.nextInt();

		System.out.println("Do you want to use a specific character? y or n");
		String answer = scan.next();

		if (answer.equals("y")) {
			System.out.println("Enter a character");
			String character = scan.next();
			drawBox(width, height, character);
		} else {
			drawBox(width, height);
		}

	}// end of main

	public static void drawBox(int width, int height) {
		int x = 0;
		int y = 0;
		for (x = 0; x < height; x++) {
			for (y = 0; y < width; y++) {
				System.out.print("#");

			}
			System.out.println();
		}
	}// end of drawBox

	public static void drawBox(int width, int height, String character) {
		int x = 0;
		int y = 0;
		for (x = 0; x < height; x++) {
			for (y = 0; y < width; y++) {

				System.out.print(character);

			}
			System.out.println();
		}
	}// end of drawBox

}// end of displayBox
