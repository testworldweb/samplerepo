package com.testworldweb.ds.usage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUsage {

	
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set.add("C"));  //returns false
		System.out.println(set.add("D")); //returns true

		//Print way 1
		for(String temp: set)
		{
			System.out.print(temp + " ");
			
		}
		System.out.println();
		
		//Print way 2
			Iterator it=set.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next() + " ");
			}
	}
}
