<%@ page import="java.sql.*" %>
<%@ page import="packag.ConnectionProvider" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Employee List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Actions</th>
        </tr>
        <%
        Connection con = ConnectionProvider.getCon();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
        while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getString("email") %></td>
            <td><%= rs.getString("department") %></td>
            <td>
                <a href="updateEmployee.jsp?id=<%= rs.getInt("id") %>"><u>Edit</u></a><br>
                <a href="employeeList.jsp?delete=<%= rs.getInt("id") %>"><u>Delete</u></a>
            </td>
        </tr>
        <%
        }
        %>
    </table>
    <br>
    <br>
    <a href="signup.jsp"><u>Add New Employee</u></a>

    <%
    if (request.getParameter("delete") != null) {
        int id = Integer.parseInt(request.getParameter("delete"));
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM employees WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            response.sendRedirect("employeeList.jsp");
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
    %>
</body>
</html>
