package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test03 {
	public static void main(String[] args) {
	//	Collection,List (parent interface)
	// ArrayList,LinkedList,Vector,Stack(child class)
		
		Collection<String>  names=new ArrayList<>();//empty Collection
		
		System.out.println(names.size());
		
		names.add("Subha");
		names.add("Lohit");
		names.add("Prth");
		names.add("iti");
		
		System.out.println(names.size());
		System.out.println(names.contains("Lohit"));
		System.out.println(names.remove("Prth"));
		System.out.println(names.size());
		names.clear();
		System.out.println(names.size());
	}
}
