package Tree;

class BSTNode {
	int data;
	BSTNode left, right;
	
	BSTNode(int d) {
		// TODO Auto-generated constructor stub
		data = d;
		left = right = null;
	}
}

public class BinarySearchTreeInsertion {
	
	BSTNode root;
	private int sum = 0;
	
	public BinarySearchTreeInsertion() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	void insert(int key){
		root = insertRec(root,key);
		
	}
	
	BSTNode search(BSTNode root,int key){
		if(root == null || root.data == key)
			return root;
		
		if(root.data > key)
			return search(root.left,key);
		
		return search(root.right,key);
			
	}
	

	private BSTNode insertRec(BSTNode root, int key) {
		// TODO Auto-generated method stub
		if(root == null){
			root = new BSTNode(key);
			return root;
		}
		else {
			if(root.data > key){
				root.left = insertRec(root.left,key);
			}
			else
				root.right = insertRec(root.right, key);
		}
		
		return root;
	}
	
	void inorder()  { 
	       inorderRec(root); 
	    } 
	  
	    // A utility function to do inorder traversal of BST 
	    void inorderRec(BSTNode root) { 
	        if (root != null) { 
	            inorderRec(root.left); 
	            System.out.print(" "+ root.data); 
	            inorderRec(root.right); 
	        } 
	    } 
	    
	    void convertBST(){
	    	convertBSTRec(root);
	    }
	    
	    public BSTNode convertBSTRec(BSTNode root) {
	    	if(root!=null){
	    		convertBSTRec(root.right);
	    		sum = sum + root.data;
	    		root.data = sum;
	    		convertBSTRec(root.left);
	    	}
	    	return root;
	    }
	    
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeInsertion tree = new BinarySearchTreeInsertion();
		/*tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
  */
		
		tree.insert(5);
		tree.insert(2);
		tree.insert(13);
        // print inorder traversal of the BST 
        tree.inorder(); 
        
        
        tree.convertBST();
        
        System.out.println("After converting");
        tree.inorder();
        //System.out.println(sear);
	}

}
