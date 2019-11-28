package myjdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class ExecuteSelectPropertyDynamically
{
	public static void main(String[] args)
	{
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		try(FileReader reader=new FileReader("db.properties");) 
		{
			Properties prop=new Properties();
			prop.load(reader);
			
			//Step 1 Load and Register the Driver
			String driver=prop.getProperty("driver-class-name");
			Class.forName(driver);
			
			//Step 2 Get the connection
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url);
			
			//Step 3 create statement and issue sql Query
			String sql="select * from employee_info where id=?";
			pstmt=conn.prepareStatement(sql);
			
			int id=Integer.parseInt(args[0]);
			pstmt.setInt(1, id);
			
			rs=pstmt.executeQuery();
			//step 4 read executed sql query
			if(rs.next())
			{
				System.out.println("ID is : "+rs.getInt("id"));
				System.out.println("Name is :"+rs.getString("name"));
				System.out.println("Salary is : "+rs.getInt("sal"));
				System.out.println("Gender is : "+rs.getString("gender"));
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
}//end of ExecuteSelectPropertyDynamically