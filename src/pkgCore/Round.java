package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore
		Roll comeOutScore = new Roll();
		this.ComeOutScore = comeOutScore.getScore();
		rolls.add(comeOutScore);
		
		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		// TODO: value the eGameResult after the round is complete		
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			this.eGameResult = eGameResult.CRAPS;
		} else if (ComeOutScore == 7 || ComeOutScore == 11) {
			this.eGameResult = eGameResult.NATURAL;
		} else {			
			boolean x = true;

			while (x) {
				Roll current = new Roll();
				rolls.add(current);
								
				if (current.getScore() == ComeOutScore) {
					x = false;
					this.eGameResult = eGameResult.POINT;
				} else if (current.getScore() == 7) {
					x = false;
					this.eGameResult = eGameResult.SEVEN_OUT;
				}
			}
		}
	}
	
	public int RollCount() {
		// TODO: Return the roll count
		return rolls.size();
	}
}
