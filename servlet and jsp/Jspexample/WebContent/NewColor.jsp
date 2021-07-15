<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="NewHeader.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String color = request.getParameter("lor");

%>
<body bgcolor = "<%= color %>">
<h2>Testing color for background</h2>
<form action="">
<input type="text" name="lor">
<button>Try this color</button>

</form>

</body>
</html>