package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ExecuteSelectQueryDynamically 
{
	public static void main(String[] args)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try 
		{
			//step 1 Load and register the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 Get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);
			
			//step 3 create statement and issue sql Query
			String sql="select * from employee_info where id=?";
			pstmt=conn.prepareStatement(sql);
			int id=Integer.parseInt(args[0]);
			pstmt.setInt(1,id);
			rs=pstmt.executeQuery();
			
			//step 4 Read the executed SQL Query
			if(rs.next())
			{
				int emp_id=rs.getInt("id");
				String name=rs.getString("name");
				int salary=rs.getInt("sal");
				String gender=rs.getString("gender");
				System.out.println("Id is : "+emp_id);
				System.out.println("Name is : "+name);
				System.out.println("Salary is : "+salary);
				System.out.println("Gender is : "+gender);	
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			//step 5 close all jdbc resources
			try
			{
				if (conn!=null)
				{
					conn.close();
				}
				else if(pstmt!=null)
				{
					pstmt.close();
				}
				else if(rs!=null)
				{
					rs.close();
				}
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}//end of finally block
	}//end of main() method
}//end of ExecuteSelectQueryDynamically
