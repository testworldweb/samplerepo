package com.testworldweb.java.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Traversal {
	
	public static void inorder(Node head)
	{
		if(head==null)
		{
			return;
		}
		inorder(head.left);
		System.out.print(head.val +" ");
		inorder(head.right);
	}
	
	public static void main(String[] args) {
		

	   
	  Node n1=Tree.initialise(); 
	  inorder(n1);  
	 
	   
	}
	
}
