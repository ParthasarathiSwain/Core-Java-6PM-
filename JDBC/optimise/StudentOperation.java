package optimise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import StudentCRUD.DbConnection;

public class StudentOperation {
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String query=null;
	private int status=0;

	public  int addStudent(Student std) throws SQLException {
		try {
			con=DbConnection.getCon();
			query="insert into student(stdname,stdadd,email,pass) values(?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1,std.getName());
			ps.setString(2,std.getAdd());
			ps.setString(3,std.getEmail());
			ps.setString(4,std.getPass());
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ps.close();
			con.close();
		}
		return status;
	}

	//view
	public  List<Student> viewStudent() throws SQLException{
		List<Student>  listStd=new ArrayList<>();
		try {
			con=DbConnection.getCon();
			query="select stdid,stdname,stdadd,email,pass from student";
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while (rs.next()) {
			   	Student s=new Student();
			   	s.setStdId(rs.getInt(1));
			   	s.setName(rs.getString(2));
			   	s.setAdd(rs.getString(3));
			   	s.setEmail(rs.getString(4));
			   	s.setPass(rs.getString(5));
			   	listStd.add(s);
			   	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ps.close(); rs.close();con.close();
		}
		return listStd;
	}

	
	
	public  int updateStudent(Student std) throws SQLException {
		int status=0;
		try {
			con=DbConnection.getCon();
			query="update student set stdname=?,stdadd=? ,email=?,pass=? where stdid=?";
			ps=con.prepareStatement(query);
			ps.setString(1,std.getName());
			ps.setString(2,std.getAdd());
			ps.setString(3,std.getEmail());
			ps.setString(4,std.getPass());
			ps.setInt(5, std.getStdId());
			status=ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ps.close(); con.close();
		}
		return status;
	}
	//delete
	public  int deleteStudent(int id) throws SQLException{
		int status=0;
		try {
			con=DbConnection.getCon();
			query="Delete from student where stdid=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ps.close(); con.close();
		}
		return status;
	}

	//login
	public  int login(String email,String pass) throws SQLException {
		int status=0;
		try {
			con=DbConnection.getCon();
			query="select count(*) from student where email=? and pass=?";
			ps=con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			while (rs.next()) {
				status=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ps.close(); rs.close();con.close();
		}
		return status;
	}


}
