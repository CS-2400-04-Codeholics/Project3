public class DriverBT
{
	public static void main(String[] args)
	{
		System.out.print("1st Testing Example:\n");
		BinaryTree<String> aTree = new BinaryTree<>();
		createTree1(aTree);
		
		System.out.print("(BinaryTree) post-order:\n");
		aTree.postorderTraverse();
		
		System.out.print("\n(BinaryNode) post-order:\n");
		aTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.print("\n");
		
		System.out.print("(BinaryTree) Height of tree is " + aTree.getHeight() + "\n");
		System.out.print("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod() + "\n");
		
		System.out.print("\n");
		
		System.out.print("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes() + "\n");
		System.out.print("(BinaryNode) # nodes of tree is " + aTree.getNumberOfNodes_callBinaryNodeMethod() + "\n");

		System.out.print("==========================================\n");
		System.out.print("\n");
		
		System.out.print("2nd Testing Example:\n");
		BinaryTree<String> aTree2 = new BinaryTree<>();
		createTree2(aTree2);
		
		System.out.print("(BinaryTree) post-order:\n");
		aTree2.postorderTraverse();
		
		System.out.print("\n(BinaryNode) post-order:\n");
		aTree2.postorderTraverse_callBinaryNodeMethod();
		
		System.out.print("\n");
		
		System.out.print("(BinaryTree) Height of tree is " + aTree2.getHeight() + "\n");
		System.out.print("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod() + "\n");
		
		System.out.print("\n");
		
		System.out.print("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes() + "\n");
		System.out.print("(BinaryNode) # nodes of tree is " + aTree2.getNumberOfNodes_callBinaryNodeMethod() + "\n");
		
		System.out.print("Done.\n");

	}  // end main

	public static void createTree1(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

		tree.setTree("A", bTree, cTree);
		
      	System.out.print("\nGiven Tree:\n\n");
      	System.out.print("     A\n");
      	System.out.print("   /   \\\n");
      	System.out.print("  B     C\n");
      	System.out.print(" / \\   /\n");
      	System.out.print("D   E  F\n");
      	System.out.print("        \\\n");
      	System.out.print("         G\n");
      	System.out.print("\n");
	} // end createTree
	
	/**-------------------------------------------------------------------- */
	/**Task 4: Create a tree case as shown in assignment 3*/
	public static void createTree2(BinaryTree<String> tree)
	{
		// Leaves
		BinaryTree<String> bTree = new BinaryTree<>("B");
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");
		BinaryTree<String> hTree = new BinaryTree<>("H");

		// Subtrees:
		BinaryTree<String> dTree = new BinaryTree<>("D", fTree, null);
		BinaryTree<String> eTree = new BinaryTree<>("E", gTree, hTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", dTree, eTree);

		tree.setTree("A", bTree, cTree);

		System.out.print("\nGiven Tree:\n\n");
		System.out.print("      A\n");
		System.out.print("    /   \\\n");
		System.out.print("   B     C\n");
		System.out.print("       /   \\\n");
		System.out.print("      D     E\n");
		System.out.print("     /    /   \\\n");
		System.out.print("    F    G     H\n");
		System.out.print("\n");
	} // end createTree2

}  // end DriverBT
