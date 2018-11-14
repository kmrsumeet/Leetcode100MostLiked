package LinkedList;

public class MiddleOfLinkedList {
	
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
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = new_node;
		
	}
	
	public void printList(){
		Node last = head;
		while(last!=null){
			System.out.print(last.data + " ");
			last = last.next;
		}
		System.out.println();
	}
	
	public void middleElement(){
		Node slow_ptr= head;
		Node fast_ptr = head;
		if(head!=null){
		while(fast_ptr.next!=null && fast_ptr!=null){
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		System.out.print(slow_ptr.data + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleOfLinkedList list = new MiddleOfLinkedList();
		list.insertEnd(1);
		list.insertEnd(2);
		list.insertEnd(3);
		list.insertEnd(4);
		list.insertEnd(5);
		//list.insertEnd(6);
		
		list.printList();
		
		list.middleElement();
	

	}

}
