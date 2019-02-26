package chapter9_ExceptionHandling;

public class Highscore {

	private int score = 0;
	private boolean scoreSet = false;
	
	public Highscore() {
		score = 0;
		scoreSet = false;
	}
	
	public void setScore(int newScore) {
		score = newScore;
		scoreSet = true;
	}
	
	public int getScore() throws ScoreNotSetException{
		if (!scoreSet)
			throw new ScoreNotSetException();
		else
			return score;
	}
	
	//short test program
	
	public static void main(String[] args) {
		Highscore highscore = new Highscore();
		try {
			System.out.println(highscore.getScore());
		}
		catch(ScoreNotSetException e){
			System.out.println(e.getMessage());
							}
		highscore.setScore(100);
	
	try {
		System.out.println(highscore.getScore());
	}
	catch (ScoreNotSetException e) {
		System.out.println(e.getMessage());
	}
	//allows program to tell difference between highscore of -1 and not set
	}
}
