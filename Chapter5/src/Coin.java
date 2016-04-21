import java.util.Scanner;
//Rahul Shah
//Coin.java
// represents a coin with 2 sides that can be flipped
//implement Lockable

public class Coin implements Lockable{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	// data attributes of a coin 
	private int face;
	private int key;
	private boolean isLocked = false;
	private Scanner scan = new Scanner(System.in);
	// constructors 
	
	public Coin ()
	{
		key = 1111;
		isLocked = false;
		flip();
	}//end of constructor
	
	public Coin (int f)
	{
		if ( f < 0 || f > 1)
			face = HEADS;
		else face = f;
		
		System.out.println("Enter a key: ");
		int k = scan.nextInt();
		setKey(k);
		lock(key);
	}//end of custom constructor
		
	// modifier 
	public void flip()
	{
		if (isLocked){
			System.out.println("Coin locked");
		}
		else 
			face = (int) (Math.random()*2);
	}//end of flip
		
	// accessors 
	//returns the state of coin if unlocked
	public boolean isHeads(){
		if (isLocked){
			System.out.println("Locked- returning false by default");
			return false;
		}
		else
			return (face == HEADS);
			
	}//end of isHeads()
	//returns the state as a string if unlocked
	public String toString ()	{
		if(!isLocked){
			if (face == HEADS)
				return "Heads";
			else 
				return "Tails";
		}else
			return "The coin is Locked!";
		
	}//end of toString
	//lockable
	
	//sets the key
	public void setKey(int key){
		if(!isLocked){
			this.key = key;
		}
		else
			System.out.println("Coin is locked");
	}//end of setKey
	
	//locks the coin
	public void lock(int key){
		if (isLocked){
			System.out.println("It is locked");
		}
		else{
			if(key == this.key){
				isLocked = true;
				
			}
			else
				System.out.println("Incorrect Key");
		}
	}//end of lock
	
	//unlocks the coin
	public void unlock(int key){
		if(isLocked){
			if (key == this.key){
				isLocked = false;
			}
			
		}
		
	}//end of unlock
	//returns state of isLocked
	public boolean locked(){
		return isLocked;
	}//end of locked
 
}//end of Coin
