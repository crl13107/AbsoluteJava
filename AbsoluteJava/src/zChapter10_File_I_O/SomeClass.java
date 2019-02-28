package zChapter10_File_I_O;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SomeClass implements Serializable {

	/**
	 * 
	 */

	@SuppressWarnings("unused")
	private int number;
	private char letter;

	public SomeClass(int a, char b) {
		this.number = a;
		this.setLetter(b);
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public String toString() {
		return(number + ", " + letter + ".");
	}

}
