<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addUser">
id: <input type="text" name="id"><br><br>
name: <input type="text" name="name"><br><br>
age: <input type="text" name="age"><br><br>
<input type="submit" value="Register"><br>
</form>
<br><br>
<form action="getUser">
Id: <input type="text" name="id"><br><br>
<input type="submit" value="Show me the user"><br>
</form>
<br><br>
<form action="updateUser" method="post">
    id: <input type="text" name="id"><br><br>
    name: <input type="text" name="name"><br><br>
    age: <input type="text" name="age"><br><br>
    <input type="submit" value="Update User"><br>
</form>
<br><br>
<!-- Delete User Form -->
<form action="deleteUser" method="get">
    Id: <input type="text" name="id"><br><br>
    <input type="submit" value="Delete User"><br>
</form>
<br><br>
<a href="listUsers">View All Users</a>
</body>
</html>