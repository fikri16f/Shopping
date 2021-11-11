package com.shopping.main.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="user")

public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String name;
	private String username;
	private String password;
	private String email;
	private int phone;
	private String country;
	private String city;
	private String postcode;
	private String address;
	private String Role;
	
	
}
