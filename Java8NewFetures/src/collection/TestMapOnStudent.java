package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMapOnStudent {
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
		
		
		Map<String ,Student>   listOfStd=new LinkedHashMap<>();
		listOfStd.put("std1", s1);
		listOfStd.put("std2", s2);
		listOfStd.put("std3", s3);
		
		System.out.println(listOfStd);
	}
}
