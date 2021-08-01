<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<% String errMsg = (String) request.getAttribute("errMsg"); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
</head>
<body>

<% if(errMsg!=null && !errMsg.isEmpty()) {%>

<h1> <%= errMsg %> </h1>

<% } %>


	<fieldset>
		<legend>
			<h2>Login form</h2>
		</legend>

		<form action="./login" method="post">


			<table>
				<tr>
					<td>Employee Id :</td>
					<td><input type="number" name="empId"></td>

				</tr>

				<tr>

					<td>Employee password :</td>
					<td><input type="password" name="empPwd"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>