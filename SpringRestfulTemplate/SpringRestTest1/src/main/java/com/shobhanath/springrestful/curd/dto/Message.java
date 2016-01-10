package com.shobhanath.springrestful.curd.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Message class 
 * 
 * @author shobhanath
 *
 */
@XmlRootElement(name="message")
@XmlAccessorType(XmlAccessType.NONE)
public class Message {
public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
@XmlAttribute
private long id;
public long getId() {
	return id;
}
public Message(long id, String message, String author) {
	super();
	this.id = id;
	this.message = message;
	this.author = author;
	this.created = new Date();
}
public void setId(long id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@XmlAttribute
private String message;
@XmlAttribute
private Date created;
@XmlAttribute
private String author;
}
