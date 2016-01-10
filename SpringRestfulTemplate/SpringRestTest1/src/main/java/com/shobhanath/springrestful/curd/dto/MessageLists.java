package com.shobhanath.springrestful.curd.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="messages")
public class MessageLists {
private List<Message> messages = new ArrayList<Message>();

public List<Message> getMessages() {
	return messages;
}

public void setMessages(List<Message> messages) {
	this.messages = messages;
}
}
