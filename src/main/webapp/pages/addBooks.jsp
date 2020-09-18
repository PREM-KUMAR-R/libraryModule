<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="../css/addBooks.css" type="text/css">
</head>
<body>
  <div class="brand">
  <h>Library Management</h>
  </div>
  <div class="register-form">
  <h>Add Book</h>
  <form class="form" action="register" method="post" modelAttribute="registerPage">
  <p>Book Name :</p> <input type="text" placeholder="Enter book name"  required/>
  <p>Author :</p> <input type="text" placeholder="Enter author name" required/>
  <p>publisher :</p> <input type="text" placeholder="Enter publisher name" required/>
  <p>price :</p> <input type="text" placeholder="Enter Price" required/>
  <input class=submit"" type="submit" value="ADD" id="register-button"/>
  <p>Go back to the home? <a href="home">cancel</a> </p> </form>
  </div>
</body>
</html>