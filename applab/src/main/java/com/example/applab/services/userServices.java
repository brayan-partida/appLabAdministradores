package com.example.applab.services;

import org.springframework.stereotype.Service;

import com.example.applab.Token.Token;



@Service
public interface userServices {

	/**
	 * obtiene todos los usuarios
	 * @return
	 */
	Token selectGetAllUser();
}
