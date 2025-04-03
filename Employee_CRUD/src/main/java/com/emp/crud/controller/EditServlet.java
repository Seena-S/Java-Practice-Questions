package com.emp.crud.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.crud.DAO.EmployeeDAO;
import com.emp.crud.DTO.Employee;


@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employee = employeeDAO.getEmployeeById(Integer.parseInt(id));
        
        // Display the edit form
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<form action='UpdateServlet' method='post'>");
        out.println("<input type='hidden' name='id' value='" + employee.getId() + "'/>");
        out.println("Name: <input type='text' name='name' value='" + employee.getName() + "'/><br/>");
        out.println("Password: <input type='password' name='pwd' value='" + employee.getPwd() + "'/><br/>");
        out.println("Email: <input type='email' name='email' value='" + employee.getEmail() + "'/><br/>");
        out.println("Country: <input type='text' name='country' value='" + employee.getCtry() + "'/><br/>");
        out.println("<input type='submit' value='Update'/>");
        out.println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement the update logic here, similar to SaveServlet
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String email = request.getParameter("email");
        String ctry = request.getParameter("country");
        
        Employee employee = new Employee();
        employee.setId(Integer.parseInt(id));
        employee.setName(name);
        employee.setPwd(pwd);
        employee.setEmail(email);
        employee.setCtry(ctry);
        
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.updateEmployee(employee); // Assume you have an update method in EmployeeDAO
        
        response.sendRedirect("ViewServlet");
    }

}
