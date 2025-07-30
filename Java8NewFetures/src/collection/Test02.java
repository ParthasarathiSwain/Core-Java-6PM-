package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;  //ctrl+Shift+o

public class Test02 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Subha","Lohit","Prth");
		
		//normal for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("----------");
		//for each
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("----------");
		Iterator<String> it=names.iterator();
		//Returns an iterator over the elements in this list in proper sequence
		
		while(it.hasNext()) {
		//hasNext()=Returns true if the iteration has more elements
			String name=it.next();
			System.out.println(name);
		}
	}
}
















