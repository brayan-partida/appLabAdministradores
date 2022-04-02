package com.example.applab.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "userdata")
@AllArgsConstructor
@NoArgsConstructor
public class userdata implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	private String nombres;

	private String apellidos;

	private String correoElectronico;

	private String area;

	private String estatus;

	private String urlImages;
	@ManyToOne(fetch = FetchType.EAGER)
	private user user;

}
