package chapter9_ExceptionHandling;

@SuppressWarnings("serial")
public class BadNumberException extends Exception {
	private int badNumber;

	public BadNumberException(int number) {
		super("BadNumber Exception");
		badNumber = number;
	}

	public BadNumberException() {
		super("BadNumberException");
	}

	public BadNumberException(String message) {
		super(message);
	}

	public int getBadNumber() {
		return badNumber;
	}
}
