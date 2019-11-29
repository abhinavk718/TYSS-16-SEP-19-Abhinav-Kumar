<!DOCTYPE html>
<%@page import="java.util.Date"%>
<%!
public void jspInit()
{
	System.out.println("this is init phase");
}
%>

<%!
public void jspDestroy()
{
	System.out.println("this is destroy phase");
}
%>
<html>
<head>
<%
  
Date date=new Date();
m();

%>
<%!
  public int i=10;
   public void m(){
	   System.out.println(i);
   }
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1 style="color:green;">Date and Time is : <%=date%></h1>
    <h3><%=i %></h3>
</body>
</html>