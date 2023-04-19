<%@page import="com.cdac.model.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<Car> lst = (List<Car>) request.getAttribute("cars");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car List</title>
</head>
<body>
	<div align="center">
		<h1 align="center">Car List</h1>
		<table border="1" width="100%">
			<thead>
				<tr align="center">
					<th>Make</th>
					<th>Model</th>
					<th>Price</th>
					<th>Delete</th>
					<th>Update</th>
					<th>Upload</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Car car : lst) {
				%>
				<tr align="center">
					<td><%=car.getMake()%></td>
					<td><%=car.getModel()%></td>
					<td><%=car.getPrice()%></td>
					<td><a href="car_delete.htm?id=<%=car.getId()%>">Delete</a></td>
					<td><a href="car_update_form.htm?id=<%=car.getId()%>">Update</a></td>
					<td><a href="car_upload.jsp?id=<%=car.getId()%>"> <img
							alt="no image" src="images/<%=car.getImage()%>" width="100"
							height="100">
					</a></td>
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
