package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExecuteInsertQueryDynamically
{
	public static void main(String[] args) 
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		final String URL="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	    final String SQL="insert into employee_info values(?,?,?,?)";
	    try
	    {
	    	//step 1 Load and register the Driver
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	    	//step 2Get the connection
	    	conn=DriverManager.getConnection(URL);
	    	
	    	//step 3 create statement and Issue sql query
			pstmt=conn.prepareStatement(SQL);
			int id=Integer.parseInt(args[0]);
			pstmt.setInt(1, id);
			
			String name=args[1];
			pstmt.setString(2, name);
			
			String salary=args[2];
			pstmt.setString(3, salary);
			
			String gender=args[3];
			pstmt.setString(4, gender);
			
			int count=pstmt.executeUpdate();
			//step 4 Read the executed Query
			if(count>0)
			{
				System.out.println(count+" Rows Inserted Successfully.");
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
	    		else if (pstmt!=null)
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
}//end of ExecuteInsertQueryDynamically
