package com.demo.mvc.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import com.demo.mvc.model.UserDTO;


public interface RegisterDAO extends JpaRepository<UserDTO, Integer>{
	
//	List<UserDTO> findByName(String name);
//	List<UserDTO> findByAge(int age);
//	List<UserDTO> findByAgeGreaterThan(int age);
//	
//	@Query("from UserDTO where age=?1 order by name")
//	List<UserDTO> findByAgeSorted(int age);

}
