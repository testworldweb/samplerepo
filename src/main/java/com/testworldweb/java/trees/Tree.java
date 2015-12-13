package com.testworldweb.java.trees;

import java.util.HashMap;

public class Tree {
	HashMap<Node,Integer> hm=new HashMap<Node,Integer>();
	
	public static void inorder(Node head)
	{
		if(head==null)
		{
			return;
		}
		inorder(head.left);
		System.out.println(head.val +" ");
		inorder(head.right);
	}
	public static void isloop(Node head)
	{HashMap<Node,Integer> hm=new HashMap<Node,Integer>();
		if(head==null)
		{
			return;
		}
		isloop(head.left);
		isloop(head.right);
		if(hm.containsKey(hm.get(head)))
		{
			System.out.println("loop");
		}
		else
		{
			hm.put(head, 1);
		}
	}
	public static Node initialise()
	{
		Node n1=new Node("A");
		Node n2=new Node("B");
		Node n3=new Node("C");
		Node n4=new Node("D");
		Node n5=new Node("E");
		Node n6=new Node("F");
		Node n7=new Node("G");
	
	   n1.left=n2;
	   n1.right=n3;
	   n2.left=n4;
	   n2.right=n5;
	   n3.left=n6;
	   n3.right=n7;
	   return n1;
	}
	public static Node initialiseUnblanaced()
	{
		Node n1=new Node("A");
		Node n2=new Node("B");
		Node n3=new Node("C");
		Node n4=new Node("D");
		Node n5=new Node("E");
		Node n6=new Node("F");
		Node n7=new Node("G");
		Node n8=new Node("I");
		Node n9=new Node("J");
		Node n10=new Node("L");
		Node n11=new Node("M");
	   n1.left=n2;
	   n1.right=n3;
	   n2.left=n4;
	   n2.right=n5;
	   n3.left=n6;
	   n3.right=n7;
       n4.right=n8;
       n5.left=n9;
       n6.left=n10;
       n6.right=n11;
	   return n1;
	}
	public static void main(String[] args) {
		

	   
	  Node n1=initialise(); 
	  inorder(n1);
	  //bfs(n1);
	   
	}

}
