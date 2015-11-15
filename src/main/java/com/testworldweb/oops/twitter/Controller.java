package com.testworldweb.oops.twitter;

import java.util.HashMap;
import java.util.Map;

public class Controller {

	public static void main(String[] args) {
		
		Map<String,User> map=new HashMap<String,User>();//there is no class as Map so dont try to initiate Map
		User sim=new User("sim");
		map.put(sim.getUserId(), sim);
		
		User am=new User("am");
		map.put(am.getUserId(), am);
		
		User p=new User("p-sim");
		map.put(p.getUserId(), p);
		
		User q=new User("q-am");
		map.put(q.getUserId(), q);
		
		User r=new User("r-am,sim");
		map.put(r.getUserId(), r);
		
		am.follow("sim", map);
		sim.follow("am", map);
		p.follow("sim", map);
		q.follow("am", map);
		r.follow("sim", map);
		r.follow("am", map);
		
		
		sim.tweet("sim's tweet 1", map);
		am.tweet("am's tweet 1", map);
		
		
		for(String key: map.keySet())
			{
			System.out.print("Feed of "+map.get(key).getUserId()+ " is ");  map.get(key).showFeed();
			}
	
		sim.tweet("sim's tweet 2", map);
		
		System.out.println("----sim's wall is ->");
		sim.showWall();
		
		System.out.println("----am's feed is :->");
		am.showFeed();
		
		System.out.println("----r's feed is :->");
		r.showFeed();
		
		
		
		
		
	}

}
