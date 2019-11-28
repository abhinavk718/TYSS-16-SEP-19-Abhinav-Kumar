package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery
{
	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement stmt=null;
		final String URL="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		final String SQL="update employee_info set name='Mokesh' where id=20";
		try 
		{
			//step 1 Load and register the Driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 Get the connection
			conn=DriverManager.getConnection(URL);
			
			//Step 3 Create statement and issue sql query
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(SQL);
			
			//Step 4 Read the executed sql query
			if(count>0)
			{
				System.out.println(count+" Row's Updated Successfully.");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			//Step 5 close all jdbc resources
			try 
			{
				if (conn!=null)
				{
					conn.close();
					
				}
				else if(stmt!=null)
				{
					stmt.close();
				}
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}//end of finally block
	}//end of main() method
}//end of ExecuteUpdateQuery
