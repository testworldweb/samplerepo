package com.testworldweb.java.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
/**
 * DFS is of 3 types, inorder , preorder , post order
 */
public class DFS {
	/**
	 * prints node of a given level
	 * @param head
	 * @param level
	 */
	public static void printAtGivenLevel(Node root,int level,int levelOfPrint)
	{
		if(root==null||level>levelOfPrint)
		{
			return;
		}
		if(level==levelOfPrint)
		{
			System.out.print(root.val+" ");
		}
		printAtGivenLevel(root.left,level+1,levelOfPrint);
		printAtGivenLevel(root.right,level+1,levelOfPrint);
		
		
		
	}
	public static void printAtAll(Node root)
	{
		int ht=height(root);
		for(int i=0;i<ht;i++)
		{
			printAtGivenLevel(root,0,i);
			System.out.println();
		}
		
	}
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		return height(root.left)+height(root.right)+1;
		
		
	}
	public static void main(String[] args) {
		

	  	//Node n1=Tree.initialise(); 
		Node n1=Tree.initialiseUnblanaced();
	  	//printAtGivenLevel(n1,0,4);
	  	printAtAll(n1);
	   
	}
	
}
