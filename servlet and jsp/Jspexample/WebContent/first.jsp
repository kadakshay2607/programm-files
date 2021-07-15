<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ page import="java.util.Date" %>
	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>


	<h1>Welcome to our 1st JSP page</h1>

	<!-- Scriptlet tag -->
	<%
	out.println("The Sum is : " + (a + b));
	out.println("The values : " + sum());

	Date date = new Date();
	out.println(date);
	%>
	<!-- Declaration tag -->
	<%!
	
	 int a = 10;
	 int b = 20;
	
	public int sum(){
		return a+b;
	}
	%>
	<!-- Expression tag -->
	<%= "The new values : " + a*b %>
	


	

</body>
</html>