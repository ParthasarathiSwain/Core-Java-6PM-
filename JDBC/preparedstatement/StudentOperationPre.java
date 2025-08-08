package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import StudentCRUD.DbConnection;

public class StudentOperationPre {
	//insert
	public static int addStudent(String name,String add,String email,String pass) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="insert into student(stdname,stdadd,email,pass) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,add);
			ps.setString(3,email);
			ps.setString(4,pass);
			
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
	//view
	public static void viewStudent() {
		try {
			Connection con=DbConnection.getCon();
			String query="select stdid,stdname,stdadd,email,pass from student";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println("Student Id    : "+rs.getInt("stdid"));
				System.out.println("Student Name  : "+rs.getString("stdname"));
				System.out.println("Student Add   : "+rs.getString("stdadd"));
				System.out.println("Student Email : "+rs.getString("email"));
				System.out.println("Student Pass  : "+rs.getString("pass"));
				System.out.println("-------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//update
	public static int updateStudent(int id,String name,String add,String email,String pass) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="update student set stdname=?,stdadd=? ,email=?,pass=? where stdid=?";

			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,add);
			ps.setString(3,email);
			ps.setString(4,pass);
			ps.setInt(5, id);
			
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	//delete
	public static int deleteStudent(int id) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="Delete from student where stdid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	//login
	public static int login(String email,String pass) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="select count(*) from student where email=? and pass=?";
			System.out.println(query);
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				status=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	
}





















