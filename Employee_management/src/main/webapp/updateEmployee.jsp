<%@ page import="java.sql.*" %>
<%@ page import="packag.ConnectionProvider" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Update Employee</h2>
    <%
    int id = Integer.parseInt(request.getParameter("id"));
    Connection con = ConnectionProvider.getCon();
    PreparedStatement ps = con.prepareStatement("SELECT * FROM employees WHERE id=?");
    ps.setInt(1, id);
    ResultSet rs = ps.executeQuery();
    if (rs.next()) {
    %>
    <form method="post">
        Name: <input type="text" name="name" value="<%= rs.getString("name") %>" required><br>
        Email: <input type="email" name="email" value="<%= rs.getString("email") %>" required><br>
        Password: <input type="password" name="password" value="<%= rs.getString("password") %>" required><br>
        Department: <input type="text" name="department" value="<%= rs.getString("department") %>"><br>
        <input type="hidden" name="id" value="<%= id %>">
        <input type="submit" value="Update">
    </form>
    <%
    } else {
        out.println("<p>Employee not found!</p>");
    }

    if (request.getMethod().equalsIgnoreCase("post")) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String department = request.getParameter("department");
        
        try {
            PreparedStatement updatePs = con.prepareStatement("UPDATE employees SET name=?, email=?, password=?, department=? WHERE id=?");
            updatePs.setString(1, name);
            updatePs.setString(2, email);
            updatePs.setString(3, password);
            updatePs.setString(4, department);
            updatePs.setInt(5, id);
            updatePs.executeUpdate();
            response.sendRedirect("employeeList.jsp");
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
    %>
</body>
</html>
