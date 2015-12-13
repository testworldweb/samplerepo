package com.testworldweb.ds.usage;

import java.util.HashMap;
import java.util.Iterator;
/**
 * HashMap Usage 
 * 1.You can not instantiate a HashMap with primitive types 
 * 2.put replaces the existing value if it already exists 
 * 3.Integer can also be added with primitive type
 * 4. The for-each loop is much compact to use for collections 
 * 5 IMP : hm.keyset() returns the set of all keys , and iterator and for loop are essentially applied on this  
 * 6.Store iterator.next in a temp variable if it needs to be called twice 
 * 7.functions 
 * a.put/remove returns the previous value associated with the key .or null
 * b.get returns the value or null  
 */
public class HashMapUsage {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm2=new HashMap<String,Integer>();
		System.out.println(hm2.put("a",1));
		System.out.println(hm2.put("a",2));
		System.out.println(hm2.get("a"));
		System.out.println(hm2.remove("a"));
		
		
		
		
		
		
		
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String givenString="dsddjhsbmdis";
		
		int len=givenString.length();
		for(int i=0;i<len;i++)
		{
			if(hm.containsKey(givenString.charAt(i)+""))
			{

				hm.put(givenString.charAt(i)+"",hm.get(givenString.charAt(i)+"")+1);
			}
				else
				{	hm.put(givenString.charAt(i)+"",1);
		
				}
		}
		printHashMap1(hm);
		printHashMap2(hm);
		printHashMap3(hm);
	}
	public static void printHashMap2(HashMap<String,Integer> hm)
	{
		for(String key: hm.keySet())
			System.out.print(key+":"+hm.get(key)+" ");
		System.out.println();
	}
	public static void printHashMap1(HashMap<String,Integer> hm)
	{
		System.out.println(hm.toString());
	}
	/*
	 * Note that in this case it is important to same the iterator into a temp buffer
	 * if you make iterator.next() call twice then you go to the next entry
	 */
	public static void printHashMap3(HashMap<String,Integer> hm)
	{
		Iterator<String> iterator=hm.keySet().iterator();
		String temp;
		while(iterator.hasNext())
		{
			temp=iterator.next();
			System.out.print(temp+":"+hm.get(temp)+ " ");			
		}
		System.out.println();
	}

}
