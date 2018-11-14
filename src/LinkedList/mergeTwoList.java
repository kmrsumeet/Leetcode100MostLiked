package LinkedList;

import LinkedList.NthNodeFromEnd.Node;

public class mergeTwoList {
	
Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insert_end(int new_data){
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
		
	}
	
	public Node printList1(Node node){
		while(node!=null){
			System.out.print(node.data + " ");
			node = node.next;
		}
		return node;
	}
	
	public Node mergeTwoSortedList(Node l1, Node l2){
		Node result = null;
		if(l1 == null)
			return l2;
		
		if(l2 == null)
			return l1;
		
		if(l1.data <= l2.data){
			result = l1;
			result.next = mergeTwoSortedList(l1.next, l2);
		}
		else
		{
			result = l2;
			result.next = mergeTwoSortedList(l1, l2.next);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeTwoList list = new mergeTwoList();
		mergeTwoList list2 = new mergeTwoList();
		list.insert_end(1);
		list.insert_end(2);
		list.insert_end(4);
		
		list2.insert_end(1);
		list2.insert_end(3);
		list2.insert_end(5);
		
		System.out.println("1st list");
		list.printList();
		
		System.out.println("2nd list");
		list2.printList();
		
		System.out.println("After merge");
		
		mergeTwoList res = new mergeTwoList();
		
		
		Node head1 = res.mergeTwoSortedList(list.head, list2.head);
		
		
		
		
		res.printList1(head1);
				
	}

}
