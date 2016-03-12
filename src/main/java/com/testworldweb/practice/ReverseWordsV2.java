package com.testworldweb.practice;

public class ReverseWordsV2 {

	public static void main(String[] args) {
		
String result="";
result =reverseIndiviualWords("Testing new code ");
System.out.println("result : "+result);
	}


public static String reverse(String user){

	StringBuffer sb=new StringBuffer();
	
   
  for( int j = user.length();j>0;j--){
	  
	  sb.append(user.charAt(j));
	  
	  
	  
  }
        
return sb.toString();
}

public static String reverseIndiviualWords(String user){
String result="";
int j=0;


for(int i=0;i<user.length();i++){

        if(user.charAt(i)==' '){
        
            result=result+reverse(user.substring(j,i-1));
        
            while(user.charAt(i+1)==' '){
        
                i++;
            }
        
          } 

     j=i+1;
}

return result;

}
}