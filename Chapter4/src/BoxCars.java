
public class BoxCars {

	
	public static void main(String[] args) {
		//variables
		int counter = 0;
		
		PairOfDice dice = new PairOfDice();
		
		for (int x = 1; x <= 1000; x++){
			dice.roll();
			System.out.println(dice);
			//count how many times dice one equals 6 AND dice two equals 6
			if (dice.getTotal() == 12)
				counter++;
		}
		System.out.println("The numbers of boxcars is " + counter);

	}

}
