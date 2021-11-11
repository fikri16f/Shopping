package com.shopping.main.services;
import java.util.List;

import com.shopping.main.entity.shopping;

public interface ModelShoppingInterface {

	public List<shopping> getAllShopping();
	public shopping addShopping(shopping shopping);
	public shopping getShoppingById(String id);
	public shopping cariShopping(String id);
	public List<shopping> getshoppingProses();
	public List<shopping> getshoppingResponse();
	
}
