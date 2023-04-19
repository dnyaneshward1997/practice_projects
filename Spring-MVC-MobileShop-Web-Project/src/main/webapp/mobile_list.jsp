<%@page import="com.cdac.model.Mobile"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<Mobile> lst = (List<Mobile>) request.getAttribute("mobiles");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mobile List</title>
</head>
<body>
	<div align="center">
		<h1 align="center">Mobile List</h1>
		<table border="1" width="100%">
			<thead>
				<tr align="center">
			
					<th>Company</th>
					<th>Model</th>
					<th>Price</th>
					<th>Delete</th>
					<th>Update</th>
					<th>Upload</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Mobile mobile : lst) {
				%>
				<tr align="center">
						<td><%=mobile.getCompany()%></td>
					<td><%=mobile.getModel()%></td>
					<td><%=mobile.getPrice()%></td>
					<td><a href="mobile_delete.htm?id=<%=mobile.getId()%>">Delete</a></td>
					<td><a href="mobile_update_form.htm?id=<%=mobile.getId()%>">Update</a></td>
					<td><a href="mobile_upload.jsp?id=<%=mobile.getId()%>"> <img
							alt="no image" src="images/<%=mobile.getImage()%>" width="100"
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
