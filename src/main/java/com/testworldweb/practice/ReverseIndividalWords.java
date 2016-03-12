package com.testworldweb.practice;
/**
 * Final version
 * 
 */
public class ReverseIndividalWords {

	public static void main(String[] args) {
	String str=" Testing    code reverse     ";
	System.out.println(reverseWords(str));		
	}

	public static void reverseBetween(char c[],int i, int j)
	{
		while(i<j){
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;	
		i++;
		j--;
		}
	}
	private static String reverseWords(String str) {
	 char chStr[]=str.toCharArray();
	
	 System.out.println();
		int i=0,j=0;
	 for(;i<chStr.length;i++)
	 {
		 if(chStr[i]==' ')
		 {
			 reverseBetween(chStr,j,i-1);
			 while(chStr[i]==' ' && i<chStr.length-1)
			 {i++;
			 }
		     j=i;
		 }
		 
	 }
	 //i is already incremented once
	 reverseBetween(chStr,j,i-1);
     
		return new String(chStr);
	}

}
