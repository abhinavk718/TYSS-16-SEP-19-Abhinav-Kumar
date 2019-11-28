package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExecuteUpdateQueryDynamically
{
	public static void main(String[] args)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		final String SQL="update employee_info set name=? where id=?";
		final String URL="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		try
		{
			//step 1 Load and register the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 Get the connection
			conn=DriverManager.getConnection(URL);
			
			//step 3 create statement and issue sql query
			pstmt=conn.prepareStatement(SQL);
			int id=Integer.parseInt(args[0]);
			pstmt.setInt(2, id);
			
			String name=args[1];
			pstmt.setString(1, name);
			
			int count=pstmt.executeUpdate();
			//step 4 Read executed sql query
			if(count>0)
			{
				System.out.println(count+" Row's Updated Successfully");
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
				else if (pstmt!=null)
				{
					pstmt.close();
		        }
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}//end of finally block
	}//end of main() method
}//end of ExecuteUpdateQueryDynamically
