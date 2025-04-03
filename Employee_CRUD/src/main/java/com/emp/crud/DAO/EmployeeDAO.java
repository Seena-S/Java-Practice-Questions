package com.emp.crud.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.crud.DTO.Employee;

public class EmployeeDAO {

	public static Connection getConnection() {
		Connection con=null;
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_crud", "root", "Seena");
	 }catch(Exception e) {
		 System.out.println(e);
	 }
	 return con;
	}
	public static int saveEmployee(Employee emp) {
		int status=0;
		try {
			Connection con=EmployeeDAO.getConnection();			
			PreparedStatement stmt=con.prepareStatement("insert into emp_table (name,password,email,country) values(?,?,?,?)");
			stmt.setString(1, emp.getName());
			stmt.setString(2, emp.getPwd());
			stmt.setString(3, emp.getEmail());
			stmt.setString(4, emp.getCtry());
			status=stmt.executeUpdate();
			con.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		return status;
	}
	public static List<Employee> getEmployees() {
	     ArrayList<Employee> li=new ArrayList<Employee>();
		try {
			Connection con=EmployeeDAO.getConnection();	
			PreparedStatement stmt=con.prepareStatement("select * from emp_table");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				Employee e1=new Employee();
				e1.setId(rs.getInt(1));
				e1.setName(rs.getString(2));
				e1.setPwd(rs.getString(3));
				e1.setEmail(rs.getString(4));
				e1.setCtry(rs.getString(5));
				li.add(e1);
			}
		}
		catch (SQLException e) {		
			e.printStackTrace();
		}
		return li;
	}
	
	public static int updateEmployee(Employee emp) {
        int status = 0;
        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement stmt = con.prepareStatement("update emp_table set name=?, password=?, email=?, country=? where id=?");
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getPwd());
            stmt.setString(3, emp.getEmail());
            stmt.setString(4, emp.getCtry());
            stmt.setInt(5, emp.getId());
            status = stmt.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }

    public  int deleteEmployee(int id) {
        int status = 0;
        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement stmt = con.prepareStatement("delete from emp_table where id=?");
            stmt.setInt(1, id);
            status = stmt.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }
    public static Employee getEmployeeById(int id) {
        Employee employee = null;
        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement stmt = con.prepareStatement("select * from emp_table where id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setPwd(rs.getString(3));
                employee.setEmail(rs.getString(4));
                employee.setCtry(rs.getString(5));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
