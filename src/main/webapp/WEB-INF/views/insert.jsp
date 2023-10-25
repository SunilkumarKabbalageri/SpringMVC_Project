<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter the details</h1>
<form action="insertdata" method="post">
<input type="text" name="name" placeholder="Enter the name"><br>
<input type="email" name="email" placeholder="Enter the email">
<input type="text" name="vehicle" placeholder="Vehicle_name"><br>
<input type="text" name="customer_no" placeholder="Mobile_no">
<button type="submit">Enter</button>
<button type="submit"><a href="home">Back</a></button>
</form>
</body>
</html>