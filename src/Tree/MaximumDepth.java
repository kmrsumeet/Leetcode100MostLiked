package Tree;

class TreeNodes {
	int data;
	TreeNodes left, right;
	
	public TreeNodes(int d) {
		// TODO Auto-generated constructor stub
		this.data = d;
		left = null;
		right = null;
	}
}
public class MaximumDepth {
	
	TreeNodes root;
	
	int maxDepthBinaryTree(TreeNodes root){
		if(root == null)
			return 0;
		
		else {
			int leftDepth = maxDepthBinaryTree(root.left);
			int rightDepth = maxDepthBinaryTree(root.right);
			
			if(leftDepth > rightDepth){
				return leftDepth + 1;
			}
			else
				return rightDepth + 1;
		}
	}
	
	void inOrder(TreeNodes node){
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.print(" " + node.data);
		inOrder(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaximumDepth tree_node = new MaximumDepth();
		tree_node.root = new TreeNodes(1);
		tree_node.root.left = new TreeNodes(2);
		tree_node.root.right = new TreeNodes(3);
		
		tree_node.root.left.left = new TreeNodes(4);
		tree_node.root.left.right = new TreeNodes(5);
		
		int maxDep = tree_node.maxDepthBinaryTree(tree_node.root);
		
		System.out.println("Max Depth is :"+ maxDep);		

	}

}
