In v1 of this implementation we had to pass the map , which does not signify any user's behaviour
	am.follow("sim", map);
	sim.tweet("sim's tweet 1", map);
	am.tweet("am's tweet 1", map);
	
In v2, the there is need for passing the map , as it is declared as a static variable 

Notice the constructor of User in v2 -> while creating the object of the constructor , we are putting it in the map as well


User(String userId)
	{
	this.userId=userId;
	this.email=userId+"@gmail.com";
	
	// this is allowed, already using the object contructed in the constructor
	map.put(userId, this);
	}
	 
