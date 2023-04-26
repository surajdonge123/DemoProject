package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationdemo {

//	 If we want to get Objects One by One from the Collection then we should go for Cursors.
//	 We can Use Enumeration to get Objects One by One from the Collection.
//	  We can Create Enumeration Object by using elements().
	
//	Methods:
//		1) public boolean ***hasMoreElements();***
//		2) public Object ***nextElement();***
	
//	Limitations of Enumeration:
//		Enumeration Concept is Applicable Only for Legacy Classes and it is Not a Universal
//		Cursor.
//	    By using Enumeration we can Perform Read Operation and we can't Perform Remove
//		Operation.
//		To Overcome Above Limitations we should go for Iterator.

	
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(66);
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		System.out.println(v1);
		Enumeration Enumeration = v1.elements();
		
		while(Enumeration.hasMoreElements()) {
			Object nextElement = Enumeration.nextElement();
			System.out.println(nextElement);
			
		}
		
		
	}
	
	
	
	
	
}
