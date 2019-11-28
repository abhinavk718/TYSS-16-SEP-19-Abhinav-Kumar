package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteSelectQuery
{
	public static void main(String[] args)
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			//step 1 Load and Register the Driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 Get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);
			
			//step 3 create the connection and issue Sql Query
			String sql="select * from employee_info";
			stmt=conn.createStatement();
			
			rs=stmt.executeQuery(sql);
			//step 5 Read the executed sql query
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int salary=rs.getInt("sal");
				String gender=rs.getString("gender");
				System.out.println("Id is : "+id);
				System.out.println("Name is : "+name);
				System.out.println("Salay is : "+salary);
				System.out.println("Gender is : "+gender);
				System.out.println("**********************************");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			//Step 5 end of all jdbc resources
			try
			{
            	if (conn!=null)
            	{
					conn.close();
				}
                else if (stmt!=null)
                {
                      stmt.close();
				}
            	rs.close();	
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}//end of finally block
	}//end of main() method
}//end of ExecuteSelectQuery
