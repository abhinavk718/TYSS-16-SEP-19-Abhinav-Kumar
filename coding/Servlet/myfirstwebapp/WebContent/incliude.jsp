<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@include file="/index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Include JSP</title>
</head>
<body>
   <h1>This is Include jsp</h1>
   <jsp:include page="/first"></jsp:include>
</body>
</html>