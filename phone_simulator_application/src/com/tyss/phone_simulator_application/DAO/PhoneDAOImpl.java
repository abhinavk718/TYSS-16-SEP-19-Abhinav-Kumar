package com.tyss.phone_simulator_application.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.phone_simulator_application.employeeDTO.ContactBean;
import com.tyss.phone_simulator_application.phoneapp.PhoneApp;

public  class PhoneDAOImpl implements PhoneDAO
{
	public List<ContactBean> showAllContacts()
	{
		String url="jdbc:mysql://localhost:3306/contact_file?password=root&user=root";
		String sql="select * from contact";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try 
		{
			
			//step 1 Load and register the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 Get connection
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			ArrayList<ContactBean> result=new ArrayList<ContactBean>();
			while(rs.next())
			{
				ContactBean bean=new ContactBean();
				String name=rs.getString("name");
				bean.setName(name);
				int number=rs.getInt("number");
				bean.setNumber(number);
				String group=rs.getString("group_name");
				bean.setGroup_Name(group);
				
				result.add(bean);
			}
			return result;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
				if(rs!=null)
				{
					rs.close();
				}	
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
	}//end of showAllContacts()	
	public ContactBean searchContactByName(String name)
	{
		String url="jdbc:mysql://localhost:3306/contact_file?password=root&user=root";
		String sql="select * from contact where name=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				ContactBean bean=new ContactBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroup_Name(rs.getString("group_name"));
				return bean;
			}
			else
			{
				return null;
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try 
			{
				if(conn!=null)
				{
				    conn.close();
				}
				if(pstmt!=null)
				{
				    pstmt.close();
				}
				if(rs!=null)
				{
				    rs.close();
				}
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
	}//end of searchContactByName(String name)
	@Override
	public int add(ContactBean bean) 
	{
		String url="jdbc:mysql://localhost:3306/contact_file?password=root&user=root";
		String sql="insert into  contact values(?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			conn=DriverManager.getConnection(url);
			
			pstmt=conn.prepareStatement(sql);
			
			String name=bean.getName();
			pstmt.setString(1, name);
			
			int number=bean.getNumber();
			pstmt.setInt(2, number);
			
			String group=bean.getGroup_Name();
			pstmt.setString(3, group);
			
			int count=pstmt.executeUpdate();
			
			return count;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			//Step - 5 Close all jdbc Objects
			try
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();	
			}
		}
		
	}
	@Override
	public int delete(String name) 
	{
		String url="jdbc:mysql://localhost:3306/contact_file?password=root&user=root";
		String sql="delete from  contact where name=?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		try 
		{
			//Step 1 Load and Register Driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step -2 Get Connection
			conn=DriverManager.getConnection(url);
			
			//step 3 Issue SQLquery
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			int count=pstmt.executeUpdate();
			return count;
				
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			//Step 5 Close all jdbc Object 
			try 
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}	
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}
		
	}
	@Override
	public int update(ContactBean bean) 
	{
		String url="jdbc:mysql://localhost:3306/contact_file?password=root&user=root";
		String sql="update contact set number=?,group_name=? where name=?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		try 
		{
			//Step 1 Load and Register Driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step -2 Get Connection
			conn=DriverManager.getConnection(url);
			
			//step 3 Issue SQLquery
			
			pstmt=conn.prepareStatement(sql);
			
			String name=bean.getName();
			pstmt.setString(3, name);
			
			int number=bean.getNumber();
			pstmt.setInt(1, number);
			
			String groupname=bean.getGroup_Name();
			pstmt.setString(2, groupname);
				
			
			
			int count=pstmt.executeUpdate();
			return count;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			//Step 5 Close all jdbc Object 
			try 
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}	
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}
		
	}
	@Override
	public void mainmanu()
	{
		PhoneApp app=new PhoneApp();
		app.main(null);
		
	}
}//end of PhoneDAOImpl