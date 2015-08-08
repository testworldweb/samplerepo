package com.testworldweb.ds.usage;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * In this class we have not used interfaces at all
 * 
 *
 */

public class LinkListUsage{
	/**
	 * iterator should also be initialized with the type variable same as the Variable on which it is iterating
	 * list.iteroator();
	 *while () -> has next
	 *iterator.next
	 */
	public static void printList(LinkedList <Integer>list)
	{
		Iterator<Integer> iterator;
		iterator = list.iterator();     
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");  
		}
	}
	/**
	 * list.empty
	 * list.size
	 */
	public static void printListSize(LinkedList <Integer>list)
	{
		if (list.isEmpty()){
			System.out.println("Linked list is empty");
		}
		else{
			System.out.println( "Linked list size: " + list.size());//why is size not getsize() or why is it not .size 
		}
	}
	public static void main(String[] args) {
		LinkedList <Integer>list = new LinkedList<Integer>();
		int num1 = 11, num2 = 22, num3 = 33, num4 = 44;
		//Adding data in the list
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);

		
		System.out.print( "Linked list data: ");  
		printListSize(list);
		
		list.addFirst(55);
		list.addLast(66);
		list.add(2,99);
		System.out.println("First data: " + list.getFirst());
		System.out.println("Last data: " + list.getLast());
		System.out.println("Data at 4th position: " + list.get(3));
		
		//Remove first
		int first = list.removeFirst();
		System.out.println("Data removed from 1st location: " + first);
		
		//Remove 2nd data
		int second = list.remove(1);
		System.out.println("Data removed from 2nd location: " + second);
		
		list.clear();

		printListSize(list);
	}
}