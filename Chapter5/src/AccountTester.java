import java.util.Scanner;
//Tests the Account class and its Lockable interface
//Rahul Shah
//Period 6 Amberg

public class AccountTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a key");
		int key = scan.nextInt();
		
		Account acc = new Account("Bob", 1234, 0.02);
		acc.setKey(key);
		
		
		acc.lock(key);//locks the account so I can unlock it
		
		System.out.println("Enter the key to unlock the account");
		key = scan.nextInt();
		acc.unlock(key);
		
		System.out.println("Enter a new key");
		key = scan.nextInt();
		acc.setKey(key);
		
		System.out.println("Enter the key to lock");
		key = scan.nextInt();
		acc.lock(key);
		
		
	}

}
