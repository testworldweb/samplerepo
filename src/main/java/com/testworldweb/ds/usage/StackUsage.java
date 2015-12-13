package com.testworldweb.ds.usage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class StackUsage {

	
	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);

		System.out.println("s.peek "+s.peek());
		System.out.println("s.pop "+s.pop());

		System.out.println("s.peek "+s.peek());
		System.out.println("s.size "+s.size());

		System.out.println("s.get "+s.get(0));
		
	}
}
