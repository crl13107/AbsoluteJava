package chapter9_ExceptionHandling;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception {

	public NegativeNumberException() {
		super("Negative Number exception!");
	}
	
	public NegativeNumberException(String message) {
		super(message);
	}
}
