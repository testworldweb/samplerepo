package com.testworldweb.java.linkedlist;

import java.util.HashMap;

public class RemoveDuplicates {

	
	public static Node removeMultipleError(Node head)
	{
		Node prev=null;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(hm.get(cur.val)==null)
			{
				hm.put(cur.val, 1);
				
			}
			else
			{
				prev.next=cur.next;	
				
			}
				prev=cur;
		}
		
		return head;
	}
	
	public static Node removeMultiple(Node head)
	{
		Node prev=null;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Node cur;
		for(cur=head;cur!=null;)
		{
			if(hm.get(cur.val)==null)
			{
				hm.put(cur.val, 1);
				
			}
			else
			{
				prev.next=cur.next;	
				cur=cur.next;//basically we wanted to skip prev=cur , when the thing was 2nd element
				continue;//alternatively just move the cur
				
			}
				prev=cur;
				cur=cur.next;
		}
		
		return head;
	}
	
	public static Node removeMultipleAlternate(Node head)
	{
		Node prev=null;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			if(hm.get(cur.val)==null)
			{
				hm.put(cur.val, 1);
				
			}
			else
			{
				prev.next=cur.next;	
				cur=cur.next;//basically we wanted to skip prev=cur , when the thing was 2nd element
				continue;//continue as it should be reevaluated
				
			}
				prev=cur;
		
		}
		
		return head;
	}
	public static Node removeMultipleNoExtraSpace(Node head)
	{
		Node ptr,preptr=null;
		Node cur;
		for(cur=head;cur!=null;cur=cur.next)
		{
			for(ptr=cur.next;ptr!=null;ptr=ptr.next)
			{
				if(cur.val==ptr.val)
				{
					preptr.next=ptr.next;
					ptr=ptr.next;
					continue;
				}
				preptr=ptr;
			}
		}
			return head;
	}
	public static void main(String[] args) {
	
	    Node l1=LinkList.initialiseAndLinkMultipleFivesAndThrees();
	    LinkList.printList(l1);
	    //l1=removeMultiple(l1);
	    l1=removeMultipleNoExtraSpace(l1);
	    System.out.println();
	    LinkList.printList(l1);
		
	}

}
