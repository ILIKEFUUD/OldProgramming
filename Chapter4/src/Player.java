import java.util.Scanner;

/*
 * Rahul Shah
 * Period 6
 * Amberg programming 2
 * 11/12/14
 */
public class Player {
	//instance variables
	private int playerType;
	private String playerName;
	private final int BEGINNER = 0, EXPERT = 1,
	PLAYER = 2;
	
	//constructor 1
	//sets the opponent of the player
	public Player (int opponent){
		if (opponent == BEGINNER){
			this.playerType = BEGINNER;
			playerName = "Computer";
		}
		else if (opponent == EXPERT){
			this.playerType = EXPERT;
			playerName = "Computer";
		}
		else {
			opponent = PLAYER;
			playerName = "Player";
		}
		
	}
	
	//constructor 2
	//sets the game type and the name of the 
	//player
	public Player (int opponent, String name){
		if (opponent == BEGINNER){
			this.playerType = BEGINNER;
			playerName = "computer";
		}
		else if (opponent == EXPERT){
			this.playerType = EXPERT;
			playerName = "computer";
		}
		else{
			playerType = PLAYER;
			playerName = name;
		}
	}
	
	//decides how many marbles to remove in 
	//Pile.remove
	public void removeMarbles(Pile 
			marblePile){
		Scanner scan = new Scanner 
		(System.in);
		if (this.playerType == BEGINNER){
			marblePile.remove((int) 
					(((marblePile.getMarbles()/2) 
							* Math.random() + 1)));
		}//end of beginner mode remove
		else if (this.playerType == EXPERT){
			
			//remove enough so that the remaining 
			//is a power of 2 minus 1.

			if (marblePile.getMarbles() > 63){
				marblePile.remove(marblePile.
						getMarbles() - 63);	
			}
			else if (marblePile.getMarbles() > 31
					&& marblePile.getMarbles() != 63){
				marblePile.remove
				(marblePile.getMarbles() - 31);
				
			}
			else if (marblePile.getMarbles() > 15 
					&& marblePile.getMarbles() != 31){
				marblePile.remove
				(marblePile.getMarbles() - 15);
				
			}
			else if (marblePile.getMarbles() > 7
					&& marblePile.getMarbles() != 15){
				marblePile.remove
				(marblePile.getMarbles() - 7);
				
			}
			else if (marblePile.getMarbles() > 3 &&
					marblePile.getMarbles() != 7){
				marblePile.remove
				(marblePile.getMarbles() - 3);
			}
			else
				marblePile.remove
				((int)((marblePile.
						getMarbles()/2 - 1)
						* Math.random() + 1));
				
		}//end of the expert mode remove
		
		else{//human player
			boolean isValid = false;
			int take = 0;
			while(!isValid){
				System.out.println("Enter the " +
						"amount you want to" +
						" remove" +
						" ");
				take = scan.nextInt();
				if (take > marblePile.getMarbles()
						/2){
					isValid = false;
				}
				else{
					isValid = true;
				}
			}//end of while
			//when take is valid
			marblePile.remove(take);
			
			
			
		}//end of human mode remove
		
		
			
			
	}//end of removeMarbles
	
	public String toString(){
		return playerName + " " + playerType;
	}//end of toString
	


}
