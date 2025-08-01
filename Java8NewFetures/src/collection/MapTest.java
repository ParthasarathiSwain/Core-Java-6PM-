package collection;

import java.util.HashMap;

/*Map Interface
 * The Map interface is part of collection framework, not Collection Interface
 * it represent key-value pair
 * Rule:
 *    1->Each key should be unique
 *    2->Each key maps exactly one value
 *    
 * implementation class
 * --------------------
 * 		->HashMap : Unordered,fast
 * 		->LinkedHashMap : Maintained insertion order
 * 		->TreeMap		: Sorted order
 * 		->Hashtable		: Threadsafe
 *    
 * 
 */
public class MapTest {
	public static void main(String[] args) {
		//HashMap<DT K, DT V>;
		HashMap<String,String> names=new HashMap<>();
		names.put("name1", "Prtha");
		names.put("name2", "Iti");
		names.put("name3", "Lohit");
		names.put("name4", "Subha");
		
		System.out.println(names);
		
		//System.out.println(names.get("name3"));
		System.out.println(names.remove("name3"));
		System.out.println(names);
	}
}










