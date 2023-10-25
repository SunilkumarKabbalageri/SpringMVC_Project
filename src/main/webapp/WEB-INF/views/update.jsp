<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update the details</h1>
<form action="updatedata" method="post">
<input type="text" name="customer_id" placeholder="Enter customer id"><br>
<input type="text" name="name" placeholder="Enter Name"><br>
<input type="text" name="vehicle" placeholder="type of vehicle"><br>
<button type="submit">Update</button>
<button type="submit"><a href="home">Back</a></button>
</form>
</body>
</html>