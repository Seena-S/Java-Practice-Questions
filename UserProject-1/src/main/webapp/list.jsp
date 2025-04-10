<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
    <h1>List of Users</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
            </tr>
        </thead>
        <tbody>
            <% 
                Iterable<com.example.demo.model.UserDTO> users = (Iterable<com.example.demo.model.UserDTO>) request.getAttribute("users");
                for (com.example.demo.model.UserDTO user : users) {
            %>
                <tr>
                    <td><%= user.getId() %></td>
                    <td><%= user.getName() %></td>
                    <td><%= user.getAge() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
