<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
"<link rel='stylesheet' href='./Bootstrap/bootstrap-4.3.1-dist/css/bootstrap.min.css'>"
</head>
<%
String id = "";
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("alwaysRembember")) {
			id = cookie.getValue();
		}
	}
}
%>
<body>
    <form action='./login' class='col-md-4 offset-4 mt-5 mb-5 card card-body' method='post'>
    <h1 class='text-center' style='background-color: gray;'>Login Form</h1>"
    <div class='formgroup'>
    ID : <input type='number' name='id' value='<%=id %>' class='form-control mb-1' placeholder='Enter User-Id....'>
    </div>
    <br>
    <div class='formgroup'>
    Password : <input type='password' name='password' class='form-control mb-1' placeholder='Enter Password....'>
    </div>
    <br>
    <div class='formgroup'>
    Remember Me<input type='checkbox' value='checked' name='rememberme'>
    </div>
    <div class='formgroup'>
     <button type='submit' class='btn btn-primary float-right mb-1' >Login</button>
     <button type='reset' class='btn btn-primary float-right mb-1' >Reset</button>
     </div>
     <br><br>
     <a href='./register.html'> Register</a>
     </form>
</body>
</html>