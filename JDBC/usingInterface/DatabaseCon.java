package usingInterface;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseCon {
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc6pm","TURGUT","TURGUT");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
