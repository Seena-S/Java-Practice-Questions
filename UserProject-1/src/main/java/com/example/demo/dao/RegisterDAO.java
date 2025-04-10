package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.UserDTO;

public interface RegisterDAO extends JpaRepository<UserDTO, Integer>{
	
}
