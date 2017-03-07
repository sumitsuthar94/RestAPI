package com.learn.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers(){
		List<User>userList = UserService.getUsers();
		return  userList;
	}
}
