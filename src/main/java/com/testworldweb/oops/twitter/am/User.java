package com.testworldweb.oops.twitter.am;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class User {
	
	String firstName;
	String lastName;
	String userId;
	//String emailId;
	LinkedList<String> tweets=new LinkedList<String>();
	LinkedList<User> whomIFollow=new LinkedList<User>();
	LinkedList<String> feed=new LinkedList<String>();
	
	User(String firstName, String lastName , String userId){
		this.firstName=firstName;
	this.lastName=lastName;
	this.userId=userId;
	}
	
	void follow(User toFollow)
	{
		//whomifollow.following.add(this);
		whomIFollow.add(toFollow);
	
	}

	
	void tweets(String mytweet){
		tweets.add(mytweet);
		
	}
	
	void showFeeds(){
		
		Iterator<User> iterator;
		iterator = whomIFollow.iterator();     
		while (iterator.hasNext()){
			
			User temp=iterator.next();
			System.out.print(temp.userId+": "+temp.tweets+ " ");  
		}
	
	}
	
	void showMyTweets(){
		
		Iterator<String> iterator;
		iterator = tweets.iterator();     
		while (iterator.hasNext()){
			
			System.out.print(iterator.next()+ " ");  
		}
		
	}

}
