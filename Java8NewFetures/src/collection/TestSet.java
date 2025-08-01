package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Set interface
 * 1-> it is a sub-interface of  Collection Interface
 * 2-> java.util.Set
 * 3-> No duplicate element allowed
 * 4-> it maintain only unique element
 * 5-> Popular implementation class
 *     -HashSet  : Unordered,fast
 *     -LinkedHashSet :Maintained insertion order
 *     -TreeSet : Sorted order
 * */

public class TestSet {
	 public static void main(String[] args) {
		System.out.println("---HashSet---");
		Set<String> names=new HashSet<>();
		names.add("Lohit");
		names.add("Prth");
		names.add("Iti");
		names.add("Subha");
		names.add("Subha");
		
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("---LinkedHashSet---");
		
		LinkedHashSet<String> names2=new LinkedHashSet<>();
		names2.add("Lohit");
		names2.add("Prth");
		names2.add("Iti");
		names2.add("Subha");
		names2.add("Subha");
		
		for (String name : names2) {
			System.out.println(name);
		}
		
		System.out.println("---TreeSet---");
		
		TreeSet<String> names3=new TreeSet<>();
		names3.add("Lohit");
		names3.add("Prth");
		names3.add("Iti");
		names3.add("Anil");
		names3.add("Subha");
		
		for (String name : names3) {
			System.out.println(name);
		}
	}
}
















