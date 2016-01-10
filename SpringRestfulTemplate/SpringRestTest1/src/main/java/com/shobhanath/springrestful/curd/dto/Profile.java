package com.shobhanath.springrestful.curd.dto;
import java.util.Date;
/**
 * The Profile class
 * 
 * @author shobhanath
 *
 */
public class Profile {
private long id;
private String profileName;
public long getId() {
	return id;
}
public Profile(long id, String profileName, String firstName, String lastName) {
	super();
	this.id = id;
	this.profileName = profileName;
	this.firstName = firstName;
	this.lastName = lastName;
}
public void setId(long id) {
	this.id = id;
}
public String getProfileName() {
	return profileName;
}
public void setProfileName(String profileName) {
	this.profileName = profileName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
private String firstName;
private String lastName;
private Date created;
}
