<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
<a href="./logout">Logout</a>
<fieldset>
<legend>Update Password</legend>
<form action="./updateprofile">
<table>
<tr>
<td>Name :</td>
<td><input type="text" name="name">
</tr>
<tr>
<td>Password :</td>
<td><input type="password" name="password">
</tr>
<tr>
<td>Gender :</td>
<td><input type="text" name="gender">
</tr>
<tr>
<td>DOJ :</td>
<td><input type="Date" name="date">
</tr>
<tr>
<td><input type="submit" value ="UpdatePassword">
</tr>
</table>
</form>
</fieldset>
</body>
</html>