package com.tyss.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String empId=req.getParameter("text");
		String driverClass="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ust_ty_db";
		
		PreparedStatement pstmt=null;
		Connection conn=null;
		ResultSet rs=null;
		PrintWriter out=resp.getWriter();
		
		try 
		{
			Class.forName(driverClass);
			conn=DriverManager.getConnection(url,"root","root");
			
			pstmt=conn.prepareStatement("select * from employee_info where id=?");
			pstmt.setString(1, empId);
			rs=pstmt.executeQuery();
			
			out.println("<table>");
			out.println("<thead>");
			out.println("<th> id </th>");
			out.println("<th> name </th>");
			out.println("<th> sal </th>");
			out.println("<th> gender </th>");
			out.println("</thead>");
			out.println("</table>");
			
			while(rs.next())
			{
				out.println("<tbody>");
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt(1));
				
				out.println(rs.getString(2));
				
				out.println(rs.getInt(3));
				
				out.println(rs.getString(4));
				
				out.println("<td>");
				out.println("</tr>");
				out.println("</tbody>");	
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();	
		}
		finally 
		{
			try 
			{
				if(conn!=null)
				{
					conn.close();
				}
				else if(pstmt!=null)
				{
					pstmt.close();
				}
				else
				{
					rs.close();
				}
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}
}
