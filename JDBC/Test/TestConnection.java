package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/jdbc6pm";
		String username="TURGUT";
		String pass="TURGUT";
		Connection con=null;
		
		try {
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish connection
			con=DriverManager.getConnection(url,username,pass);
			String query ="create table student(stdid int primary key auto_increment,stdname varchar(100),stdAdd varchar(100))";
			
			Statement st=con.createStatement();
			boolean res=st.execute(query);
			
			if (res) {
				System.out.println("Table Not created");
			} else {
				System.out.println("Table create successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		if (con==null) {
//			System.out.println("Connection failed");
//		} else {
//			System.out.println("connection successfull");
//		}
	}
}
