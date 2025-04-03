<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<title>ForgotPassword</title>
</head>
<body>
<h2><center>Forgot password Form</center></h2>
      <form action="forgotPasswordAction.jsp"method="post">
      <input type="text" name="name" placeholder="Enter your name" required>
      <input type="email" name="email" placeholder="Enter your email" required>
      <input type="password" name="newPassword" placeholder="Enter your new password to set" required>
      <input type="submit" value="Save" required><br>
      <a href="login.jsp">Login</a>
      </form>
   <%
String msg=request.getParameter("msg");
if("done".equals(msg)){
	%> 
	<h1>Password changed Successfully !</h1>
	<%}
%>
<%
if("invalid".equals(msg)){
	%> 
	<h1>Something Went Wrong! Try Again !</h1>
	<%}
%>
</body>
</html>