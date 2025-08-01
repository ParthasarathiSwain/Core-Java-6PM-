package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet2 {
	public static void main(String[] args) {
//		LinkedHashSet<String> collNames=new LinkedHashSet<>();
//		collNames.add("Lohit");
//		collNames.add("Prth");
//		collNames.add("Iti");
//		collNames.add("Subha");
		
		Set<String> names=new LinkedHashSet<>();
		names.add("Lohit");
		names.add("Prth");
		names.add("Iti");
		names.add("Subha");
		
		System.out.println(names);
		
		Object[]  array=names.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
  		System.out.println(array);
		//addAll();
		//names.addAll(collNames);

		//printing set collection
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("------------");
		//remove()
		System.out.println(names.remove("Iti"));
		
		//printing set collection
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("------------");
		System.out.println("Contains() :"+names.contains("Prthaaaaa"));
		System.out.println("------------");
		System.out.println("size() : "+names.size());
		
		
	}
}
















