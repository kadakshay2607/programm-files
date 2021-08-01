<%@page import="com.te.empapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="header.jsp"%>

<%
EmployeeInfo info = (EmployeeInfo) request.getAttribute("info");
%>
<%
String errMsg = (String) request.getAttribute("errMsg");
%>

<%
if (errMsg != null && !errMsg.isEmpty()) {
%>

<%=errMsg%>

<%
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
	<br>
	<br>
	<fieldset>
		<legend>Search Employee</legend>

		<form action="./search" method="post">
			<table>
				<tr>
					<td><input type="number" name="id"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>

	</fieldset>

	<%
	if (info != null) {
	%>
	<h2>
		Employee Id :
		<%=info.getId()%>
	</h2>
	<h2>
		Employee name :
		<%=info.getName()%>
	</h2>

	<h2>
		Date of birth :
		<%=info.getDob()%>
	</h2>

	<h2>
		Employee Password :
		<%=info.getPassword()%>
	</h2>

	<%
	}
	%>


</body>
</html>






