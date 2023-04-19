<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Update Form</title>
</head>
<body>
	<div align="center">
		<h2>Product Update Form </h2>
		<br>
		<spr:form action="product_update.htm" commandName="product" method="post">
			<spr:hidden path="product_Id" />
			<div>
				<label>Name :</label>
				<spr:input path="name" />
			</div>
			<br>
			<div>
				<label>Company :</label>
				<spr:input path="company" />
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
