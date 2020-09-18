<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="../css/login.css" type="text/css">
</head>
<body>
  <div class="brand">
  <h>Library Management</h>
  </div>
  <div class="register-form">
  <h>Login</h>
  <form class="form" action="login" method="post" modelAttribute="registerPage">
  <p>Mobile No :</p> <input type="text" placeholder="Enter mobile number" path="mobileNumber"/>
  <p>Mobile Pin :</p> <input type="password" maxlength="4" placeholder="Enter 4 digit pin" path="mobilePin"/></p>
  <input class=submit"" type="submit" value="Login" id="register-button"/>
  <p>Don't have account? <a href="register">Register</a> </p> </form>
  </div>
</body>
</html>