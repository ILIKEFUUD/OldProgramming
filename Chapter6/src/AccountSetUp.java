import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 1/30/14
 * AccountSetUp.java
 * Prompts user for a username and password and checks if it is allowed
 */
public class AccountSetUp {

	
	public static void main(String[] args) {
		
		//variables
		Scanner scan = new Scanner (System.in);
		String username, password;
		
		//input and output
		System.out.println("Enter a Username: ");
		username = scan.next();
		
		System.out.println("Enter a password with at least 8 characters: ");
		password = scan.next();
		
		while (password.length() < 8){
			System.out.println("Enter a password with at least 8 characters: ");
			password = scan.next();
		}
		System.out.println("Your username is " + username.toLowerCase() + " and your password is " + password.toLowerCase());

	}//end of main

}//end of AccountSetUp
