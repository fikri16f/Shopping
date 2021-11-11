package com.shopping.main.repository;
import org.springframework.data.repository.CrudRepository;

import com.shopping.main.entity.user;
import com.shopping.main.entity.user;

public interface UserRepository extends CrudRepository<user, Long>{

	public user findByUsername(String username);
	
}
