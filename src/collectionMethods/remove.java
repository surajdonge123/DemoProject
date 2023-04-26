package collectionMethods;

import java.util.ArrayList;
import java.util.Collection;


public class remove extends booleanAdd{
	
	public static void main(String[] args) {
		
		Collection c=new ArrayList();
		c.add(123);
		c.add(321);
		c.add("suraj");
		c.add("donge");
		
		System.out.println(c);
		
		c.remove(123);
		System.out.println(c);
		
		
		
		
		
		
	}
	

}
