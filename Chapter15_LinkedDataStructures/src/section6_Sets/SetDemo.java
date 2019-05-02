package section6_Sets;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> round = new Set<String>();
		Set <String>green = new Set<String>();
		round.add("Peas");
		round.add("ball");
		round.add("pie");
		round.add("grapes");
		
		green.add("Peas");
		
		System.out.println("Contents of round: ");
		round.output();
		System.out.println("Contents of green: ");
		green.output();
		System.out.println();
		
		System.out.println("Ball in set round? "+ round.contains("ball"));
		System.out.println("Ball in set green? " + green.contains("ball"));
		
		System.out.println("Union of green and round: ");
		round.union(green).output();
		System.out.println("Insersection of green and rounds");
		round.intersection(green).output();
	}
}
