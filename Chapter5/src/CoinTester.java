import java.util.Scanner;

/*
 * Rahul Shah
 * PD6
 * Amberg
 * Tests coin and its lockable interface
 */
public class CoinTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int key = 0;
		
		Coin coin1 = new Coin(1);
		System.out.println("Enter key to unlock");
		key = scan.nextInt();
		coin1.unlock(key);
		coin1.lock(key);
		
		Coin coin2 = new Coin(1);
		System.out.println("Enter to key to unlock");
		key = scan.nextInt();
		coin2.unlock(key);
		
		

	}

}
