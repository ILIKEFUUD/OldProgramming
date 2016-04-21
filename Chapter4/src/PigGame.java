import java.util.Scanner;

/*
 * Rahul Shah
 * PD2
 * 10/23/14
 * Amberg AP Programming 2
 * Plays the pig game
 * uses PairOfDice to roll dice and determine a winner based on rules
 */
public class PigGame {

	
	public static void main(String[] args) {
		
		//variables
		boolean playerTurn = true, winner = false, 
		winner1 = false, winner2 = false; 
		
		int playerScore = 0, compScore = 0, roundScore = 0;
		String reRoll;
		Scanner scan = new Scanner (System.in);
		PairOfDice gameDice = new PairOfDice(6,6);
		//2 dice with six sides each
		
		//start with player
		while (!winner){
			if (playerTurn){//if it is the player's turn
				
				System.out.println("It is the player's turn," +
						" your score this round is " + roundScore);
				gameDice.roll();
				System.out.println("The dice rolled " + gameDice);
				System.out.println("Hit enter");
				scan.nextLine();
				
				roundScore = gameDice.getTotal();
				//the points from the roll
				
				
				//player rolls snake eyes, passes to computer
				if (gameDice.getFaceValue1() == 1 
						&& gameDice.getFaceValue2() == 1){
					
					System.out.println("Lost everything, whoops");
					System.out.println("Your score is " + playerScore);
					roundScore = 0;
					playerScore = 0;
					playerTurn = false;//should jump to computer's control
				}
				//player got a one, loses roundScore
				else if (gameDice.getFaceValue1() == 1 
						|| gameDice.getFaceValue2() == 1){
					System.out.println("Lost your round score, whoops \n");
					System.out.println("Your " +
							"score at the end of this round is " + playerScore);
					roundScore = 0;
					playerTurn = false;//should jump to computer's control
				}
				//player got a valid roll
				else{
					System.out.println("You got " + 
							roundScore + " points this roll");
					System.out.println("Roll again? y");
					reRoll = scan.nextLine();
					
					if (!reRoll.equalsIgnoreCase("y")){//player wants to pass
						playerScore += roundScore;
						System.out.println("Your total " +
								"score is " + playerScore);
						roundScore = 0;
						playerTurn = false;
					}
					System.out.println(playerScore + roundScore);
					if (playerScore + roundScore >= 100){
						winner = true;//we have a winner
						winner1 = true;//the player won
					}
					
					
					
				}//end of else	
				
				
				
				
			}//end of player's turn
			
				
			
			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			
			
			//computer's turn
			else{
				
				
				
				System.out.println("It is the computer's turn now, " +
						"it has round score of " + roundScore);
				
				
				gameDice.roll();
				System.out.println(gameDice);
				System.out.println("Hit enter");
				scan.nextLine();
				roundScore += gameDice.getTotal();
				//round score is the total of the dice
				
				//computer rolls a snake eyes passes to player
				if (gameDice.getFaceValue1() == 1 && gameDice.getFaceValue2() == 1){
					System.out.println("The computer lost everything \n");
					roundScore = 0;
					compScore = 0;
					playerTurn = true;
				}
				//computer got a one, loses roundScore, passes to player
				else if (gameDice.getFaceValue1() == 1 
						|| gameDice.getFaceValue2() == 1){
					System.out.println("The computer lost its round score \n");
					roundScore = 0;
					playerTurn = true;
				}
				else{//computer rolled a valid roll
					
					System.out.println("The computer got " 
							+ gameDice.getTotal() + " points this roll");
					System.out.println("Hit enter");
					scan.nextLine();
					compScore += roundScore;
					
					if (roundScore >= 20){
						
						System.out.println("The computer got " 
								+ roundScore + " points");
						
						compScore += roundScore;
						playerTurn = true;//should make it go to the players turn
						roundScore = 0;
					}//end of if
					
					if (compScore + roundScore >= 100){
						winner = true;//we have a winner
						winner2 = true;//the computer won
					}
					
				}//end of else
				
				
				
				
			}//end of computer's turn
			
		}//end of while loop
		
		System.out.println("WE HAVE A WINNER");
		if (winner1)
			System.out.println("PLAYER 1 WINS");
		else
			System.out.println("THE COMPUTER WON");
		

	}//end of main
	
	

}//end of PigGame
