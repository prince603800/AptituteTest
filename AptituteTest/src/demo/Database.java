package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	public static Connection conn(){
	Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	} 
	public static int save(Bean b){
		int status = 0;
		try{
		Connection con =Database.conn();
		PreparedStatement ps = con.prepareStatement("insert into student_info(name, institution, email, password)values(?,?,?,?)");
		ps.setString(1,b.getName());
		ps.setString(2, b.getInstitution());
		ps.setString(3, b.getEmail());
		ps.setString(4,b.getPassword());
		   status = ps.executeUpdate();
		 con.close();
	    }catch(Exception e){
		System.out.println(e);}
	    return status ; 
	}
	public static int login(String email, String password){
		int status=0;
		Connection con = conn();
		try {
			PreparedStatement ps = con.prepareStatement("select *from student_info where email = ?");
			ps.setString(1, email);
			//ps.setString(2, password);
			//ps.setString(2, b.getPassword());
		    status = ps.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	public static String loadPage(int i){
		String j= "";
		Connection con = Database.conn();
		try {
			PreparedStatement ps = con.prepareStatement("select *from page_table where index = ?");
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			rs.next();
			j = rs.getString(2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return j;
	}
}


