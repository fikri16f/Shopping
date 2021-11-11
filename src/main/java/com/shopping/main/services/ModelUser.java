package com.shopping.main.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.main.entity.user;
import com.shopping.main.repository.UserRepository;

@Service
public class ModelUser implements ModelUserInterface{
	
	@Autowired
	UserRepository UserRepo;

	@Override
	public List<user> getAllUser() {
		// TODO Auto-generated method stub
		return (List<user>) this.UserRepo.findAll();
	}

	@Override
	public user addUser(user User) {
		// TODO Auto-generated method stub
		return this.UserRepo.save(User);
	}

	@Override
	public user getUserById(String id) {
		// TODO Auto-generated method stub
		return this.UserRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		this.UserRepo.deleteById(Long.parseLong(id));
	}


}
