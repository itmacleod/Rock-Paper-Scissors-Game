package rockPaperScissorsGame;

import java.util.Random;

public class Player {
	
	private String choice;
	private Random random;
	
	public Player() {
		random = new Random();
	}
	
	public String makeChoice() {
		int decision = random.nextInt(3) + 1;
		if(decision == 1) {
			this.choice = "rock";
		}else if(decision == 2) {
			this.choice = "paper";
		}else {
			this.choice = "scissors";
		}
		
		return this.choice;
	}
	
	

}
