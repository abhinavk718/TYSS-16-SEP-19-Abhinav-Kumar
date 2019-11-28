package myjdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteInsertProperties 
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
			
			//Step 2 Get the Connection
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url);
			
			//Step 3 create statement and issue sql query
			stmt=conn.createStatement();
			String sql="insert into employee_info values(21,'Kishan',8521456,'M')";
			int count=stmt.executeUpdate(sql);
			
			//step 4 read the executed sql query
			if(count>0)
			{
				System.out.println(count+" Rows Inserted Successfully.");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}//end of catch block
		finally
		{
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
}//end of ExecuteInsertProperties 
