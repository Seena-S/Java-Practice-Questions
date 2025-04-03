package com.emp.crud.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.crud.DAO.EmployeeDAO;
import com.emp.crud.DTO.Employee;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		PrintWriter out=response.getWriter();
		response.setContentType("text/html"); 
		String name= request.getParameter("name");
        String pwd= request.getParameter("pwd");
        String email= request.getParameter("email");
        String ctry= request.getParameter("country");
        
        Employee e1 =new Employee();
        e1.setName(name);
        e1.setPwd(pwd);
        e1.setEmail(email);
        e1.setCtry(ctry);
        
        int status=EmployeeDAO.saveEmployee(e1);
        
        if(status>0) {
        	out.print("Record saved successfully..");
        	request.getRequestDispatcher("index.html").include(request,response);
        }
        else {
        	out.print("Sorry unable to save the record!!");
        }
        out.close();       
    }
}