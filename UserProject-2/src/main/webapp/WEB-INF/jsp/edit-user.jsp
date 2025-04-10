<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit User</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h1 {
            color: #333;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            margin: auto;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .button {
            padding: 10px 20px;
            background-color: #5cb85c;
            color: white;
            border: none;
            cursor: pointer;
        }
        .button:hover {
            background-color: #4cae4c;
        }
        .back-link {
            display: block;
            margin-top: 20px;
            text-align: center;
        }
    </style>
</head>
<body>

<h1>Edit User</h1>

<div class="form-container">
    <form action="/users/${user.id}" method="post">
        <input type="hidden" name="_method" value="PUT">
        
        <label for="name">Name</label>
        <input type="text" id="name" name="name" value="${user.name}" required>
        
        <label for="age">Age</label>
        <input type="number" id="age" name="age" value="${user.age}" required>
        
        <label for="place">Place</label>
        <input type="text" id="place" name="place" value="${user.place}" required>
        
        <label for="contactNumber">Contact Number</label>
        <input type="text" id="contactNumber" name="contactNumber" value="${user.contactNumber}" required>
        
        <button type="submit" class="button">Update User</button>
    </form>
</div>

<div class="back-link">
    <a href="/users">Back to User List</a>
</div>

</body>
</html>
