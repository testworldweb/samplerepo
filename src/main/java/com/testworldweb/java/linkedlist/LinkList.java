package com.testworldweb.java.linkedlist;


public class LinkList {
	public static void printList(Node head)
	{
		if(head==null)
		{
			System.out.println("Head is null");
		}
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.val+" ");
			cur=cur.next;
			
		}
	}
	public static void main(String[] args) {
			Node n1=initialiseAndLink();
	        printList(n1);
	
	}
	 static Node initialiseAndLink() {
		Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        Node n7 = new Node(8);
        Node n8 = new Node(9);
        Node n9 = new Node(10);
        
        /**
         * Linking the LinkNodes of a link list
         * This can also be done by creating a separate method . 
         * For eg- addLinkNode(LinkNode head,LinkNode newLinkNode) 
         */
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
     
		return n1;
	}
	 static Node initialiseAndLinkMultipleFives() {
		Node n1 = new Node(5);
        Node n2 = new Node(5);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(5);
        Node n7 = new Node(8);
        Node n8 = new Node(5);
        Node n9 = new Node(10);
        
        /**
         * Linking the LinkNodes of a link list
         * This can also be done by creating a separate method . 
         * For eg- addLinkNode(LinkNode head,LinkNode newLinkNode) 
         */
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
     
		return n1;
	}
	 static Node initialiseAndLinkAllFives() {
			Node n1 = new Node(5);
	        Node n2 = new Node(5);
	        Node n3 = new Node(5);
	        Node n4 = new Node(5);
	        Node n5 = new Node(5);
	        Node n6 = new Node(5);
	        Node n7 = new Node(5);
	        Node n8 = new Node(5);
	        Node n9 = new Node(5);
	        
	        /**
	         * Linking the LinkNodes of a link list
	         * This can also be done by creating a separate method . 
	         * For eg- addLinkNode(LinkNode head,LinkNode newLinkNode) 
	         */
	        
	        n1.next = n2;
	        n2.next = n3;
	        n3.next = n4;
	        n4.next = n5;
	        n5.next = n6;
	        n6.next = n7;
	        n7.next = n8;
	        n8.next = n9;
	     
			return n1;
		}
	 static Node initialiseAndLinkMultipleFivesAndThrees() {
		Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        Node n5 = new Node(6);
        Node n6 = new Node(5);
        Node n7 = new Node(3);
        Node n8 = new Node(5);
        Node n9 = new Node(10);
        
        /**
         * Linking the LinkNodes of a link list
         * This can also be done by creating a separate method . 
         * For eg- addLinkNode(LinkNode head,LinkNode newLinkNode) 
         */
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
     
		return n1;
	} 
}
