package com.shobhanath.springrestful.curd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.shobhanath.springrestful.curd.database.DatabaseClass;
import com.shobhanath.springrestful.curd.dto.Message;
import com.shobhanath.springrestful.curd.dto.MessageLists;

/**
 * The MessageService
 * 
 * @author shobhanath
 *
 */
public class MessageService {
private Map<Long,Message> messages = DatabaseClass.getMessages();
/**
 * Constructor to create messages
 */
public MessageService(){
	messages.put(1L, new Message(1,"Hello World1","Shobhanath Sharma"));
	messages.put(2L,new Message(2L,"Hello World2","Reetu Sharma"));
}
/**
 * Used to get all the available messages
 * 
 * @return List<Message>
 */
public MessageLists getAllMessages(){
	MessageLists messageList = new MessageLists();
	messageList.setMessages(new ArrayList<Message>(messages.values()));
	return messageList;
}
/**
 * Used to get a specific message
 * 
 * @param id
 * @return Message
 */
public Message getMessage(long id){
	return messages.get(id);
}
/**
 * Used to add messages to the Database
 * 
 * @param message
 * @return message
 */
public Message addMessage(Message message){
	message.setId(messages.size()+1);
	messages.put(message.getId(),message);
	return message;
}
/**
 * Used to update an existing messages
 * 
 * @param message
 * @return
 */
public Message updateMessage(Message message){
	if(message.getId()<=0){
		return null;
	}
	messages.put(message.getId(),message);
	return message;
}
/**
 * Used to remove an existing messages
 * 
 * @param id
 * @return Message
 */
public Message removeMessage(long id){
	return messages.remove(id);
}

}
