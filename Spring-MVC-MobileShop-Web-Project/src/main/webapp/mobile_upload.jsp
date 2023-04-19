<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Page</title>
</head>
<body>
	<div align="center">
		<h2>Upload the Mobile</h2>
		<form action="mobile_upload.htm" method="post"
			enctype="multipart/form-data">
			<input type="hidden" name="id"
				value="<%=request.getParameter("id")%>">
			<div>
				<label>Select image </label><br> <br> <input type="file"
					name="image">
			</div>
			<br>
			<button type="submit" onclick="myFunction2()">Upload</button>
			<script>
				function myFunction2() {
					alert("Record uploaded successfully...");
				}
			</script>
		</form>
	</div>
</body>
</html>