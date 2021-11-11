package com.shopping.main.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.main.entity.shopping;
import com.shopping.main.repository.ShoppingRepository;


@Service
public class ModelShopping implements ModelShoppingInterface {

	@Autowired
	ShoppingRepository shoppingRepo;

	@Override
	public List<shopping> getAllShopping() {
		// TODO Auto-generated method stub
		return (List<shopping>) this.shoppingRepo.findAll();
	}

	@Override
	public shopping addShopping(shopping shopping) {
		// TODO Auto-generated method stub
		return this.shoppingRepo.save(shopping);
	}

	@Override
	public shopping getShoppingById(String id) {
		// TODO Auto-generated method stub
		return this.shoppingRepo.findById(Long.parseLong(id)).get();
	}
	
	@Override
	public shopping cariShopping(String id) {
		// TODO Auto-generated method stub
		return this.shoppingRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public List<shopping> getshoppingProses() {
		// TODO Auto-generated method stub
		return this.shoppingRepo.findStatusNull();
	}

	@Override
	public List<shopping> getshoppingResponse() {
		// TODO Auto-generated method stub
		return this.shoppingRepo.findStatusResponse();
	}

	
	
}
