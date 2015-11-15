package com.testworldweb.oops.twitter.am;

import java.util.HashMap;
import java.util.Map;

public class Controller {

	public static void main(String[] args) {
		
	User adam=new User("adam","jackson","ada");
	User benny=new User("benny","hankin","ben");
	User sandy=new User("sandy","geller","sand");
	
	System.out.println("*************** TWITTER ***************");

	System.out.println("Sandy Starts following Benny...");
	sandy.follow(benny);
	
	
	benny.tweets("Lovely Rain just made my day today !!");
	benny.tweets("LiveStrong :-)");
	
	adam.tweets("Its freezing in New York today");
	
	sandy.tweets("Watch out for stawberry moon today!");
	
	System.out.println("Sandy Tweets : ");
	sandy.showMyTweets();
	System.out.println("");
	System.out.println("Adams Starts following Benny...");
	adam.follow(benny);
	
	System.out.println("Adam Tweets : ");
	

	System.out.println("Sandy Feed : ");
	sandy.showFeeds();
	System.out.println("");
	adam.showMyTweets();
	System.out.println("");
	System.out.println("Benny Tweets : ");
	benny.showMyTweets();
	
	
	}

}
