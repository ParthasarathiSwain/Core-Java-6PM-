package StudentCRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentOperation {
	//insert
	public static int addStudent(String name,String add) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="insert into student(stdname,stdadd) values('"+name+"','"+add+"')";
			Statement st=con.createStatement();
			status =st.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
	//view
	public static void viewStudent() {
		try {
			Connection con=DbConnection.getCon();
			String query="select stdid,stdname,stdadd from student";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while (rs.next()) {
				System.out.println("Student Id  : "+rs.getInt("stdid"));
				System.out.println("Student Name: "+rs.getString("stdname"));
				System.out.println("Student Add : "+rs.getString("stdadd"));
				System.out.println("-------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//update
	public static int updateStudent(int id,String name,String add) {
		int status=0;
		try {
			Connection con=DbConnection.getCon();
			String query="update student set stdname='"+name+"'  ,stdadd='"+add+"' where stdid="+id;
			Statement st=con.createStatement();
			status=st.executeUpdate(query);
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
			String query="Delete from student where stdid="+id;
			Statement st=con.createStatement();
			status=st.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}





















