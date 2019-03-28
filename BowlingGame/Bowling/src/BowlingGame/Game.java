package BowlingGame;

public class Game {

	private int score = 0;
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins) {
		// TODO Auto-generated method stub
		rolls[currentRoll++] = pins;
	}

	public int score() {
		// TODO Auto-generated method stub
		int firstInFrame = 0;
		for(int frame = 0; frame< 10; frame ++) {
			if(rolls[firstInFrame] == 10) {
				score += 10 + rolls[firstInFrame+1] + rolls[firstInFrame+2];
				firstInFrame+=1;
			}
			else if(rolls[firstInFrame] + rolls[firstInFrame+1] == 10) {
				score += 10 + rolls[firstInFrame+2];
				firstInFrame += 2;
			}
			else {
				score += rolls[firstInFrame] + rolls[firstInFrame+1];
				firstInFrame += 2;
			}
		}
		return score;
	}


}
