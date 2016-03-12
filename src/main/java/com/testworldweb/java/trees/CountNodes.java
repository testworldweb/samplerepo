package com.testworldweb.java.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
public class CountNodes {

	 public static int count;
	public static void countNodes(Node root)
	{if(root==null)
		return;
	  	
		else
		{
			
			
			countNodes(root.left);

			countNodes(root.left);
			count++;
			System.out.println("Head Value is "+root.val +"  Count at this point is "+ count);
			
		}
		
	}
	public static int countNodesRecursive(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			
			int x=countNodesRecursive(root.left);
			int y=countNodesRecursive(root.right);

		return x+y+1;
		}
		
	}
	public static void main(String[] args) {
		

	   
		Node n1=Tree.initialiseUnblanaced();
	  	
		countNodes(n1);
		System.out.println("Overall Count is"+count);
	   
		System.out.println("Overall recursive Count is "+ countNodesRecursive(n1));
		   
		
	}
	
}
