package LinkedList;

public class NthNodeLinkedList {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insertAtBeginning(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public int getNthNode(int n){
		Node temp = head;
		int count = 0;
		while(temp!=null){
			if(count == n)
			{
				return temp.data;
			}
			count++;
			temp = temp.next;
		}
		assert(false);
		return 0;
	}
	
	void printList(){
		Node temp = head;
		
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthNodeLinkedList list = new NthNodeLinkedList();
		list.insertAtBeginning(5);
		list.insertAtBeginning(4);
		list.insertAtBeginning(3);
		list.insertAtBeginning(2);
		list.insertAtBeginning(1);
		int x = list.getNthNode(2);
		System.out.println(x);
		
		
	}

}
