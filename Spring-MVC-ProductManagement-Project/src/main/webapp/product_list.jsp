<%@page import="com.cdac.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<Product> lst = (List<Product>) request.getAttribute("products");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
	<div align="center">
		<h1 align="center">Product List</h1>
		<table border="1" width="100%">
			<thead>
				<tr align="center">
			
					<th>Name</th>
					<th>Company</th>
					<th>Price</th>
					<th>Delete</th>
					<th>Update</th>
					<th>Upload</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Product product : lst) {
				%>
				<tr align="center">
					<td><%=product.getName()%></td>
					<td><%=product.getCompany()%></td>
					<td><%=product.getPrice()%></td>
					<td><a href="product_delete.htm?id=<%=product.getProduct_Id()%>">Delete</a></td>
					<td><a href="product_update_form.htm?id=<%=product.getProduct_Id()%>">Update</a></td>
					<td><a href="product_upload.jsp?id=<%=product.getProduct_Id()%>"> <img
							alt="no image" src="images/<%=product.getImage()%>" width="100"
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
