package com.testworldweb.oops.twitter;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class User {

	private String userId;
	private String email;
	private LinkedList<String> tweets=new  LinkedList<String>();
	
	//this is fine since you need only the interface methods on followers and following
	private List<String> following=new  LinkedList<String>();
	private List<String> followers=new  LinkedList<String>();
	private LinkedList<String> feed=new LinkedList<String>();
	
	

	User(String userId)
	{
	this.userId=userId;
	this.email=userId+"@gmail.com";
	
	
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
	public void tweet(String tweet,Map<String,User> followerMap)
	{
		tweets.addFirst(tweet);
		for( String eachFollower:followers)
		{
			followerMap.get(eachFollower).getFeed().addFirst(tweet);
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
	public void follow(String userToFollow,Map<String,User> followerMap)
	{
		followerMap.get(userToFollow).getFollowers().add(userId);
		followerMap.get(userId).getFollowing().add(userToFollow);
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
