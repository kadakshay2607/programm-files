<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to jsp</h1>
<!-- scriplet tag -->
<%
int a=20;
out.println(a);
out.println(demo());
Date h = new Date();
out.println(h);

%>
<!-- description tag -->
<%!
int a=50;
public int demo(){
	return a;
}
public void test(){}
%>
<%= " the value of a = " +a%>





</body>
</html>