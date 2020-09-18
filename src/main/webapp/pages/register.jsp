<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="../css/register.css" type="text/css">
</head>
<body>
  <div class="brand">
  <h>Library Management</h>
  </div>
  <div class="register-form">
  <h>Registration</h>
  <form class="form" action="register" method="post" modelAttribute="registerPage">
  <p>Name :</p> <input type="text" placeholder="Enter your name" path="name" required/>
  <p>Mobile No :</p> <input type="text" placeholder="Enter mobile number" path="mobileNumber" required/>
  <p>Mobile Pin :</p> <input type="password" maxlength="4" required placeholder="Enter 4 digit pin" path="mobilePin"/></p>
  <p>Flat No :</p> <input type="text" placeholder="Enter flat number" path="flatNumber" required/></p>
  <p>Street :</p> <input type="text" placeholder="Enter your street" path="street" required/></p>
  <p>Village :</p> <input type="text" placeholder="Enter your village name" path="villageOrTown" required/></p>
  <p>District :</p> <input type="text" placeholder="Enter your district" path="district" required/></p>
  <p>Pincode :</p> <input type="text" placeholder="Enter pincode" path="pincode" minlength="6" maxlength="6" required/></p>
  <input class=submit"" type="submit" value="Register" id="register-button"/>
  <p>Already have account? <a href="login">login</a> </p> </form>
  </div>
</body>
</html>