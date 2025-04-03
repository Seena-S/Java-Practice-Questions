
<%@page import="java.sql.*"%>
<%@page import="packag.ConnectionProvider" %>
<!DOCTYPE html>
<html>
<head>
    <title>Signup</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2><center>Signup Form</center></h2>
    <form method="post">
        Name: <input type="text" name="name" required><br>
        Email: <input type="email" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        Department: <input type="text" name="department"><br>
        <input type="submit" value="Signup">      
    </form>

    <%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String department = request.getParameter("department");

        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO employees(name, email, password, department) VALUES(?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, department);
            ps.executeUpdate();
            out.println("<center><p>Signup successful! <a href='login.jsp'>Login</a></p></center>");
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
    %>
</body>
</html>