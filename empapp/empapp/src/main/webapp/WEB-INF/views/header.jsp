<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nav bar</title>

<style type="text/css">
	div {
	width: 1100px;
	border: 1px solid black;
	padding: 20px;
	margin-left: 60px;
	background-color: gray;
}
a{
	margin-left: 40px;
	text-decoration:  none;
	color: white;
	box-shadow: 0 0 20px whitesmoke;
	padding: 10px;
	border-radius: 10px;
	font-size: 20px;
}
a:hover{
	background-color: orange;
	color: olive;

}

</style>
</head>
<body>
<div>
	<a href="./searchForm">Search</a>
	<a href="./addForm">Add employee</a>
	<a href="./updateForm">Update Employee</a>
	<a href="./deleteForm">Delete Employee</a>
	<a href="./seeAll">See All Employees</a>
	<a href="./logout">Logout</a>

</div>
</body>
</html>