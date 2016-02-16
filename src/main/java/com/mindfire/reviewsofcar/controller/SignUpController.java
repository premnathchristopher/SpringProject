package com.mindfire.reviewsofcar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.reviewsofcar.dto.UserRegistrationDto;
import com.mindfire.reviewsofcar.dto.UserSigninDto;
import com.mindfire.reviewsofcar.service.UserDetailsService;

@Controller
public class SignUpController {
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	
	@RequestMapping(value="/signup",method = RequestMethod.POST)
	public String signup(@ModelAttribute("user") UserRegistrationDto dto, Model model) {
		return userDetailsService.createUserDetails(dto, model);
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") UserSigninDto dto, Model model){
		return userDetailsService.UserLogin(dto, model);
	}
	

}