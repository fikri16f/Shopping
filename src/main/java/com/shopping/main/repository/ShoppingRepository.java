package com.shopping.main.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shopping.main.entity.shopping;

public interface ShoppingRepository extends CrudRepository<shopping, Long> {
	
	@Query(value = "select * from shopping where status is not null",nativeQuery=true)
	public List<shopping> findStatusResponse(); 

	@Query(value = "select * from shoppping where status is null",nativeQuery=true)
	public List<shopping> findStatusNull(); 


}
