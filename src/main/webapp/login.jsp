<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.heading {
	color: #000080;
}

.sub {
	color: #1e90ff;
}

.failure
{
	color:red;
}
</style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"> 
</head>
<body bgcolor='#add8e6'>
	
	<div align="center">
	<%if(request.getAttribute("failure")!=null){ %>
	<h3 class="failure"><%=request.getAttribute("failure")%></h3>
	<%}%>
		<h1 class="heading">Pentago Space</h1>
		<h3 class="sub">Login</h3>
		<form action="login" method="post">
	<br>
			<table>
				<tr>
					<td><b>Enter your mail ID:</b></td>
					<td><input type="email" name="mail" required="required"></td>
				</tr>
				<tr>
					<td><br></td>
					<td><br></td>
				</tr>
				<tr>
					<td><b>Enter the password:</b></td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><br></td>
					<td><br></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
					<td><a href="forginpin.jsp">forgot pin?</a></td>
				</tr>
				<tr>
					<td><br></td>
					<td><br></td>
				</tr>
			</table>
			Don't have a account?<a href="Signup.jsp">signup</a> 
		</form>
	</div>
</body>
</html>