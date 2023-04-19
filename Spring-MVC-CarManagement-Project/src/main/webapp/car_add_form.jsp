<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car Add Form</title>
<script type="text/javascript">
	function alertName() {
		alert("Record added successfully");
	}
</script>
</head>
<body>
	<div align="center">
		<h2>Car add form</h2>
		<br> <br>
		<spr:form action="car_add.htm" commandName="car" method="post">
			<div>
				<label>Make :</label>
				<spr:input path="make" />
				<span style="color: red"><spr:errors path="make"></spr:errors>
				</span>
			</div>
			<br>
			<div>
				<label>Model :</label>
				<spr:input path="model" />
				<span style="color: red"><spr:errors path="model"></spr:errors>
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
			<%-- <spr:button>Add</spr:button> --%>
			<button onclick="myFunction()">Add</button>
			<script>
				function myFunction() {
					alert("Record added successfully...");
				}
			</script>
		</spr:form>
		<br> <br> <a href="index.jsp">Back to Home page</a>
	</div>
</body>
</html>