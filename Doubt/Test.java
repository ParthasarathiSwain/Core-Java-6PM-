package Doubt;

public class Test {
	public static void main(String[] args) {
		StudentOperation so=new StudentOperation();
//		so.printStudent("subha", "WW12", "BBSR");
		
		Student s1=new Student();//empty object
		s1.setName("Subha");
		s1.setRoll("TR12");
		s1.setAdd("BBSR");
		
		
		so.printStudent(s1);
	}
}
