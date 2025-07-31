package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Subha");
		s1.setRoll("101AB");
		s1.setAddress("BBSR");
		
		Student s2=new Student();
		s2.setName("ITI");
		s2.setRoll("102AB");
		s2.setAddress("CHN");
		
		Student s3=new Student();
		s3.setName("Lohit");
		s3.setRoll("103AB");
		s3.setAddress("CTC");
		
		Student s4=new Student();
		s4.setName("Ram");
		s4.setRoll("104AB");
		s4.setAddress("BDK");
		
		Student s5=new Student();
		s5.setName("Hari");
		s5.setRoll("105AB");
		s5.setAddress("Mjh");
		
		Student s6=new Student();
		s6.setName("Anish");
		s6.setRoll("106AB");
		s6.setAddress("JKR");
		
		//StudentOperation.picnic(s1,s2,s3,s4); //not best for development
		
		//ArrayList<Student>  stdList=new ArrayList<Student>();
		
		
		List<Student>  stdList=new ArrayList<Student>();
		
		System.out.println(stdList.isEmpty());
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		stdList.add(s5);
		stdList.add(s6);
		System.out.println(stdList.isEmpty());
		
		StudentOperation.picnic(stdList);
		
		
		
        Stack<String> stack = new Stack<>();
        
        
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println(stack);

	}
}
