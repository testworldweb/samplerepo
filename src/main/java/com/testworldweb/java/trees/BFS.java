package com.testworldweb.java.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class BFS {
	
	
	public static void breadthFirst(Node root)
	{
		LinkedList<Node> al=new LinkedList<Node>();
		al.add(root);
		Node cur;
		while(!al.isEmpty())
		{	
			cur=al.removeFirst();
			if(cur.left!=null)
			{
				al.add(cur.left);
			}
			if(cur.right!=null)
			{
				al.add(cur.right);
			}
			System.out.print(cur.val+ " ");
			
		}
	}
	public static void breadthFirstLevelWiseInfiniteLoop(Node root)
	{
		LinkedList<Node> al=new LinkedList<Node>();
		Node demarker=new Node("");
		al.add(root);
		al.add(demarker);
		Node cur;
		while(!al.isEmpty())
		{	
			cur=al.removeFirst();
			if(cur==demarker)
			{
				System.out.println("");
				al.add(demarker);
				continue;
			}
			System.out.print(cur.val+ " ");
			
			if(cur.left!=null)
			{
				al.add(cur.left);
			}
			if(cur.right!=null)
			{
				al.add(cur.right);
			}
			
		}
	}
	public static void breadthFirstLevelWise(Node root)
	{
		LinkedList<Node> al=new LinkedList<Node>();
		Node demarker=new Node("");
		al.add(root);
		al.add(demarker);
		Node cur;
		while(!al.isEmpty())
		{	
			cur=al.removeFirst();
			if(cur==demarker)
			{
				System.out.println("");
				if(!al.isEmpty())
				{	
				al.add(demarker);
				}
				continue;
			}
			System.out.print(cur.val+ " ");
			
			if(cur.left!=null)
			{
				al.add(cur.left);
			}
			if(cur.right!=null)
			{
				al.add(cur.right);
			}
			
		}
	}
	public static void main(String[] args) {
		

	   
	  Node n1=Tree.initialise(); 
	 
	  breadthFirst(n1);
	  //breadthFirstLevelWise(n1);
	   
	}
	
}
