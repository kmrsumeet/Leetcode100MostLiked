package LinkedList;

import java.util.HashMap;

import LinkedList.NthNodeFromEnd.Node;


public class IntersectionOfTwoLinkedList {
	
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
	}
	
	Node intersectionPoint(Node l1, Node l2){
		Node last = l1;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		while(last!=null){
			hmap.put(last.data,1);
			last = last.next;
		}
		Node temp1 = l2;
		Node res = null;
		while(temp1!=null){
			if(hmap.containsKey(temp1.data)){
				res =  temp1;
				break;
			}
			else
				temp1 = temp1.next;
		}
		return res;
		
	}
	
	public Node printList1(Node node){
		while(node!=null){
			System.out.print(node.data + " ");
			node = node.next;
		}
		return node;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfTwoLinkedList list = new IntersectionOfTwoLinkedList();
	//	mergeTwoList list2 = new mergeTwoList();
		list.insertEnd(3);
		list.insertEnd(6);
		list.insertEnd(9);
		list.insertEnd(15);
		list.insertEnd(30);
		
		System.out.println("1st list");
		
		list.printList();
		
		
		
		IntersectionOfTwoLinkedList list1 = new IntersectionOfTwoLinkedList();
		//	mergeTwoList list2 = new mergeTwoList();
			list1.insertEnd(10);
			list1.insertEnd(15);
			list1.insertEnd(30);
			
			System.out.println("2nd list");
			
			list1.printList();
		
			IntersectionOfTwoLinkedList list2 = new IntersectionOfTwoLinkedList();
		
		
		
		Node head1 = list2.intersectionPoint(list.head, list1.head);
		
		System.out.println("Intersection point:" +head1.data);
		

				
	}
	
	

}
