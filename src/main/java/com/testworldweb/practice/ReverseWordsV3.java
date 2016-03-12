package com.testworldweb.practice;

public class ReverseWordsV3 {

	public static void main(String[] args) {
		
String result="";
result =reverseIndiviualWords("Testing new code");
System.out.println("result : "+result);
	}


public static String reverse(String user){

	StringBuffer sb=new StringBuffer();
	
   
  for( int j = user.length()-1;j>=0;j--){
	  
	  sb.append(user.charAt(j));
	  
	  
	  
  }
        
return sb.toString();
}

public static String reverseIndiviualWords(String user){
String result="";
int i = 0,j=0;


for(;i<user.length();i++){

        if(user.charAt(i)==' '){
        
            result=result+" "+reverse(user.substring(j,i));
        
            while(user.charAt(i)==' '){
        
                i++;
            }
           j=i;
          } 

   
}
result=result+" "+reverse(user.substring(j,i));
return result;

}
}