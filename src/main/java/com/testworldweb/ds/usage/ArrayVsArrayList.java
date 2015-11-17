package com.testworldweb.ds.usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.testworldweb.oops.twitter.am.User;
/**
 * ArrayList Usage
 * 1. add/ iterate until size 
 */
public class ArrayVsArrayList {
	public static void main(String[] args) {

		//List is an interface . ArrayList is a class . You can not instantiante in interface 
		//Arraylist 1
		List<String> aList=new ArrayList<String>();
		aList.add("my");
		aList.add("name");
		aList.add("is");
		
		
		//Printing way 1 
		for(int i=0;i<aList.size();i++)//arraylist->Size , array->Length
		{
			System.out.print(aList.get(i) +" ");
		}
		System.out.println();
		
		
		//Printing way 2 // shorthand for loop
		//this for loop automatically does 
		// 1.a[i]  for arrays 
		// 2 a.get(i) for lists 
				for(String temp : aList)
				{
					System.out.print(temp +" ");
				}
				System.out.println();
		
		
		//Printing way 3
		System.out.println(aList.toString());
		
		
		//Printing way 4. Not really needed 
		//Iterator can be used on list and set 
		
		Iterator<String> iterator;
		iterator = aList.iterator();     
		
		while (iterator.hasNext()){
			System.out.print(iterator.next().toString()+ " ");  
		}
		System.out.println();
		
		/*************** Extra Points ********/
		System.out.println("******** Extra stuff ******");
		
		
		/*************** ArrayList without type ********/
		 
		List someList=new ArrayList();
		someList.add("Abc");
		System.out.println(someList.toString());
		//unsafe type casting
		//no type variable specified.You can add any object
		//compile time advantage of ensuring that  similar things added is lost
		
		
		/*************** Make arraylist from array ********/
		ArrayList<String> bList = new ArrayList<String>(Arrays.asList("hello", "there", "world"));
		System.out.println(bList.toString());
		
	}
}
