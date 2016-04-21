import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 11/26/13
 * MathTutor.java 
 * This application gives random math problems and shows the correct answer if answer is
 * wrong.
 */


public class MathTutor {

	
	public static void main(String[] args) {
		
		//variables
		int num1 = (int)(Math.random() * 10 + 1);
		int num2 = (int)(Math.random() * 10 + 1);
		int operation =(int)(Math.random() * 4 + 1);
		int answer;
		double divAnswer;
		Scanner scan = new Scanner (System.in);
		
		//making the problem
		
		if (operation == 1){
			System.out.println(num1 + "+" + num2);
			System.out.println("Answer: ");
			answer = scan.nextInt();
			if (answer == num1 + num2){
				System.out.println("Correct!");	
			}
			else 
				System.out.println("Incorrect!");
		}
		else if (operation == 2 && num1 >= num2){
			System.out.println(num1 + "-" + num2);
			System.out.println("Answer: ");
			answer = scan.nextInt();
			if (answer == num1 - num2){
				System.out.println("Correct!");	
			}
			else 
				System.out.println("Incorrect!");
		}
		else if (operation == 3 && num1 % num2 == 0){
			System.out.println(num1 + "/" + num2);
			System.out.println("Answer: ");
			divAnswer = scan.nextInt();
			if (divAnswer == (double)num1 / num2){
				System.out.println("Correct!");	
			}
			else 
				System.out.println("Incorrect!");
		}
		else{
			System.out.println(num1 + "*" + num2);
			System.out.println("Answer: ");
			answer = scan.nextInt();
			if (answer == num1 * num2){
				System.out.println("Correct!");	
			}
			else 
				System.out.println("Incorrect!");
		}
		
		
		
	}//end of main

}//end of MathTutor
