package optimise;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		boolean condition=true;
		StudentOperation sop=new StudentOperation();
		
		while (condition) {
			System.out.println("1- Add Student");
			System.out.println("2- View Students");
			System.out.println("3- Update Student");
			System.out.println("4- Delete Student");
			System.out.println("5- Login Student");
			System.out.println("6- Exit");
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter Student Name :");
				String name=sc.next();
				System.out.println("Enter Student Address :");
				String add=sc.next();
				System.out.println("Enter Student Email :");
				String email=sc.next();
				System.out.println("Enter Student Pass :");
				String pass=sc.next();
				
				Student std=new Student();
				std.setName(name);
				std.setAdd(add);
				std.setEmail(email);
				std.setPass(pass);
				
				int res1=sop.addStudent(std);
				
				if(res1>0) {
					System.out.println("Student added Successfully!");
				}else {
					System.out.println("Failed to add!");
				}
				break;
			}
			case 2: {
				List<Student> list=sop.viewStudent();
				for (Student student : list) {
					System.out.println(student);
				}
				break;
			}
			case 3: {
				System.out.println("Enter Student Id :");
				int id=sc.nextInt();
				
				System.out.println("Enter Student Name :");
				String newName=sc.next();
				
				System.out.println("Enter Student Address :");
				String newAdd=sc.next();
				System.out.println("Enter Student Email :");
				String newemail=sc.next();
				System.out.println("Enter Student Pass :");
				String newpass=sc.next();
				
				Student std=new Student();
				std.setName(newName);
				std.setAdd(newAdd);
				std.setEmail(newemail);
				std.setPass(newpass);
				std.setStdId(id);
				
				int res2=sop.updateStudent(std);

				if(res2>0) {
					System.out.println("Student Updated Successfully!");
				}else {
					System.out.println("Failed to Update!");
				}
				break;
			}
			case 4: {
				System.out.println("Enter Student Id :");
				int id=sc.nextInt();
				int res3=sop.deleteStudent(id);

				if(res3>0) {
					System.out.println("Student Deleted Successfully!");
				}else {
					System.out.println("Failed to Delete!");
				}
				break;
			}
			case 5: {
				System.out.println("Enter Student Eamil :");
				String email=sc.nextLine();
				
				System.out.println("Enter Student Pass :");
				String pass=sc.nextLine();
				
				int res4=sop.login(email, pass);
				if (res4>0) {
					System.out.println("Login SuccessFull!");
				} else {
					System.out.println("Invalid Credential!");
				}
				
				break;
			}
			case 6: {
				condition=false;
				break;
			}
			default:
				System.out.println("Invalid Choice!");
			}
		}

	}

}
