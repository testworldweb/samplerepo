package com.testworldweb.java.linkedlist;

public class NthFromLast {

	public static void main(String[] args) {
		Node n1=LinkList.initialiseAndLink();
		LinkList.printList(n1);
	        
		 //System.out.println(nthFromLastStartFromZero(n1,5).val);
        //System.out.println(nthFromLastStartFromZeroAlternate(n1,0).val);
        //System.out.println(nthFromLastStartFromOne(n1,5).val);
    	
	  
	    LinkList.printList(n1);


	}

	/**
	 * starts at 1 
	 * @param head
	 * @param valToInsert
	 * @return
	 */
	public static Node nthFromLastStartFromOne(Node head,int n)
	{
	Node prev=null,cur=head;
	for(int i=0;i<n;i++)
	{
		if(cur==null)
		{
			System.out.println("Not enough nodes breaking");
			break;
		}
		cur=cur.next;
	}
	
	prev=head;
	// the only change from the other function above 
	for(;cur!=null;cur=cur.next)
	{
	
		prev=prev.next;	
	}
	
		return prev;
	}

	/**
	 * use while ,  special Handling 
	 * @param head
	 * @param valToInsert
	 * @return
	 */
	public static Node nthFromLastStartFromZero(Node head,int n)
	{
	Node prev=null,cur=head;
	for(int i=0;i<n;i++)
	{
		if(cur==null)
		{
			System.out.println("Not enough nodes breaking");
			break;
		}
		cur=cur.next;
	}
	
	prev=head;
	for(;cur.next!=null;cur=cur.next)
	{
	
		prev=prev.next;	
	}
	
		return prev;
	}

	public static Node nthFromLastStartFromZeroAlternate(Node head,int n)
	{
	Node prev=null,cur=head;
	for(int i=0;i<n+1;i++)
	{
		if(cur==null)
		{
			System.out.println("Not enough nodes breaking");
			break;
		}
		cur=cur.next;
	}
	
	prev=head;
	// the only change from the other function above 
	for(;cur!=null;cur=cur.next)
	{
	
		prev=prev.next;	
	}
	
		return prev;
	}

}
