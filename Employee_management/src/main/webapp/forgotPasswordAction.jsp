<%@page import="packag.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String email=request.getParameter("email");
String newPassword=request.getParameter("newPassword");
int check=0;
try{
	Connection con= ConnectionProvider.getCon();
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from employees where email='"+email+"'");
	while(rs.next()){
		check=1;
		stmt.executeUpdate("update employees set password='"+newPassword+"' where email='"+email+"'");
		response.sendRedirect("forgotPassword.jsp?msg=done");
	}
	if(check==0){
		response.sendRedirect("forgotPassword.jsp?msg=invalid");
	}
}catch(Exception e){
	System.out.println(e);
}
%>