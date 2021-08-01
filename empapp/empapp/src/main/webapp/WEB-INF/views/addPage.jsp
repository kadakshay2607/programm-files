<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ include file="header.jsp" %>
	
	<% String msg = (String) request.getAttribute("msg"); %>
	<% String errMsg = (String) request.getAttribute("errMsg"); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
</head>
<body>
<% if(errMsg!= null && !errMsg.isEmpty()){%>
	<h4> <%= errMsg %> </h4>  
	<% } %>
<br> <br>
	<fieldset>
		<legend> Add Employee </legend>
		<form action="./add" method="post">

			<table>
				<tr>
					<td>Enter employee id :</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td>Enter employee name :</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>

					<td>Enter employee dob :</td>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<td>Enter employee password :</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>


		</form>
	</fieldset>
	
	<% if(msg!= null && !msg.isEmpty()){%>
	<h1> <%= msg %> </h1>  
	<% } %>

</body>
</html>