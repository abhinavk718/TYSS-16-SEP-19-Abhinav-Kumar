package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery 
{
	public static void main(String[] args)
	{
		Connection conn=null;
		Statement stmt=null;
		final String  URL="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";;
		final String sql="insert into employee_info values(20,'Kanahaiya',90000,'M')";
		try 
		{
			//step 1 Load and Register the driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 Get the connection
			conn=DriverManager.getConnection(URL);
			
			//step 3 create the statement and issue sql query
			stmt=conn.createStatement();
			
			int count=stmt.executeUpdate(sql);
			//step 4 Read the executed Query
			if(count>0) 
			{
				System.out.println(count+" Row's Inserted Successfully.");
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
				else
					stmt.close();
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}//end of finally block
	}//end of main() method
}//end of ExecuteInsertQuery
