package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.bo.BookBO;

public class BookSearchDAO  implements BookSearch {
	private static final String  GET_BOOKS_BY_QUERY="SELECT BKID,BOOKNAME,AUTHOR,STATUS,CATEGORY FROM BOOK_STORE WHERE CATEGORY=? ORDER BY BOOKNAME";
	
	private Connection getPooledConnection() throws Exception{
	DataSource ds=null;
	Connection con=null;
	InitialContext ic=null;
	ic=new InitialContext();
	ds=(DataSource) ic.lookup("java:comp/env/dsjndi");
	con=ds.getConnection();
	return con;
	}
	@Override
	public List<BookBO> find(String category)throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			
			List<BookBO> listBO=null;
			BookBO bo=null;
			con=getPooledConnection();
			ps=con.prepareStatement(GET_BOOKS_BY_QUERY);
			ps.setString(1,category);
			rs=ps.executeQuery();
			listBO=new ArrayList<BookBO>();
			while(rs.next()) {
				//copy record for RS to BO class Object
				bo=new BookBO();
				bo.setBkid(rs.getInt(1));
				bo.setBookname(rs.getString(2));
				bo.setAuthor(rs.getString(3));
				bo.setStatus(rs.getString(4));
				bo.setCategory(rs.getString(5));
				//add BookBO objects to ListBO
				listBO.add(bo);
			}//while
			
			return listBO;
		}//try
		catch(SQLException e) {
			e.printStackTrace();
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();			}
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();			}
		}
		
	}//find()
	
}//class
