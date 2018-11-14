package LinkedList;

public class LinkedListInsertion {
	
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
	
	//Add a node after a given node
	public void insertAfter(Node prev_node, int new_data){
		if(prev_node == null) {
			System.out.println("The given previous node cannot be null");
		return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public void insertEnd(int new_data){
		Node new_node = new Node(new_data);
		
		if(head == null){
			head = new Node(new_data);
		}
		new_node.next = null;
		Node last = head;
		
		while(last.next!=null){
			last = last.next;
		}
		
		last.next = new_node;
		return;
	}
	
	public void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	void deleteKey(int key){
		Node temp = head, prev = null;
		
		if(temp!=null && temp.data == key){
			head = temp.next;
			return;
		}
		
		while(temp!=null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null)
			return;
		
		prev.next = temp.next;
	}
	
	//delete a linked list node at a given position
	void deleteNode(int position){
		if(head == null)
			return;
		
		Node temp = head;
		
		if(position == 0)
		{
			head = temp.next;
			return;
		}
		
		for(int i = 0;temp!=null && i<position - 1;i++){
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null){
			return;
		}
		
		Node next = temp.next.next;
		
		temp.next = next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListInsertion list = new LinkedListInsertion();
		list.insertAtBeginning(2);
		list.insertAtBeginning(1);
		list.insertEnd(3);
		list.insertEnd(4);
		list.insertEnd(5);
		list.insertEnd(6);
		
		list.insertAfter(list.head.next, 100);
		
		list.printList();
		
		list.deleteKey(3);
		
		list.printList();
	}

}
