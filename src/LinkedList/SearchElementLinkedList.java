package LinkedList;

public class SearchElementLinkedList {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insertEnd(int new_data){
		Node new_node = new Node(new_data);
		
		if(head == null){
			head = new Node(new_data);
			return;
		}
		
		new_node.next = null;
		Node temp = head;
		
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = new_node;
		return;
	}
	
	public boolean search(int key){
		Node temp = head;
		while(temp!=null){
			if(temp.data == key)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	public void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchElementLinkedList list = new SearchElementLinkedList();
		list.insertEnd(1);
		list.insertEnd(2);
		list.insertEnd(3);
		list.insertEnd(4);
		list.insertEnd(5);
		boolean ans = list.search(6);
		if(ans == true)
			System.out.println("Found");
		else
			System.out.println("Not found");
		

	}

}
