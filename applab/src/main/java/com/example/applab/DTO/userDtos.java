package com.example.applab.DTO;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class userDtos {

	public Integer id;

	public String nombres;

	/*
	 * private String apellidos;
	 * 
	 * private String correoElectronico;
	 * 
	 * private String area;
	 * 
	 * private String estatus;
	 * 
	 * private String urlImages;
	 * 
	 * private Integer user_id;
	 */
}
