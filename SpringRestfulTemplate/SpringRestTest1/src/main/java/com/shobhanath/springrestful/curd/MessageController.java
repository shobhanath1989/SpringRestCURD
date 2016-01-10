package com.shobhanath.springrestful.curd;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shobhanath.springrestful.curd.dto.Message;
import com.shobhanath.springrestful.curd.dto.MessageLists;
import com.shobhanath.springrestful.curd.service.MessageService;
/**
 * Restful Service class to expose service for messages
 * 
 * @author shobhanath
 *
 */
@RestController
public class MessageController {
    MessageService messageService = new MessageService();
	/**
	 * R - CRUD(CREATE RETRIEVE UPDATE DELETE)
	 * 
	 * Used to get all the available messages.
	 * 
	 * @return either JSON or XML as response
	 */
    @RequestMapping(value = "/messages",method = RequestMethod.GET, produces = { "application/json","application/xml" })
	@ResponseStatus(HttpStatus.OK)
    public MessageLists getMessages(){
		return messageService.getAllMessages();
	}
    
    /**
     * R - CRUD
     * 
	 * Used to get a individual message.
	 * 
	 * @return either JSON or XML as response
	 */
    @RequestMapping(value = "/messages/{messgeId}",method = RequestMethod.GET, produces = { "application/xml", "application/json" })
	@ResponseStatus(HttpStatus.OK)
    public Message getMessage(@PathVariable("messgeId") long messgeId){
		return messageService.getMessage(messgeId);
	}

    /**
     * C - CRUD
     * 
	 * Used to create a new message.
	 * 
	 * @param either JSON or XML as request
	 * @return either JSON or XML as response
	 */
    @RequestMapping(value = "/messages",method = RequestMethod.POST, consumes = { "application/xml", "application/json" },produces = { "application/xml", "application/json" })
	@ResponseStatus(HttpStatus.OK)
    public Message addMessage(@RequestBody Message message){
		return messageService.addMessage(message);
	}
    
    /**
     * U - CRUD
     * 
   	 * Used to update an existing message.
   	 * 
   	 * @param either JSON or XML as request
   	 * @return either JSON or XML as response
   	 */
    @RequestMapping(value = "/messages/{messgeId}",method = RequestMethod.PUT, consumes = { "application/xml", "application/json" },produces = { "application/xml", "application/json" })
   	@ResponseStatus(HttpStatus.OK)
       public Message updateMessage(@PathVariable("messgeId") long messgeId,@RequestBody Message message){
    	message.setId(messgeId);
   		return messageService.updateMessage(message);
   	}
    
    /**
     * D - CRUD
     * 
   	 * Used to delete an existing message.
   	 * 
   	 * @param either JSON or XML as request
   	 * @return either JSON or XML as response
   	 */
    @RequestMapping(value = "/messages/{messgeId}",method = RequestMethod.DELETE, consumes = { "application/xml", "application/json" },produces = { "application/xml", "application/json" })
   	@ResponseStatus(HttpStatus.OK)
       public Message deleteMessage(@PathVariable("messgeId") long messgeId){
   		return messageService.removeMessage(messgeId);
   	}
    
    
}
