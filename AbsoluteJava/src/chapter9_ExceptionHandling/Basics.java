package chapter9_ExceptionHandling;

public class Basics extends ExceptionMethods {
	public static void main(String[] args) throws Exception {
		try {
			basics();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Aborting Program");
			System.exit(0);

		}

		try {
			handlingWithScanner();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Aborting program");
			System.exit(0);
		}

		throwingExceptions();
		exceptionClass();
		multipleCatchBlocks();
		
		//start 9.2 page 536
		throwingExceptionsInMethods();
		exceptionsToCatchOrDeclareRule();
		eventDrivenProgramming();
		//start 9.3 page 569
		moreTechniques();
	}
}
