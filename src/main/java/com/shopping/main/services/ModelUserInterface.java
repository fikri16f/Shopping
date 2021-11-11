package com.shopping.main.services;

import java.util.List;

import com.shopping.main.entity.user;



public interface ModelUserInterface {
	
public List<user> getAllUser();
	
	public user addUser(user User);
	public user getUserById(String id);
	public void deleteUser(String id);

}
