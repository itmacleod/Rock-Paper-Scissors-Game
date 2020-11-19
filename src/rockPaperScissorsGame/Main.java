package rockPaperScissorsGame;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the rock, paper, scissors game!");
		boolean play = true;
		
		while(play) {
			Player player1 = new Player();
			Player player2 = new Player();
			boolean beginGame = true;
			while(beginGame) {
				System.out.println("Rock, paper, scissors, shoot!");
				String player1Choice = player1.makeChoice();
				String player2Choice = player2.makeChoice();
				
				System.out.println("Player 1: " + player1Choice);
				System.out.println("Player 2: " + player2Choice);
				
				if((player1Choice.equalsIgnoreCase("rock") & (player2Choice.equalsIgnoreCase("paper")))) {
					System.out.println("Player 2 wins!");
					beginGame = false;
				}else if((player1Choice.equalsIgnoreCase("rock") & (player2Choice.equalsIgnoreCase("scissors")))) {
					System.out.println("Player 1 wins!");
					beginGame = false;
				}else if((player1Choice.equalsIgnoreCase("scissors") & (player2Choice.equalsIgnoreCase("rock")))) {
					System.out.println("Player 2 wins!");
					beginGame = false;
				}else if((player1Choice.equalsIgnoreCase("scissors") & (player2Choice.equalsIgnoreCase("paper")))) {
					System.out.println("Player 1 wins!");
					beginGame = false;
				}else if((player1Choice.equalsIgnoreCase("paper") & (player2Choice.equalsIgnoreCase("scissors")))) {
					System.out.println("Player 2 wins!");
					beginGame = false;
				}else if((player1Choice.equalsIgnoreCase("paper") & (player2Choice.equalsIgnoreCase("rock")))) {
					System.out.println("Player 1 wins!");
					beginGame = false;
				}
				
				
			}
			
			System.out.println("Do you want to play again? y/n");
			String response = scan.next();
			if(response.equalsIgnoreCase("n")) {
				play = false;
				System.out.println("Thanks for playing!");
			}
			
			
		}

	}

}
