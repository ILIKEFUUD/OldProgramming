/*
 * Rahul Shah
 * 10/20/14
 * Uses 2 dice and uses a BoxCars method 
 * to roll a PairOfDice 10 times and counts the number
 * of Box Cars
 */
public class PairOfDice {

	
	private Die d1;
	private Die d2;
	
	public PairOfDice(){
		d1 = new Die(6);
		d2 = new Die(6);
	}//defaults to 2 6 sided dice
	
	public PairOfDice(int f){
		d1 = new Die (f);
		d2 = new Die (f);
	}//defaults to 2 f sided dice
	
	public PairOfDice(int s, int p){
		d1 = new Die (s);
		d2 = new Die (p);
	}//sets d1 to s and d2 to p
	
	//modifier
	public void roll(){
		d1.roll();
		d2.roll();
	}
	
	//accessors (?)
	public int getTotal(){
		return d1.getFaceVal() + d2.getFaceVal();
	}
	
	//returns face value of dice one
	public int getFaceValue1(){
		return d1.getFaceVal();
	}
	
	//returns face value of dice two
	public int getFaceValue2(){
		return d2.getFaceVal();
	}
	
	//override toString
	public String toString(){
		return "[" + d1 + ", "+ d2 + "]";
	}
	
	

}//end of PairOfDice
