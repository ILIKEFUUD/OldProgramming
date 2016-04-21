
public class DieTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die();
		Die die2 = new Die();
		for(int x = 0; x <= 10; x++){
			die1.roll();
			die2.roll();
			
			System.out.println(die1 + " compared to " + die2 + " is  " + die1.compareTo(die2));
			System.out.println("__________________________________________");
			
		}

	}

}
