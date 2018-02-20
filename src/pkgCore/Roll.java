package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		this.d1 = new Die();
		this.d2 = new Die();
		
		// TODO: Determine 'Score'
		int done = d1.getDieValue();
		int dtwo = d2.getDieValue();
		this.Score = done + dtwo;
	}

	public int getScore() {
		return Score;
	}

}
