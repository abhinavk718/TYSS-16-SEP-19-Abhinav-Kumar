package com.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("alwaysRembember")) {
					id = cookie.getValue();
				}
			}
		}
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='./Bootstrap/bootstrap-4.3.1-dist/css/bootstrap.min.css'>");
		out.println("</head>");

		out.println("<form action='./login' class='col-md-4 offset-4 mt-5 mb-5 card card-body' method='post'>");
		out.println("<h1 class='text-center' style='background-color: gray;'>Login Form</h1>");
		out.println("<div class='formgroup'>");
		out.println("ID : <input type='number' name='id' value='" + id+ "' class='form-control mb-1' placeholder='Enter User-Id....'>");
		out.println("</div>");
		out.println("<br>");
		out.println("<div class='formgroup'>");
		out.println("Password : <input type='password' name='password' class='form-control mb-1' placeholder='Enter Password....'>");
		out.println("</div>");
		out.println("<br>");
		out.println("<div class='formgroup'>");
		out.println("Remember Me<input type='checkbox' value='checked' name='rememberme'>");
		out.println(" </div>");
		out.println(" <div class='formgroup'>");
		out.println(" <button type='submit' class='btn btn-primary float-right mb-1' >Login</button>");
		out.println("<button type='reset' class='btn btn-primary float-right mb-1' >Reset</button>");
		out.println(" </div>");
		out.println("<br><br>");
		out.println("<a href='./register.html'> Register</a>");
		out.println("</form>");
		out.println("</html>");
		
	}// end of doGet() method
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		doGet(req,resp);
		
	}
}// end of LoginPageServlet
