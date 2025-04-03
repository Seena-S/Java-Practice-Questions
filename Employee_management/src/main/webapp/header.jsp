<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<script src="https://unpkg.com/boxicons@2.1.4/dist/boxicons.js"></script>
</head>
    <!--Header-->
    <br>
    <div class="topnav sticky">
           <% String email=session.getAttribute("email").toString(); %>
            <center><h2>Employee details</h2></center>
            <h2><a href=""><%out.println(email); %></a></h2>
            <a href="employeeList.jsp"><i class='bx bx-list-ul' ></i></a>
            <a href="logout.jsp">Logout <i class='bx bx-log-out'></i></a>                                         
  </div>
           <br>