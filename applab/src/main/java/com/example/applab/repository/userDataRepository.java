package com.example.applab.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.Where;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.applab.DTO.userDtos;
import com.example.applab.model.userdata;

@Repository
public interface userDataRepository extends JpaRepository<userdata, Serializable> {
//select  ud.* from user u inner join userdata ud on(u.id=ud.user_id)
	@Query(value = "select  ud.id,ud.nombres from userdata ud", nativeQuery = true)
	public List<userdata> getAllUser();
	
	

}
