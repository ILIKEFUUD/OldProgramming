/*
 * Flips 2 coins until one consecutively comes up with heads 3 times
 */
public class FlipRace {

	
	public static void main(String[] args) {
		//constants
		final int GOAL = 3;
		//variables
		
		Coin c1 = new Coin();
		Coin c2 = new Coin();
		
		int count1 = 0, count2 = 0;
		
		System.out.println(" Coin 1 = " + c1);
		
		System.out.println(" Coin 2 = " + c2);
		
		
		while(count1 != 3 && count2 != 3){
			c1.flip();
			c2.flip();
			
			//show results of flipping
			System.out.println(" Coin 1 = " + c1);
			
			System.out.println(" Coin 2 = " + c2);
			
			if (c1.isHeads())
				count1++;
			
			else
				count1 = 0;
			
			if (c2.isHeads())
				count2++;
			else
				count2 = 0;
		}
		
		
		if (count1 > count2)
			System.out.println("COIN 1 WINS!");
		else if (count1 < count2)
		    System.out.println("COIN 2 WINS!");
		else
			System.out.println("TIE");
		

	}

}
