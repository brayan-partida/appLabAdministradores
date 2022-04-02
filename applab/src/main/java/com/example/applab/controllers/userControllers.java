package com.example.applab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.applab.Token.Token;
import com.example.applab.services.userServices;
import com.example.applab.servicesImpl.userServicesImpl;

@RestController
@RequestMapping("/administradores")
public class userControllers {

	@Autowired
	userServices userservice;


	@GetMapping("/selectall")
	public Token selectallUser() {
		Token tokenData = new Token();
		tokenData = userservice.selectGetAllUser();
		return tokenData;

	}
}
