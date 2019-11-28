package myjdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteSelectProperty 
{
	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		FileReader reader=null;
		try
		{
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			//step 1 Load and Register the Driver
			String driver=prop.getProperty("driver-class-name");
			Class.forName(driver);
			
			//step 2 Get the connection
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url);
			
			//step 3 create statement and issue sql query
			stmt=conn.createStatement();
			String sql=prop.getProperty("select-query");
			rs=stmt.executeQuery(sql);
			
			//step 4 Read the executed sql query
			while(rs.next())
			{
				System.out.println("ID is : "+rs.getInt("id"));
				System.out.println("Name is : "+rs.getString("name"));
				System.out.println("Salary is : "+rs.getInt("sal"));
				System.out.println("Gender is : "+rs.getString("gender"));
				System.out.println("*********************************");
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
				else if(rs!=null)
				{
					rs.close();
				}
				else
					reader.close();
				
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}//end of finally block
	}//end of main() method 
}//end of ExecuteSelectProperty 