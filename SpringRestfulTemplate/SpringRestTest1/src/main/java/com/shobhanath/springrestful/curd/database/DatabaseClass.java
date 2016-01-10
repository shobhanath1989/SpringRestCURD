package com.shobhanath.springrestful.curd.database;

import java.util.HashMap;
import java.util.Map;

import com.shobhanath.springrestful.curd.dto.Message;
import com.shobhanath.springrestful.curd.dto.Profile;
/**
 * The DatabaseClass
 * 
 * @author shobhanath
 *
 */
public class DatabaseClass {
private static Map<Long,Profile> profiles = new HashMap<Long,Profile>();
public static Map<Long, Profile> getProfiles() {
	return profiles;
}
public static Map<Long, Message> getMessages() {
	return messages;
}
private static Map<Long,Message> messages = new HashMap<Long,Message>();

}
