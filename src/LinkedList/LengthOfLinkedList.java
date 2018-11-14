package LinkedList;

public class LengthOfLinkedList {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public int getCount(){
		int c = 0;
		Node temp = head;
		while(temp!=null){
			c++;
			temp = temp.next;
			
		}
		return c;
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
	
	public void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int getCountRec(Node node){
		if(node == null)
			return 0;
		
		return 1 + getCountRec(node.next);
	}
	
	public int getCount1()
	{
		return getCountRec(head);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLinkedList list = new LengthOfLinkedList();
		list.insertEnd(6);
		list.insertEnd(2);
		list.insertEnd(3);
		list.insertEnd(4);
		list.insertEnd(5);
		list.printList();
		System.out.println(list.getCount());
		System.out.println("----------------");
		System.out.println(list.getCount1());
	}

}
