import java.util.*;
class KthToLast
{
	class Node
	{
		int val;Node next;
		Node(int data)
		{
			val=data;
			next=null;
		}
	}
	
	static Node head;
	
	public void push(int new_data) 
	{ 
		
		Node new_node = new Node(new_data); 

		
		new_node.next = head; 


		head = new_node; 
	} 


	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) 
		{ 
			System.out.print(temp.val+" "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 
	 
	public static int printKth(Node head,  int k)
	{
		if(head==null)
			return 0;
		
		int count=printKth(head.next,k)+1;
		
		if(count == k)
		
			System.out.println(head.val+"is "+k+"th");
			
		return count;
			
	}
	
	
				
	public static void main(String a[])
	{
	
		KthToLast llist=new KthToLast();
		llist.push(20); 
		llist.push(13); 
		llist.push(13); 
		llist.push(11); 
		llist.push(11); 
		llist.push(11); 
		 
		System.out.println("List :-"); 
		llist.printList(); 
		llist.printKth(head,3);
	}
}

