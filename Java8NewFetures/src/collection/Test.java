package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("OTZ");
		list.add("OTZ");
		list.add("OTZ");
		list.add("OTZ");
		list.add("OTZ");
		list.add("OTZ");
		list.add(89);
		list.add(new Test());
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		list.remove(2);
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("-----------------");
		
		Set s=new HashSet();
		s.add("OTZ");
		s.add("OTZzz");
		s.add("OTZ");
		s.add("OTZ");
		for (Object object : s) {
			System.out.println(object);
		}
		
		
		
	}
}
