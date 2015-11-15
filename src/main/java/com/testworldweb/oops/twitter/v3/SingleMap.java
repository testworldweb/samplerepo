package com.testworldweb.oops.twitter.v3;

import java.util.HashMap;
import java.util.Map;

public class SingleMap {
	private static SingleMap instance = new SingleMap();
		private static Map<String,User> map = new HashMap<String,User>();
		//make the constructor private so that this class cannot be
		//instantiated
		private SingleMap(){}
		//Get the only object available
		public static SingleMap getInstance(){
		return instance;
		}
		
		public void put(String key, User value)
		{
			
		}
		
}
