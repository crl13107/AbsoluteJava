package section7_Trees;

public class TreeMethods {

	public static void intro() {
		System.out.println("Binary tree has exactly 2 link variables.");
		System.out.println("Head is refered to as the root node, you can reach any node from the root.");
		System.out.println("Preorder: MLR, Inorder: LMR, Postorder: LRM");
		System.out.println("Binary search tree must follow 3 rules:");
		System.out.println("1) all values in the left subtree less than value in root node.");
		System.out.println("2) all values in the right subtree greater or equal to value in root node.");
		System.out.println("3) These rules apply recursivley to each of the subtrees.");
	}

	public static void effecinecyOfSearchTrees() {
		System.out.println("Tree effeciency only needs to be close to balanced.");
		System.out.println("Any search or containes will be Log(N)");
		System.out.println("Maintaining a search tree beyond scope of thise book //todo look it up.");

	}
}
