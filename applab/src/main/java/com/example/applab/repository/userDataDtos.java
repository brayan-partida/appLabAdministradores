package com.example.applab.repository;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.applab.DTO.userDtos;
import com.example.applab.model.user;
import com.example.applab.model.userdata;
@Repository
public interface userDataDtos  extends JpaRepository<userDtos, Serializable>{
	
	
	@Query(value = "select id,nombres from userdata", nativeQuery = true)
	public List<userDtos> getAllUser();
}
