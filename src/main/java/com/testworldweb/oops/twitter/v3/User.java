package com.testworldweb.oops.twitter.v3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class User {
	public static Map<String,User> map=new HashMap<String,User>();
	private String userId;
	private String email;
	private LinkedList<String> tweets=new  LinkedList<String>();
	private List<String> following=new  LinkedList<String>();
	private List<String> followers=new  LinkedList<String>();
	private LinkedList<String> feed=new LinkedList<String>();
	
	

	User(String userId)
	{
	this.userId=userId;
	this.email=userId+"@gmail.com";
	
	//is this allowed, already using the object contructed in the constructor
	map.put(userId, this);
	}
	
	public void showDetais()
	{
		System.out.println("**********Printing details for user"+userId+"**********");
		System.out.println("userId="+userId);
		System.out.println("email="+email);
		System.out.println("tweets="+tweets.toString());
		System.out.println("following="+following.toString());
		System.out.println("followers="+followers.toString());
		System.out.println("feed="+feed.toString());
		
	}
	public void tweet(String tweet)
	{
		System.out.println(">>>>New tweet "+tweet+ " by "+ this.userId);
		tweets.addFirst(tweet);
		for( String eachFollower:followers)
		{
			map.get(eachFollower).getFeed().addFirst(tweet);
		}
		
	}
	public void showWall()
	{
		for( String eachTweet: tweets)
		{
			System.out.println(eachTweet);
		}
		
		
	}
	public void showFeed()
	{
		for( String eachFeed: feed)
		{
			System.out.println(eachFeed);
		}
		
	}
	public void follow(String userToFollow)
	{
		map.get(userToFollow).getFollowers().add(userId);
		map.get(userId).getFollowing().add(userToFollow);
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getFollowing() {
		return following;
	}
	public void setFollowing(List<String> following) {
		this.following = following;
	}
	public List<String> getFollowers() {
		return followers;
	}
	public void setFollowers(List<String> followers) {
		this.followers = followers;
	}
	public LinkedList<String> getFeed() {
		return feed;
	}
	public void setFeed(LinkedList<String> feed) {
		this.feed = feed;
	}
	public LinkedList<String> getTweets() {
		return tweets;
	}
	public void setTweets(LinkedList<String> tweets) {
		this.tweets = tweets;
	}


}
