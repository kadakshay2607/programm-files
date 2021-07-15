<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Date date = new Date();
String name=request.getParameter("user");
request.getParameter("pwd");
out.println(name);
%>
<%! 
int a= 10;
%>

<body>
<form action="">
<input type="text" name="user">
<input type="password" name="pwd">
<button>submit</button>
</form>
</body>
</html>