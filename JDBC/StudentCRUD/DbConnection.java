package StudentCRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getCon() {
		
		String url="jdbc:mysql://localhost:3306/jdbc6pm";
		String username="TURGUT";
		String pass="TURGUT";
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
