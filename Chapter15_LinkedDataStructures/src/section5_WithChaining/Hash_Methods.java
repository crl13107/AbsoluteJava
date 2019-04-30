package section5_WithChaining;

public class Hash_Methods {

	public static void intro() {
		System.out.println("Hash table with chain = array with mod chaining on each index.");
		System.out.println("Worst case hash table has O(N), but very unlikely");
		System.out.println("Can create hash function with weight depending on letter");
		System.out.println("So that tar and rat go to different locations");
		System.out.println("Another solution is to make the table bigger. 10000 vs 10 loser collision chance");
		System.out.println("This memory for time is known as time-space tradeoff");
	}
}
