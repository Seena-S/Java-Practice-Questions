package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.RegisterDAO;
import com.example.demo.model.UserDTO;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterDAO dao;
	
	@RequestMapping("/")
	public String register() {		
		return "home.jsp";
	}
	@RequestMapping("/addUser")
	public String registerUser(UserDTO dto) {
		dao.save(dto);
		return "home.jsp";
	}
	@RequestMapping("/getUser")
	public ModelAndView displayUser(@RequestParam int id) {
		
		UserDTO fromdb=dao.findById(id).orElse(null);
		System.out.println(fromdb);
		return new ModelAndView("display.jsp","data",fromdb);
	}
	@RequestMapping("/updateUser")
	public String updateUser(UserDTO dto) {
		if (dao.existsById(dto.getId())) {
			dao.save(dto);
		}
		return "home.jsp";
	}

	
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam int id) {
		if (dao.existsById(id)) {
			dao.deleteById(id); 
		}
		return "home.jsp";
	}
	@RequestMapping("/listUsers")
	public ModelAndView listUsers() {
	    Iterable<UserDTO> users = dao.findAll();  
	    return new ModelAndView("list.jsp", "users", users);  
	}
	@RequestMapping("/view/{id}")
	@ResponseBody
	public String getUserbyId(@PathVariable("id") int id) {
		return dao.findById(id).toString();		
	}
	@RequestMapping("/view")
	@ResponseBody
	public String getView() {
		return dao.findAll().toString();		
	}
	

}
