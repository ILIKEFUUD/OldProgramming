//Coin.java
// represents a coin with 2 sides that can be flipped

public class Coin
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	// data attributes of a coin 
	private int face;
	
	// constructors 
	
	public Coin ()
	{
		flip();
	}
	
	public Coin (int f)
	{
		if ( f < 0 || f > 1)
			face = HEADS;
		else face = f;
		
	}	
		
	// modifier 
	public void flip()
	{
		face = (int) (Math.random()*2);
	}
		
	// accessors 
	public boolean isHeads ()
	{
		return (face == HEADS);
	}
	
	public String toString ()	{

		if (face == HEADS)
			return "Heads";
		else 
			return "Tails";
		
	}
 
}
