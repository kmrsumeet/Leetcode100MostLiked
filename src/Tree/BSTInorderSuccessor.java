package Tree;

class Node2 { 
	  
    int data; 
    Node2 left, right, parent; 
  
    Node2(int d) { 
        data = d; 
        left = right = parent = null; 
    } 
}
public class BSTInorderSuccessor {
	
	static Node head; 
	
	Node2 insert(Node2 node, int data) { 
		  
        /* 1. If the tree is empty, return a new,      
         single node */
        if (node == null) { 
            return (new Node2(data)); 
        } else { 
  
            Node2 temp = null; 
              
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) { 
                temp = insert(node.left, data); 
                node.left = temp; 
                temp.parent = node; 
  
            } else { 
                temp = insert(node.right, data); 
                node.right = temp; 
                temp.parent = node; 
            } 
  
            /* return the (unchanged) node pointer */
            return node; 
        } 
    } 
	
	Node2 inOrderSuccessor(Node2 root, Node2 n) { 
		  
        // step 1 of the above algorithm  
        if (n.right != null) { 
            return minValue(n.right); 
        } 
  
        // step 2 of the above algorithm 
        Node2 p = n.parent; 
        while (p != null && n == p.right) { 
            n = p; 
            p = p.parent; 
        } 
        return p; 
    } 
  
    /* Given a non-empty binary search tree, return the minimum data   
     value found in that tree. Note that the entire tree does not need 
     to be searched. */
    Node2 minValue(Node2 node) { 
        Node2 current = node; 
  
        /* loop down to find the leftmost leaf */
        while (current.left != null) { 
            current = current.left; 
        } 
        return current; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTInorderSuccessor tree = new BSTInorderSuccessor();
		 Node2 root = null, temp = null, suc = null, min = null; 
	        root = tree.insert(root, 20); 
	        root = tree.insert(root, 8); 
	        root = tree.insert(root, 22); 
	        root = tree.insert(root, 4); 
	        root = tree.insert(root, 12); 
	        root = tree.insert(root, 10); 
	        root = tree.insert(root, 14); 
	        
	        temp = root.left.right.right; 
	        suc = tree.inOrderSuccessor(root, temp); 
	        if (suc != null) { 
	            System.out.println("Inorder successor of " + temp.data +  
	                                                      " is " + suc.data); 
	        } else { 
	            System.out.println("Inorder successor does not exist"); 
	        } 
	}

}
