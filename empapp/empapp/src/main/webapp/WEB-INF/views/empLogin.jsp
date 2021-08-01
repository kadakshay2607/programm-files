<%@page import="java.util.List"%>
<%@page import="com.te.empapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="header.jsp"%>

<%
String name = (String) request.getAttribute("name");
%>
<%
String errMsg = (String) request.getAttribute("errMsg");
%>

<%
List<EmployeeInfo> infos = (List<EmployeeInfo>) request.getAttribute("infos");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%
	if (name != null && !name.isEmpty()) {
	%>
	<h1>
		Welcome
		<%=name%>
	</h1>

	<%
	}
	%>
	<%
	if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h1>

		<%=errMsg%>
	</h1>

	<%
	}
	%>
	<table>
		<tr>
			<th>Employee id</th>
			<th>Employee name</th>
			<th>Employee dob</th>
		</tr>
		<%
		if (infos != null) {
		%>
		<%
		for (EmployeeInfo info : infos) {
		%>
		<tr>
			

			<td><%=info.getId()%></td>
			<td><%=info.getName()%></td>
			<td><%=info.getDob()%></td>

		</tr>

		<%
		}
		%>
		<%
		}
		%>

	</table>


</body>
</html>
