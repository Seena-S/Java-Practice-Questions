package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(HttpServletRequest req,HttpSession session) {
		System.out.println("hlo");
		
		String name=req.getParameter("name");
		session.setAttribute("name",name);
		return "home";
	}

}
