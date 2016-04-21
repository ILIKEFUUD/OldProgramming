import java.util.Scanner;
/*
 * Rahul Shah
 * PD2
 * Amberg programming 2
 * 11/12/14
 */


public class Game {

	public static String player1Name, player2Name;
	public static void main(String[] args) {
		int playerTurn;
		int player2Type;
		boolean winner = false;
		Scanner scan =  new Scanner(System.in);
		//make a pile of marbles a random 
		//number from 10-100 inclusive
		Pile gamePile = new Pile((int)(90 * 
				Math.random() + 10));
		
		//make 2 players
		//player 1
		System.out.println("Making Player 1");
		System.out.println("Enter a name for the" +
				" player");
		player1Name = scan.next();
		
		//player 2
		System.out.println("Making opponent");
		System.out.println("Enter difficulty: " +
				"Beginner(0) Expert(1)");
		player2Type = scan.nextInt();
		player2Name = "Computer";
		
		
		//make the 2 player objects
		Player player1 = new Player 
		(2, player1Name);
		Player player2 = new Player (player2Type, 
				player1Name);
		
		//BEGIN GAME------------------------
		//generates number between 0 and 1
		//decides which player goes first
		int decider = (int)((Math.random() + 1)
				+ 0.5);
	
		if (decider == 0){
			System.out.println(player1Name + " " +
					"goes first!");
		}
		else
			System.out.println(player2Name + 
					" goes first!");
		
		playerTurn = decider;
		//turns-------------------
		//runs while there is no winner
		while(!winner){
			if (playerTurn == 0){//first player
				System.out.println("-----" +
						"----------");
				System.out.println(player1Name
						+ "'s TURN");
				System.out.println("Number of " +
						"marbles in the bag: " + 
						gamePile.getMarbles());
				player1.removeMarbles(gamePile);
				System.out.println("Amount of " +
						"marbles in pile: " +
						gamePile.getMarbles());
				winner = isWinner(gamePile, playerTurn);
				playerTurn = 1;
				//end player1 turn
				//begin player2 turn
				
				
			}
			else{//2nd player(computer)
				System.out.println("--" +
						"-------------");
				System.out.println(player2Name 
						+ "'s TURN");
				player2.removeMarbles(gamePile);
				System.out.println("Computer has" +
						" removed marbles");
				System.out.println("Current " +
						"amount of marbles" +
						" in bag: " +
						gamePile.getMarbles());
				winner = isWinner(gamePile, playerTurn);
				playerTurn = 0;
				//end player1 turn
				//begin player2 turn
			}
		}
		
		System.out.println("THANKS" +
				" FOR PLAYING!");
		
		
	}//end of main
	
	//method to see if there is a
	//winner (one marble left)
	public static boolean isWinner(Pile gamePile, int playerTurn){
		if (playerTurn == 0 && gamePile.
				getMarbles() == 1){
			System.out.println(player1Name + " won");
			return true;
			
		}
		else if (playerTurn == 1 && gamePile.
				getMarbles() == 1){
			System.out.println(player2Name +" won");
			return true;
		}
		else
			return false;
	}//end of isWinner, should stop the program

}//end of game
