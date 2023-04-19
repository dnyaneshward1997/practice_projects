<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mobile Update Form</title>
</head>
<body>
	<div align="center">
		<h2>Mobile Update Form</h2>
		<br>
		<spr:form action="mobile_update.htm" commandName="mobile"
			method="post">
			<spr:hidden path="id" />
			<div>
				<label>Company :</label>
				<spr:input path="company" />
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
			<spr:button>Update</spr:button>



		</spr:form>
		<br> <br> <a href="index.jsp">Back to Home page</a>
	</div>
</body>
</html>
