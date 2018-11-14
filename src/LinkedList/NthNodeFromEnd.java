package LinkedList;

public class NthNodeFromEnd {
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insertAtEnd(int new_data){
		Node new_node = new Node(new_data);
		if(head ==  null)
		{
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
	
	public void getNthNodeFromEnd(int n){
		
		Node temp1 = head;
		Node temp2 = head;
		int count1 = 0;
		
		if(head!=null){
			while(count1 < n){
				if(temp1 == null) {
					System.out.println(n + "is greater than the no");
					return;
				}
				temp1 = temp1.next;
				count1++;
			}
			while(temp1!=null){
				temp1= temp1.next;
				temp2 = temp2.next;
				
			}
			System.out.println("Node no "+n+" from last is" + temp2.data);
		}
		
	}
	
	public void printList(){
		Node last = head;
		while(last!=null){
			System.out.println(last.data + " ");
			last = last.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthNodeFromEnd list = new NthNodeFromEnd();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		
		list.printList();
		System.out.println("---------------------------------");
		
		list.getNthNodeFromEnd(4);
		
		
		

	}

}
