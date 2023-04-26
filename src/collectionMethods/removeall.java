package collectionMethods;

import java.util.ArrayList;
import java.util.Collection;

public class removeall {
	
	public static void main (String[]args) {
	 
		  Collection ab=new ArrayList();
		  ab.add(123);
		  ab.add("suraj");
		  ab.add(52);
		  System.out.println(ab);
		  
		  Collection c=new ArrayList();
		  
		  c.add(4);
		  c.add(4545);
		  c.add("donge");
		  c.addAll(ab);
		  System.out.println(c);
		  
		  System.out.println(c.removeAll(c));
		  
		  c.removeAll(c);
		  System.out.println(c);
		  
 }

}
