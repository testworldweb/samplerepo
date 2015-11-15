package com.testworldweb.ds.usage;

import java.util.HashMap;
import java.util.Iterator;
/**
 * HashMap Usage 
 * 1.You can not instantiate a HashMap with primitive types 
 * 2.put replaces the existing value if it already exists 
 * 3.Integer can also be added with primitive type
 * 4. The for-each loop is much compact to use for collections 
 * 5 hm.keyset() returns the set of all keys 
 *  
 */
public class HashMapUsage {

	public static void main(String[] args) {
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
	 * if you make iterator.next() call twice then you most to the next entry
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
