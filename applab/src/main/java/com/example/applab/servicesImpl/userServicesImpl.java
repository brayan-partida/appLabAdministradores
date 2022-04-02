package com.example.applab.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.applab.DTO.userDtos;
import com.example.applab.Token.Token;
import com.example.applab.model.userdata;
import com.example.applab.repository.userDataDtos;
import com.example.applab.repository.userDataRepository;
import com.example.applab.services.userServices;

@Service
public class userServicesImpl implements userServices {

	@Autowired
	userDataRepository userRepository;

	@Autowired
	userDataRepository userrepo;
	
	
	@Autowired
	userDataDtos dtos;

//	@Autowired
//	userDataDtos userDto;

	/**
	 * obtener todo los usuarios
	 */
	@Override
	public Token selectGetAllUser() {
		Token tokenData = new Token();
		List<userDtos> userData = dtos.getAllUser();
		
		tokenData.setObjeto(userData);
		return tokenData;
	}

}
