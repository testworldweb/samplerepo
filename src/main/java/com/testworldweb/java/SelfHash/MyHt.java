package com.testworldweb.java.SelfHash;

public class MyHt {

	int[] a=new int[26];
	
	public int get(char key)
	{
		 int index=key-97;
		 return a[index];
	}
	public int remove(char key)
	{
		 int index=key-97;
		 int temp=a[index];
		 a[index]=0;
		 return temp;
	}
	
	public int put(char key,int val)
	{
	
	   int index=key-97;
	   int temp=a[index];
	   a[index]=val;
		return temp;
	}
	public void print()
	{
	
	   for(int i=0;i<a.length;i++)
	   {
		   char ic=(char)(i+97);
		   System.out.print(ic+":"+a[i]+",");
	   }
	}
	
}
