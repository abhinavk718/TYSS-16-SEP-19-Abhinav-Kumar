package myjdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class ExecuteDeletePropertyDynamically
{
	public static void main(String[] args)
	{
		Connection conn=null;
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
			String sql=prop.getProperty("delete-query");
			pstmt=conn.prepareStatement(sql);
			
			int id=Integer.parseInt(args[0]);
			pstmt.setInt(1, id);
			
			int count=pstmt.executeUpdate();
			//step 4 read executed sql query
			if(count>0)
			{
				System.out.println(count+" Rows Deleted Successfully.");
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
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
	}//end of main() method
}//end of ExecuteSelectPropertyDynamically
