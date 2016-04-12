import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 2/10/14
 * CountVowels.java
 * application that prompts the user for a string and then displays a count of the
 number of vowels in the string.
 */
public class CountVowels {

	public static void main(String[] args) {

		// variables
		int counter = 0, vowelCounter = 0;
		Scanner scan = new Scanner(System.in);
		String sentence;

		// input
		System.out.println("Enter text: ");
		sentence = scan.nextLine();

		// computation

		while (counter < sentence.length()) {

			if (sentence.substring(counter, counter + 1).equalsIgnoreCase("a")
					|| sentence.substring(counter, counter + 1)
							.equalsIgnoreCase("e")
					|| sentence.substring(counter, counter + 1)
							.equalsIgnoreCase("i")
					|| sentence.substring(counter, counter + 1)
							.equalsIgnoreCase("o")
					|| sentence.substring(counter, counter + 1)
							.equalsIgnoreCase("u")) {

				vowelCounter++;
				counter++;

			} else {
				counter++;
			}
		}
		System.out.println("There are " + vowelCounter
				+ " vowels in that sentence");

	}// end of main

}// end of CountVowels
