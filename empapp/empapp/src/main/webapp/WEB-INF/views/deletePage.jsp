<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<% String msg = (String)  request.getAttribute("msg");%>
<% String errMsg = (String)  request.getAttribute("errMsg");%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete page</title>
</head>
<body>
<% if(errMsg!= null && !errMsg.isEmpty()){%>
	<h4> <%= errMsg %> </h4>  
	<% } %>
	<br>
	<br>
	<fieldset>
		<legend>Delete Employee</legend>

		<form action="./delete" method="post">
			<table>
				<tr>
					<td><input type="number" name="empId"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Delete"></td>
				</tr>
			</table>
		</form>

	</fieldset>

	<% if(msg!= null && !msg.isEmpty()){%>
	<h1> <%= msg %> </h1>  
	<% } %>





</body>
</html>