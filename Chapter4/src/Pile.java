/*
 * Rahul Shah
 * Pd 6
 * Amberg programming 2
 * 11/12/14
 * Represents the pile of marbles
 */
public class Pile {
	//variables
	private int size;
	//constructor
	public Pile(int size){
		this.size = size;
	}
	
	//methods
	//returns the number of marbles in the pile
	public int getMarbles(){
		return size;
	}
	
	//takes out the number of marbles sent to it
	//subtracts from the pile
	//COMPUTER'S REMOVE
	public void remove (int marblesToRemove){
		size -= marblesToRemove;
	}
	
	//override toString
	//returns the size as a string
	public String toString(){
		return "" + size;
	}
	
	
	
	

}//end of Pile

    