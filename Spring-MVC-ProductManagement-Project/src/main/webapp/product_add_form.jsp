<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Add Form</title>

</head>
<body>
	<div align="center">
		<h2>Product add form</h2>
		<br> <br>
		<spr:form action="product_added.htm" commandName="product"
			method="post">
			<div>
				<label>Name :</label>
				<spr:input path="name" />
				<span style="color: red"><spr:errors path="name"></spr:errors>
				</span>
			</div>
			<br>
			<div>
				<label>Company :</label>
				<spr:input path="company" />
				<span style="color: red"><spr:errors path="company"></spr:errors>
				</span>
			</div>
			<br>
			<div>
				<label>Price :</label>
				<spr:input path="price" />
				<span style="color: red"><spr:errors path="price"></spr:errors>
				</span>
			</div>
			<br>
			<spr:button>Add</spr:button>


		</spr:form>
		<br> <br> <a href="index.jsp">Back to Home page</a>
	</div>
</body>
</html>