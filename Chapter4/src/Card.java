/*
 * Rahul Shah
 * AP Programming 
 * Amberg
 * 11/5/14
 * Card.java
 */
public class Card {
                                                                	
	//constants for face cards
	
	public final static int ACE = 1, JACK = 11, 
	QUEEN = 12, KING = 13;
	public final static int CLUBS = 1, 
	DIAMONDS = 2, HEARTS = 3, SPADES = 4;
	
	//instance variables
	private int faceValue;
	private int suitValue;
	//strings
	private String faceName, suitName;
	
	//constructors
	//random card
	public Card(){
		faceValue = (int)(12 * Math.random() + 1);
		suitValue = (int)(3 * Math.random() + 1);
		setFaceName();
		setSuitName();

	}//end of first constructor
	
	//creates a card to the specified suit and face 
	//value
	public Card(int faceValue, int suitValue){
		this.faceValue = faceValue;
		this.suitValue = suitValue;
		setFaceName();
		setSuitName();
	}//end of second constructor
	
	//--------------------------------------------
	//sets the string representation of the face 
	//using its stored numeric value
	private void setFaceName(){
		
		if (faceValue == ACE)
			faceName = "ACE";
		else if (faceValue == 2)
			faceName = "2";
		else if (faceValue == 3)
			faceName = "3";
		else if (faceValue == 4)
			faceName = "4";
		else if (faceValue == 5)
			faceName = "5";
		else if (faceValue == 6)
			faceName = "7";
		else if (faceValue == 8)
			faceName = "8";
		else if (faceValue == 9)
			faceName = "9";
		else if (faceValue == 10)
			faceName = "10";
		else if (faceValue == JACK)
			faceName = "JACK";
		else if (faceValue == QUEEN)
			faceName = "QUEEN";
		else 
			faceName = "KING";
		
		
			
	}//end of setFaceName
	
	//Sets the string representation of the suit 
	//using its stored numeric value
	private void setSuitName(){
		if (suitValue == CLUBS)
			suitName = "CLUBS";
		else if (suitValue == DIAMONDS)
			suitName = "DIAMONDS";
		else if (suitValue == HEARTS)
			suitName = "HEARTS";
		else
			suitName = "SPADES";
		
	}//end of setSuitName
	
	//override toString
	//returns the string representation of this 
	//card including both face and suit
	public String toString(){
		String str = ("The " + faceName +" of " + suitName);
		
		return str;
		
	}//end of toString
	
	//----------------------------------------
	//returns the face (numeric value) of 
	//this card
	public int getFace(){
		return faceValue;
	}//end of getFace
	//returns the suit (numeric value) of the card
	public int getSuit(){
		return suitValue;
	}//end of getSuit
	//returns the face (String value) of the card
	public String getFaceName(){
		return faceName;
	}//end of getFaceName
	//returns  the suit (String value) of the card
	public String getSuitName(){
		return suitName;
	}//end of getSuitName
	
	
	
	/*
	 * Determines if this card is higher than the  
	 * passed card assumes that ACE is the highest card
	 * use the suit if both cards have the same face
	 */
	public boolean isHigherThan(Card card2){
		if (this.faceValue == ACE && card2.faceValue 
				== ACE){
			if (this.suitValue <= card2.suitValue)
				return false;
			else if (this.suitValue > card2.suitValue)
				return true;
			else//if it is equal
				return false;
		}
		else if (this.faceValue == ACE && card2.faceValue
				!= ACE){
			return true;
		}
		else if (card2.faceValue == ACE && this.faceValue
				!= ACE){
			return false;
		}
		else if (this.faceValue <= card2.faceValue){
			return false;
		}
		else 
			return true;
			
			
	}//end of first isHigherThan
	
	/*
	 * Determines if this card is higher than the 
	 * passed card. The second parameter determines 
	 * if aces should be considered high 
	 * (beats a king) or low (lowest of all faces).
	 * Uses the suit if both cards have the same face
	 */
	public boolean isHigherThan(Card card2, boolean
			aceHigh){
		if (aceHigh){
			return this.isHigherThan(card2);
				
		}else
			if (this.faceValue == card2.getFace()){
				if (this.suitValue > 
				card2.getSuit())
					return true;
				else if (this.suitValue <=
					card2.getSuit())
					return false;
				else
					return false;
			}
			else if (this.faceValue >=
				card2.getFace()){
				return true;
			}
			else
				return false;
	}//end of second isHigherThan
	

}//end of Card
