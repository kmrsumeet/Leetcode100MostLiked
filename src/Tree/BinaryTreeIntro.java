package Tree;

class Node {
	int key;
	Node left,right;
	
	public Node(int item){
		key = item;
		left = right = null;
	}
}

public class BinaryTreeIntro {
	
	Node root;
	public BinaryTreeIntro(int key) {
		// TODO Auto-generated constructor stub
		root = new Node(key);
	}
	
	public BinaryTreeIntro() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	int diameter(){
		return diameterR(root);
	}
	
	int maxDepthBinaryTree(Node root){
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
	
	private int diameterR(Node root) {
		// TODO Auto-generated method stub
		if(root == null)
			return 0;
		
		int lheight = maxDepthBinaryTree(root.left);
		int rheight = maxDepthBinaryTree(root.right);
		
		int ldiameter = diameterR(root.left);
		int rdiameter = diameterR(root.right);
		
		return Math.max(lheight + rheight + 1, Math.max(ldiameter,rdiameter));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeIntro tree = new BinaryTreeIntro();
		
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println();
		System.out.println(tree.diameter());
	}

}
