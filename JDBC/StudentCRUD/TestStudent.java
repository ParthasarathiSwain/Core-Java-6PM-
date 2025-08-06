package StudentCRUD;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean condition=true;

		while (condition) {
			System.out.println("1- Add Student");
			System.out.println("2- View Students");
			System.out.println("3- Update Student");
			System.out.println("4- Delete Student");
			System.out.println("5- Exit");
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter Student Name :");
				String name=sc.next();
				System.out.println("Enter Student Address :");
				String add=sc.next();

				int res1=StudentOperation.addStudent(name, add);
				if(res1>0) {
					System.out.println("Student added Successfully!");
				}else {
					System.out.println("Failed to add!");
				}
				break;
			}
			case 2: {
				StudentOperation.viewStudent();
				break;
			}
			case 3: {
				System.out.println("Enter Student Id :");
				int id=sc.nextInt();
				
				System.out.println("Enter Student Name :");
				String newName=sc.next();
				
				System.out.println("Enter Student Address :");
				String newAdd=sc.next();
				
				int res2=StudentOperation.updateStudent(id, newName, newAdd);

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
				int res3=StudentOperation.deleteStudent(id);

				if(res3>0) {
					System.out.println("Student Deleted Successfully!");
				}else {
					System.out.println("Failed to Delete!");
				}
				break;
			}
			case 5: {
				condition=false;
				break;
			}
			default:
				System.out.println("Invalid Choice!");
			}
		}

	}
}
