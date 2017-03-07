package com.learn.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.learn.rest.messenger.model.Message;
import com.learn.rest.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	@Path("/one")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMessageOne(){
		Response response = null;
		List<Message>listMessage =  messageService.getAllMessages();
		response = Response.ok(listMessage).build();
		System.out.println(response);
		
		 GenericEntity<List<Message>> messages = new GenericEntity<List<Message>>( messageService.getAllMessages()) {};
		 return Response.ok(messages).build();
		 
	}
	@Path("/two")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessageTwo(){
		List<Message>listMessage =  messageService.getAllMessages();
		return listMessage;
		 
	}
}
