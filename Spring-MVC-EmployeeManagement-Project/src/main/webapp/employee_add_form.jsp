<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Add Form</title>
<script type="text/javascript">
	function alertName() {
		alert("Record added successfully");
	}
</script>
</head>
<body>
	<div align="center">
		<h2>Employee  add form</h2>
		<br> <br>
		<spr:form action="employee_add.htm" commandName="employee" method="post">
			<div>
				<label>First Name :</label>
				<spr:input path="firstName" />
				<span style="color: red"><spr:errors path="firstName"></spr:errors>
				</span>
			</div>
			<br>
			<div>
				<label>Last Name :</label>
				<spr:input path="lastName" />
				<span style="color: red"><spr:errors path="lastName"></spr:errors>
				</span>
			</div>
			<br>
			<div>
				<label>Salary :</label>
				<spr:input path="salary" />
				<span style="color: red"><spr:errors path="salary"></spr:errors>
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