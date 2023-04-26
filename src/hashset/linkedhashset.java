package hashset;

import java.util.LinkedHashSet;

public class linkedhashset {
public static void main(String[] args) {
	

	LinkedHashSet lh=new LinkedHashSet<>();
	lh.add(1211);
	lh.add(1211);
	lh.add("suraj");
	lh.add(454);
	lh.add(454);
	lh.add(null);
	lh.add(456);
	lh.add(null);
	
/*only the differance between Hashset and linkedhashset is
 * the underlying data structure is a combination of linkedlist and hashset
 * hashset introduce in1.4v and hashset introduse in 1.2version
 * Insertion order is preserved
 */
//	[1211, suraj, 454, null, 456]
	
	System.out.println(lh);
	
	
	
}	
}
