package com.learn.rest;

import java.util.ArrayList;
import java.util.List;

public class UserService {

	public static List<User> getUsers(){
		List<User> userList = new ArrayList<>();
		User user1 = new User("101", "foo");
		User user2 = new User("102", "bar");
		userList.add(user1);
		userList.add(user2);
		return userList;
		
	}
}
