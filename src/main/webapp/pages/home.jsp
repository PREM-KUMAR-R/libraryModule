<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="../css/home.css" type="text/css">
<script>
function commingSoon() {
	alert("Comming Soon!!!");
}
</script>
</head>
<body>
  <div class="head">
  <h class="brand">Library Management</h>
  <a href="login" onclick="return alert('Successfully loged out!!!')">logout</a>
  </div>
  <div class="module">
  <div>
  <a href="addBooks" > Add Books</a>
  </div>
  <div><a href="home" onclick=commingSoon()>Books History</a> </div>
  <div><a href="home" onclick=commingSoon()>User Details</a></div>
  </div>
</body>
</html>