import java.util.Scanner;

/*
 * Rahul Shah
 */
public class StudentRoster {

	
	public static void main(String[] args) {
		//variables
		String [] studentNames;
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Enter the number of students");
		int length = scan.nextInt();
		studentNames = new String [length];
		
		
		for (int x = 0; x < studentNames.length; x++){
			System.out.println("Enter the student name");
			studentNames[x] = scan.next();
		}
		
		System.out.println("These are the students");
		for (int y = 0; y < studentNames.length; y++){
			System.out.println(studentNames[y]);
		}
		

	}//end of main

}//end of StudentRoster
