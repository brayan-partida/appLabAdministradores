package com.example.applab.repository;

import java.io.Serializable;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.applab.model.user;

public interface userRepository extends JpaRepository<user, Serializable> {

}
