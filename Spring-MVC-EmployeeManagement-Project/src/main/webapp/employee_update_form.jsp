<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Update Form</title>
</head>
<body>
	<div align="center">
		<h2>Employee Update Form</h2>
		<br>
		<spr:form action="employee_update.htm" commandName="employee" method="post">
			<spr:hidden path="id" />
			<div>
				<label>First Name :</label>
				<spr:input path="firstName" />
			</div>
			<br>
			<div>
				<label>Last Name :</label>
				<spr:input path="lastName" />
			</div>
			<br>
			<div>
				<label>Salary :</label>
				<spr:input path="salary" />
			</div>
			<br>
			<%-- <spr:button>Update</spr:button> --%>
			<button onclick="myFunction1()">Update</button>
			<script>
				function myFunction1() {
					alert("Record updated successfully...");
				}
			</script>
		</spr:form>
		<br> <br> <a href="index.jsp">Back to Home page</a>
	</div>
</body>
</html>
