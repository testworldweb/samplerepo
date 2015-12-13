package com.testworldweb.java.linkedlist;

public class Inserts {

	public static Node insertAtNth(Node head,int n,int value)
	{
		Node newNode=new Node(value);
		Node prev=null;
		Node cur=head;
		//make n-1 moves 
		for(int i=0;i<n-1;i++)
			{
			 if(cur==null)
			 {
				 System.out.println("not as many nodes.Insert at last");
				 break;
			 }
		     prev=cur;
			 cur=cur.next;
			}
		newNode.next=cur;
				
		 if(prev==null)
		 {
		    head=newNode;
		 }
		 else
		 {
		 prev.next=newNode;
		 }
		 return head;
		 
	}

	/**
	 * use for , non special Handling 
	 * @param head
	 * @param valToInsert
	 * @return
	 */	
	public static Node insertSorted(Node head,int valToInsert)
	{
		Node prev=null;
		Node newNode=new Node(valToInsert);
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(valToInsert<cur.val)
				{
				break;
				}
			prev=cur;
		}
		
		newNode.next=cur;
		
		 if(prev==null)
		 {
		    head=newNode;
		 }
		 else
		 {
		 prev.next=newNode;
		 }
		 return head;
		/* 
		if(prev!=null)
		{
		prev.next=newNode;
		return head;
		
		}
		else	
		return newNode;
		*/
	}

	/**
	 * use while , non special Handling . Avoid
	 * @param head
	 * @param valToInsert
	 * @return
	 */
	public static Node insertSortedAvoid(Node head,int valToInsert)
	{
		Node cur=head;
		Node prev=null;
		Node newNode=new Node(valToInsert);
		while(cur!=null && cur.val<valToInsert)
		{
			//System.out.print(cur.val+" ");
			prev=cur;
			cur=cur.next;			
		}
		if(cur==null)
		{
			prev.next=newNode;
		}
		else
		{
			newNode.next=cur;
			if(prev==null)
			{
				return newNode;
			}
			else
			{	
			prev.next=newNode;
			}
		}
		return head;
		
	}

	public static void main(String[] args) {
		//1 2 4 5 6 7 8 9 10
		Node n1=LinkList.initialiseAndLink();
		LinkList.printList(n1);
	        
	        n1=insertSorted(n1, 11);
	        System.out.println();
	        LinkList.printList(n1);
	       	    
	        /*
	        n1=insertAtNth(n1, 5, 55);
	        System.out.println();
	        printList(n1);
	       */
	      // 
	}

}
