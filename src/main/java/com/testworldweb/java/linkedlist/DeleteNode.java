package com.testworldweb.java.linkedlist;

public class DeleteNode {



	public static Node deleteGiven(Node head,int givenVal)
	{
		Node prev=null;
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(cur.val==givenVal)
			break;
			prev=cur;
		}
		if(cur==null)
		{
			System.out.println("no node deleted");
			return head;
		}
		if(prev==null)
		{
			head=cur;
		}
		else
		{
		prev.next=cur.next;
		}
		return head;
	}
	public static Node deleteMultipleCantHandleRepetitionAtFirst(Node head,int givenVal)
	{
		Node prev=null;
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(cur.val==givenVal)
			{
				prev.next=cur.next;
				cur=cur.next;
			}
			prev=cur;
		}
		if(prev==null)
		{
			head=cur;
		}
		return head;
	}
	public static Node deleteMultipleNPEforAllRepeat(Node head,int givenVal)
	{
		Node prev=null;
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(cur.val==givenVal)
			{
				// notice the placement. should not be in either of the if else blocks below
				
				while(cur.next.val==givenVal) // while this condition is true
				{
					cur=cur.next;
				}
				
				if(prev!=null)
				{	
				prev.next=cur.next;
				cur=cur.next;
				}
				else
				{
					
					Node temp=cur.next;
					cur.next=null;
					cur=temp;
					head=cur;
				}
			
			}
			prev=cur;
		}
		
		return head;
	}
	public static Node deleteMultiple(Node head,int givenVal)
	{
		Node prev=null;
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(cur.val==givenVal)
			{
				// notice the placement. should not be in either of the if else blocks below
				
				while(cur.next!=null && cur.next.val==givenVal) // while this condition is true
				{
					cur=cur.next;
				}
				
				if(prev!=null)
				{	
				prev.next=cur.next;
				cur=cur.next;
				}
				else
				{
					
					Node temp=cur.next;
					cur.next=null;
					cur=temp;
					head=cur;
				}
			
			}
			prev=cur;
		}
		
		return head;
	}	
	public static Node deleteGivenBackbone(Node head,int givenVal)
	{
		Node prev=null;
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(cur.val==givenVal)
			break;
			prev=cur;
		}
		prev.next=cur.next;
		//cur=null;//so that it may be picked up by the garbage collector
		return head;
	}
	public static void main(String[] args) {
		/*
		Node n1=LinkList.initialiseAndLink();
		LinkList.printList(n1);
	    n1=deleteGiven(n1, 5);
	    System.out.println();
	    LinkList.printList(n1);
		*/
		Node l2=LinkList.initialiseAndLinkMultipleFives();
	    
		//Node l2=LinkList.initialiseAndLinkMultipleFives();
	    LinkList.printList(l2);
	    l2=deleteMultiple(l2,5);
	    System.out.println();
	    LinkList.printList(l2);
		
	}
}
