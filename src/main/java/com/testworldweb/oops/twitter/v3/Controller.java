package com.testworldweb.oops.twitter.v3;

import java.util.HashMap;
import java.util.Map;

public class Controller {

	public static void main(String[] args) {
		
		User am=new User("am");
		User sim=new User("sim");
		User p=new User("p-sim");
		User q=new User("q-am");
		User r=new User("r-am,sim");
		
		am.follow("sim");
		sim.follow("am");
		p.follow("sim");
		q.follow("am");
		r.follow("sim");
		r.follow("am");
		
		
		sim.tweet("sim's tweet 1");
		am.tweet("am's tweet 1");
		
		
		for(String key: User.map.keySet())
			{
			System.out.print("Feed of "+User.map.get(key).getUserId()+ " is ");  User.map.get(key).showFeed();
			System.out.println();
			
			}
	
		sim.tweet("sim's tweet 2");
		System.out.println();
		
		System.out.println("----sim's wall is ->");
		sim.showWall();
		System.out.println();
		
		System.out.println("----am's feed is :->");
		am.showFeed();
		System.out.println();
		
		System.out.println("----r's feed is :->");
		r.showFeed();
		
		
		
		
		
	}

}
