<%@page import="com.cdac.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<Employee> lst = (List<Employee>) request.getAttribute("employees");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<div align="center">
		<h1 align="center">Employee List</h1>
		<table border="1" width="100%">
			<thead>
				<tr align="center">
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Salary</th>
					<th>Delete</th>
					<th>Update</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Employee emp : lst) {
				%>
				<tr align="center">
					<td><%=emp.getId()%></td>
					<td><%=emp.getFirstName()%></td>
					<td><%=emp.getLastName()%></td>
					<td><%=emp.getSalary()%></td>
					<td><a href="employee_delete.htm?id=<%=emp.getId()%>">Delete</a></td>
					<td><a href="employee_update_form.htm?id=<%=emp.getId()%>">Update</a></td>

				</tr>
				<%
}
%>
			</tbody>
		</table>
		<br> <br> <a href="index.jsp">Back to Home page</a>
	</div>
</body>
</html>
