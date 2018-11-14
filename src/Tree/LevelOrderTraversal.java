package Tree;

import java.util.LinkedList;
import java.util.Queue;

 class Node1 {
	int key;
	Node1 left;
	Node1 right;
	Node1(int data){
		data = key;
		left = null;
		right = null;
	}
}

public class LevelOrderTraversal {
	Node1 root;
	
	void printOrder(){
		Queue<Node1> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node1 tempNode = queue.poll();
			System.out.println(tempNode.key + " ");
			
			if(tempNode.left!=null){
				queue.add(tempNode.left);
			}
			
			if(tempNode.right!=null){
				queue.add(tempNode.right);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal tree_level = new LevelOrderTraversal(); 
        tree_level.root = new Node1(1); 
        tree_level.root.left = new Node1(2); 
        tree_level.root.right = new Node1(3); 
        tree_level.root.left.left = new Node1(4); 
        tree_level.root.left.right = new Node1(5); 
  
        System.out.println("Level order traversal of binary tree is - "); 
        tree_level.printOrder(); 
	}

}
