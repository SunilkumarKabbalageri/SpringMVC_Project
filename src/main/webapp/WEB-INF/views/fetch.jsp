<%@page import="company.olx.dto.OlaDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All the details of customers</h1>
<%List<OlaDto> dtos=(List<OlaDto>)request.getAttribute("list"); %>

<table border="2px" color:blue solid>
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Vehicle</th>
<th>Mob_no</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%for(OlaDto dtos2:dtos){ %>
<tr>
<td><%=dtos2.getCustomer_id() %></td>
<td><%=dtos2.getName() %></td>
<td><%=dtos2.getEmail() %></td>
<td><%=dtos2.getVehicle()%></td>
<td><%=dtos2.getCustomer_no() %></td>
<td><button type="submit"><a href="update">Edit</a></button></td>
<td><button type="submit"><a href="delete">Delete</a></button></td>
</tr>
<%} %>
</table>
<button type="submit"><a href="insert">Add more details</a></button>
<button type="submit"><a href="home">Back</a></button>
</body>
</html>