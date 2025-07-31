package collection;

import java.util.List;

public class StudentOperation {
	
	/*public static void picnic(Student s1,Student s2,Student s3,Student s4) {
		
	}*/
	
	public static void picnic(List<Student>   stdList) {
		//System.out.println(stdList);
		
		/*for (Student student : stdList) {
			System.out.println(student);
		}*/
		
		for (int i = 0; i < stdList.size(); i++) {
			Student std=stdList.get(i);
			System.out.println(std);
		}
	}
}
