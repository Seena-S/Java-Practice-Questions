
<%@ page import="java.sql.*" %>
<%@ page import="packag.ConnectionProvider" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2><center>Login Form</center></h2>
    <form method="post">
        Email: <input type="email" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Login"><br>
        <a href="signup.jsp">Sign Up</a><br>
        <a href="forgotPassword.jsp">Forgot Password?</a>
    </form>

    <%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employees WHERE email=? AND password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                response.sendRedirect("employeeList.jsp");
            } else {
                out.println("<p>Invalid email or password!</p>");
            }
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
    %>
</body>
</html>
