<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
    <legend>Register</legend>
<form action="./register" method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name">
</tr>
<tr>
<td>Email :</td>
<td><input type="email" name="email">
</tr>
<tr>
<td>Password :</td>
<td><input type="password" name="password">
</tr>
<tr>
<td>DOJ :</td>
<td><input type="date" name="doj">
</tr>
<tr>
<td>Gender :</td>
<td>
<select name="gender" required="required">
<option>------------select---------</option>
<option value="M">Male</option>
<option value="F">Female</option>
</select>
</td>
</tr>
<tr>
<td><input type="reset" value="Reset"></td>
<td><input type="submit" value ="Submit">
</tr>
</table>
</form>
</fieldset>
<a href="./login">Click here to Login</a>
</body>
</html>