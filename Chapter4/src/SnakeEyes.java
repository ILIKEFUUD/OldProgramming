
public class SnakeEyes {

	
	public static void main(String[] args) {
		
		//variables
		Die d1 = new Die (6);
		Die d2 = new Die (6);
		
		int count = 0;
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		d1.roll();
		d2.roll();
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		for (int x = 0; x < 1000; x++){
			//roll the dice
			d1.roll();
			d2.roll();
			//display results of rolling
			System.out.println("d1 = " + d1);
			System.out.println("d2 = " + d2);
			
			if (d1.getFaceVal() == 1 && d2.getFaceVal()==1){
				count++;
			}
			
		}
		System.out.println("You rolled " + count + " snake eyes");
		
	}//end of main

}//end of SnakeEyes
