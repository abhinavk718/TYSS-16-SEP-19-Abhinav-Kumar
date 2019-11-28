package myjdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteUpdateProperties 
{
	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement stmt=null;
		FileReader reader=null;
		try
		{
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			//Step 1 Load and Register the Driver
			String driver=prop.getProperty("driver-class-name");
			Class.forName(driver);
			
			//Step 2 get the connection
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url);
			
			//Step 3 Create  statement and issue sql query
			String sql="update employee_info set name='Lovely',gender='F' where id=21";
			stmt=conn.createStatement();
			
			int count=stmt.executeUpdate(sql);
			//Step 4 Read the executed sql Query
			if(count>0)
			{
				System.out.println(count+" Rows updated Successfully.");
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
				if(conn!=null)
				{
					conn.close();
				}
				else if(stmt!=null)
				{
					stmt.close();
				}
				else if(reader!=null)
				{
					reader.close();
				}
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}//end of finally block
	}//end of main() method
}//end of ExecuteUpdateProperties
