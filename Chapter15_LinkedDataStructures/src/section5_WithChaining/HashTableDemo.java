package section5_WithChaining;

public class HashTableDemo {

	public static void main(String[] args) {
		HashTable h = new HashTable();
		
		System.out.println("Adding dog, cat, turtle, bird");
		h.put("dog");
		h.put("cat");
		h.put("turtle");
		h.put("bird");
		
		System.out.println("Contains dog? " + h.containsString("dog"));
		System.out.println("Contains cow? " + h.containsString("cow"));
	}
}
