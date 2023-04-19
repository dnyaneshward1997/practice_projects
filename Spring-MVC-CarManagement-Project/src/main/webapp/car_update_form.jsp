<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car Update Form</title>
</head>
<body>
	<div align="center">
		<h2>Car update form</h2>
		<br>
		<spr:form action="car_update.htm" commandName="car" method="post">
			<spr:hidden path="id" />
			<div>
				<label>Make :</label>
				<spr:input path="make" />
			</div>
			<br>
			<div>
				<label>Model :</label>
				<spr:input path="model" />
			</div>
			<br>
			<div>
				<label>Price :</label>
				<spr:input path="price" />
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
