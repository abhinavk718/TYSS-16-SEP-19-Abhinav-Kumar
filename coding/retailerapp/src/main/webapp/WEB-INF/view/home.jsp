<%@page import="com.ty.retailer.dto.ProductBean"%>
<%@page import="com.ty.retailer.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./update">Update Profile</a>
	<a href="./delete">delete Profile</a>
	<a href="./logout" style="color: red;">Logout</a>
	<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
	<h2>
		Welcome<%=bean.getName()%></h2>

	<fieldset>
		<legend>Search Employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="pid"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
		ProductBean retailerBean = (ProductBean) request.getAttribute("bean");
	%>

	<%
		if (retailerBean != null) {
	%>

	<table>
		<tr>
			<th>Name</th>
		</tr>

		<tr>
			<td><%=retailerBean.getPname()%></td>
		</tr>
	</table>

	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>