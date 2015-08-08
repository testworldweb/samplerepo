package com.testworldweb.ds.usage;

import java.util.HashMap;
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
		for(String key: hm.keySet())
			System.out.println("Key="+key+" value="+hm.get(key));
	
	}
	

}
