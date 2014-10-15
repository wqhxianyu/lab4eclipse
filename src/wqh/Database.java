package wqh;

import java.util.ArrayList;
import java.util.List;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import wqh.DBConnection;
import wqh.Book;
import wqh.Author;

public class Database {
	private static Connection con; 
	private static PreparedStatement stmt;
	private static ResultSet rs;
	
	public static ArrayList<Book> showAllInfo(String authorid){
		
		ArrayList<Book> bookinfo = new ArrayList<Book>();
		try{
			con=DBConnection.getConnection();
			stmt=con.prepareStatement("select * from book where authorid= '"+authorid+"'");
			rs=stmt.executeQuery();
			while(rs.next()){
				Book book = new Book();
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setAuthorid(rs.getString("authorid"));
				book.setPublishdate(rs.getString("publishdate"));
				book.setPrice(rs.getString("price"));
				book.setPublisher(rs.getString("publisher"));
				bookinfo.add(book);
			}
		}catch(SQLException e){
			bookinfo=null;
		}if(rs!=null){
			try{
    			rs.close();
    			}catch(SQLException e){}
		}
		DBConnection.Close(con, stmt);
		return bookinfo;
	}
	
	public static boolean addInfo(Book book){
		
	    boolean flag=false;
	    try{
	    	con=DBConnection.getConnection();
			stmt=con.prepareStatement("insert into book "+"values(?,?,?,?,?,?)");
			stmt.setString(1,book.getIsbn());
			stmt.setString(2,book.getTitle());
			stmt.setString(3,book.getAuthorid());
			stmt.setString(4,book.getPublishdate());
			stmt.setString(5,book.getPrice());
			stmt.setString(6,book.getPublisher());
            if(stmt.executeUpdate()==1)flag=true;
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		DBConnection.Close(con, stmt);
		return flag;
    }
	
	public static Book QueryInfo(String title){
		Book book = new Book();
	    ResultSet rs=null;
	    try{
			con=DBConnection.getConnection();
			stmt=con.prepareStatement("select * from book where title= '"+title+"'");
			rs=stmt.executeQuery();
			while(rs.next()){
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setAuthorid(rs.getString("authorid"));
				book.setPublishdate(rs.getString("publishdate"));
				book.setPrice(rs.getString("price"));
				book.setPublisher(rs.getString("publisher"));
			}
		}catch(SQLException e){
			book=null;
		}if(rs!=null){
			try{
    			rs.close();
    			}catch(SQLException e){}
		}
		DBConnection.Close(con, stmt);
		return book;
	}

	
////////
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List QueryBooks(String authorid){
		List list=new ArrayList();
	    ResultSet rs=null;
	    try{
			con=DBConnection.getConnection();
			stmt=con.prepareStatement("select * from book where authorid= '"+authorid+"'");
			rs=stmt.executeQuery();
			while(rs.next()){
				Book book = new Book();
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setAuthorid(rs.getString("authorid"));
				book.setPublishdate(rs.getString("publishdate"));
				book.setPrice(rs.getString("price"));
				book.setPublisher(rs.getString("publisher"));
				list.add(book);
			}
		}catch(SQLException e){
			list=null;
		}if(rs!=null){
			try{
    			rs.close();
    			}catch(SQLException e){}
		}
		DBConnection.Close(con, stmt);
		return list;
	}
	
	
	///////////////
	
	
	
	public static Author QueryName(String name){
		Author bookname = new Author();
	    ResultSet rs=null;
	    try{
			con=DBConnection.getConnection();
			stmt=con.prepareStatement("select * from author where name= '"+name+"'");
			rs=stmt.executeQuery();
			while(rs.next()){
				bookname.setAuthorid(rs.getString("authorid"));
				bookname.setName(rs.getString("name"));
				bookname.setAge(rs.getString("age"));
				bookname.setCountry(rs.getString("country"));
			}
		}catch(SQLException e){
			bookname=null;
		}if(rs!=null){
			try{
    			rs.close();
    			}catch(SQLException e){}
		}
		DBConnection.Close(con, stmt);
		return bookname;
	}
	
	public static boolean deleteInfo(String title){
		boolean flag=false;
		try{
	    	con=DBConnection.getConnection();
			stmt=con.prepareStatement("delete from book where title ='"+title+"'");
            if(stmt.executeUpdate()==1)flag=true;
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		DBConnection.Close(con, stmt);
		return flag;
	}
}
