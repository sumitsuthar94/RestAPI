package com.learn.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.learn.rest.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message m1 = new Message(1, "foo", "bar");
		Message m2 = new Message(2, "fizz", " buzz");
		List<Message> messageList = new ArrayList<Message>();
		messageList.add(m1);
		messageList.add(m2);
		return messageList;
	}
}
