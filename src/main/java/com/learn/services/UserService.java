package com.learn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.model.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();
	
	public UserService() {
		
		list.add(new User("abc","abc","ABC@GMAL.COM"));
		list.add(new User("xyz","xyz","XYZ@GMAIL.COM"));
	}
	
	public List<User> getAllUser(){
		
		return this.list;
	}
	
	
	public User getUserByName(String userName)
	{
		
		return this.list.stream().filter((user)->user.getUsername().equals(userName)).findAny().orElse(null);
	}
	
	public User addUser(User user) {
		
			this.list.add(user);
			return user;
	}
}
