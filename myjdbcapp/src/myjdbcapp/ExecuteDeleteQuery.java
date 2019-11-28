package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery 
{

	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement stmt=null;
		final String URL="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		final String SQL="delete from employee_info where id=20";
		try 
		{
			//step 1 Load and Registerthe driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 Get the connection
			conn=DriverManager.getConnection(URL);
					
			//step 3 Create statement and issue sql Query
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(SQL);
			
			//Read the executed sql query
			if(count>0)
			{
				System.out.println(count+" Row's deleted successfully.");
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
}//end of ExecuteDeleteQuery
