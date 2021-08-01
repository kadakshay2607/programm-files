<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg = (String) request.getAttribute("msg"); %>
    <% String val = (String) request.getAttribute("val"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie page</title>
</head>
<body>
<table>
	<tr> <td> <a href="./createCookie">  create a cookie </a> </td> </tr>
	<tr> <td> <a href="./readCookie">  Read a cookie </a> </td> </tr>
	
	
</table>

<% if(msg!=null && !msg.isEmpty()) {%>

	<%= msg %>

<% } %>

<% if(val!=null && !val.isEmpty()) {%>

	<%= val %>

<% } %>

</body>
</html>