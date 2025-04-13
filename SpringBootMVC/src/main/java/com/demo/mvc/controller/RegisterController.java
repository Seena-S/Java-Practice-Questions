package com.demo.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.mvc.dao.RegisterDAO;
import com.demo.mvc.model.UserDTO;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterDAO dao;
	
	@RequestMapping("/")
	public String register() {
		//System.out.println(dao.findByAgeSorted(26));
		return "home.jsp";
	}
//	@RequestMapping("/addUser")
//	public String registerUser(UserDTO dto) {
//		dao.save(dto);
//		return "home.jsp";
//	}
//	@RequestMapping("/getUser")
//	public ModelAndView displayUser(@RequestParam int id) {
//		
//		UserDTO fromdb=dao.findById(id).orElse(null);
//		System.out.println(fromdb);
//		return new ModelAndView("display.jsp","data",fromdb);
//	}
//	@RequestMapping("/updateUser")
//	public String updateUser(UserDTO dto) {
//		if (dao.existsById(dto.getId())) {
//			dao.save(dto);
//		}
//		return "home.jsp";
//	}

	
//	@RequestMapping("/deleteUser")
//	public String deleteUser(@RequestParam int id) {
//		if (dao.existsById(id)) {
//			dao.deleteById(id); 
//		}
//		return "home.jsp";
//	}
//	@RequestMapping("/listUsers")
//	public ModelAndView listUsers() {
//	    Iterable<UserDTO> users = dao.findAll();  
//	    return new ModelAndView("list.jsp", "users", users);  
//	}
//	@RequestMapping("/view/{id}")
//	@ResponseBody
//	public String getUserbyId(@PathVariable("id") int id) {
//		return dao.findById(id).toString();		
//	}
//	@RequestMapping("/view")
//	@ResponseBody
//	public String getView() {
//		return dao.findAll().toString();		
//	}
	@GetMapping(path="/view",produces = {"application/xml"})
	public List<UserDTO> getView() {
		return dao.findAll();		
	}
	@RequestMapping("/view/{id}")
	public Optional<UserDTO> getUserbyId(@PathVariable("id") int id) {
		return dao.findById(id);		
	}
	
	@PostMapping(path="/views", consumes = {"application/json"})
	public UserDTO registerUser(@RequestBody UserDTO dto) {
		dao.save(dto);
		return dto;
	}
	@DeleteMapping("/views/{id}")
	public String deleteUser(@PathVariable int id) {
		UserDTO dto=dao.getOne(id);
		dao.delete(dto);
		return "deleted";
	}
	
	@PutMapping(path="/views", consumes = {"application/json"})
	public UserDTO RegisterOrUpdateUser(@RequestBody UserDTO dto) {		
		dao.save(dto);		
		return dto;
	}

}
