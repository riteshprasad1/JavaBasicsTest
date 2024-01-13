package Collections;

public class MyLinklist {
	
		Node head;
	 class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next=null;
		}
	 }
		public void printMyLinkedList()
		{
			Node n = head;
			while(n !=null)
			{
				System.out.println(n.data);
				n =n.next;
			}
		
	}

	public static void main(String[] args) {

		MyLinklist ll = new MyLinklist();
		
		Node first = ll.new Node(10);
		ll.head = first;
		
		Node second = ll.new Node(20);
		first.next = second;
		
		ll.printMyLinkedList();
		
	}

}
