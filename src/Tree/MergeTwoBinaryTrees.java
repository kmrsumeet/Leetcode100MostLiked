package Tree;

class TreeNode {
	int data;
	TreeNode left,right;
	
	public TreeNode(int x) {
		// TODO Auto-generated constructor stub
		this.data = x;
		this.left = null;
		this.right = null;
	}
}


public class MergeTwoBinaryTrees {
	TreeNode root;

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null)
			return t2;
		
		if(t2 ==  null)
			return t1;
		
		t1.data+=t2.data;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		
		return t1;
	}
	
	public void inOrder(TreeNode node){
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.print(" " + node.data);
		inOrder(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeTwoBinaryTrees tree_level = new MergeTwoBinaryTrees();
		
		System.out.println("1st Tree");
		
		tree_level.root = new TreeNode(1);
		tree_level.root.left = new TreeNode(3);
		tree_level.root.right = new TreeNode(2);
		tree_level.root.left.left = new TreeNode(5);
		
		tree_level.inOrder(tree_level.root);
		System.out.println();
		
		System.out.println("2nd Tree");
		MergeTwoBinaryTrees tree_level_1 = new MergeTwoBinaryTrees();

		tree_level_1.root = new TreeNode(2);
		tree_level_1.root.left = new TreeNode(1);
		tree_level_1.root.right = new TreeNode(3);
		tree_level_1.root.left.right = new TreeNode(4);
		tree_level_1.root.right.right = new TreeNode(7);
		
		tree_level_1.inOrder(tree_level_1.root);
		
		System.out.println();
		
		MergeTwoBinaryTrees tree_level_2 = new MergeTwoBinaryTrees();
		
		TreeNode t3 = tree_level_2.mergeTrees(tree_level.root,tree_level_1.root);
		
		System.out.println("After merging");
		
		tree_level_2.inOrder(t3);
		
	}

}
