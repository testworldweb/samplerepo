package com.testworldweb.practice;

public class ReverseWords {

	public static void main(String[] args) {
		

	}


public static String reverse(String user){

    int i=0;
    int j = user.length();
    char temp;
    
      while(i<j){

        temp=user.charAt(i);
     //   user.charAt(i)=user.charAt(j);
      //  user.charAt(j)=temp;            
        i++;
        j--;
      }
        
return user;
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