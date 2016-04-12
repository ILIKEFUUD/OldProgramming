//this class is used to represent a coin that can be flipped
/*
 * Rahul Shah
 * PD2
 * 4/21/14
 */
public class Coin {

	//instance variables
	private int face;
	
	
	//class constants
	private static final int HEADS = 0;
	private static final int TAILS = 1;
	
	//constructor
	//set up a coin to start on HEADS
	
	public Coin(){
		face = HEADS;
	}
	
	//modifier
	//simulates flipping a coin
	
	public void flip (){
		face = (int) (Math.random() * 2);
	}
	
	//accessor
	public boolean isHeads(){
		return (face == HEADS);
	}
	
	//toString - called with print and println
	public String toString(){
		String temp;
		if (face == HEADS){
			temp = "heads";
		}else 
			temp = "tails";
		return temp;
	}
	//check to see if 2 coins are equal
	public boolean equals (Object obj){
		//cast object to a coin
		Coin c = (Coin) obj;
		return (face == c.face);
	}
	
	

}//end of Coin
