<%@page import="com.te.empapp.dao.EmployeeDAO"%>
<%@page import="com.te.empapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String msg = (String) request.getAttribute("msg");
%>
<%
Integer id = (Integer) request.getAttribute("id");
%>

<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
</head>
<body>
	<%
	if (msg != null && !msg.isEmpty()) {
	%>

	<h1>
		<%=msg%></h1>

	<%
	}
	%>
	<br>
	<br>
	<fieldset>
		<legend> Update Employee </legend>
		<form action="./update" method="post">

			<table>
				<tr>
					<td>Enter employee id :</td>
					<td> <%=id%> </td>
					<td><input type="number" hidden  name="id" value="<%=id%>"></td>


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
					<td><input type="submit" value="Update"></td>
				</tr>
			</table>


		</form>
	</fieldset>



</body>
</html>