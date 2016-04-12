
public class CoinTester {

	
	public static void main(String[] args) {
		
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		Coin coin3 = new Coin();
		
		System.out.println("is coin1 heads? " + coin1.isHeads());
		
		System.out.println(coin2);
		
		System.out.println(coin1.equals(coin2));
		
		for (int x = 0; x < 10; x++){
			
			coin1.flip();
			coin2.flip();
			System.out.println("coin 1 is " + coin1);
			System.out.println("coin 2 is " + coin2);
		}
		int counter = 0;
		for (int x = 0; x < 100; x++){
			coin3.flip();
			System.out.println("Coin 3 is " + coin3);
			if (!coin3.isHeads()){
				counter++;
			}//end of if
			
		}//end of for loop
		System.out.println("There are " + counter + " number of TAILS");
		
		
		

	}

}
