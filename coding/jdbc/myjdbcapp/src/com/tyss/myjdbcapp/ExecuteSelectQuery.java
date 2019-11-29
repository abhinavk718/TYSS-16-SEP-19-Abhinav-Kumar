package com.tyss.myjdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteSelectQuery
{
	public static void main(String[] args) 
	{
		Connection conn=null;
	    Statement stmt=null;
	    ResultSet rs=null;
	    try 
	    { 
	    	//step 1 Load and Register the driver
	    	d
			
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
	    		else if(stmt!=null)
				{
					stmt.close();
				}
				rs.close();
			}
	    	catch (Exception e2) 
	    	{
				e2.printStackTrace();
			}
		}//end of finally blick
	}//end of main() method
}//end of ExecuteSelectQuery
