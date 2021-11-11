package com.shopping.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shopping.main.entity.user;
import com.shopping.main.services.ModelUser;



@Controller
public class userPage {
	
	@Autowired
	ModelUser modelUser;
	
	@GetMapping("/user/view")
	public String viewIndexUser(Model model) {
		
		model.addAttribute("listuser",modelUser.getAllUser());
		model.addAttribute("active",1);
		
		return "view_user";
	}
	
	
	@GetMapping("/user/add")
	public String viewAddUser(Model model) {
		
		// buat penampung data Adminuser di halaman htmlnya
		model.addAttribute("user",new user());
		
		return "add_user";
	}
	
	@PostMapping("/adminuser/view")
	  public String addUser(@ModelAttribute user user, Model model) {
		
		// buat penampung data user di halaman htmlnya
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String plainPassword = user.getPassword();
		String encodedPassword = passwordEncoder.encode(plainPassword);
        user.setPassword(encodedPassword);		
		
		this.modelUser.addUser(user);
		model.addAttribute("listUser",modelUser.getAllUser());
		
		
		return "redirect:/user/view";
	}
	
	
	@GetMapping("/adminuser/update/{id}")
	public String viewUpdateUser(@PathVariable String id, Model model) {
		
		user User = modelUser.getUserById(id);
		// buat penampung data user di halaman htmlnya
		model.addAttribute("user", User);  
		
		return "add_user";
	}
	
	@GetMapping("/user/delete/{id}")
	public String deleteUser(@PathVariable String id, Model model) {
		
		this.modelUser.deleteUser(id);
		model.addAttribute("listUser",modelUser.getAllUser());
		
		
		return "redirect:/user/view";
	}

}
