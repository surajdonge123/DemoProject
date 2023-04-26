package collectionMethods;

import java.util.ArrayList;
import java.util.Collection;

public class contains {

	
	public static void withoutcontains() {
		Collection d= new ArrayList();
		  d.add(4);
		  d.add(4545);
		  d.add("donge");
	      d.add("suraj");
	      
	  	  System.out.println(d.contains(4));
	  	  System.out.println(d);
		  
	}
	public static void contains() {
		Collection f= new ArrayList();
		  f.add(4);
		  f.add(4545);
		  f.add("donge");
	      f.add("suraj");
	      
	  	  System.out.println(f.contains(5));
	  	  System.out.println(f);
		
	}
	
	public static void containsall() {
		
		Collection f= new ArrayList();
		  f.add(4);
		  f.add(4545);
		  f.add("donge");
	      f.add("suraj");
	      
	  	  System.out.println(f.contains(5));
//	  	  System.out.println(f);
	  	  Collection a=new ArrayList<>();
	  	  
	  	  a.add(1220);
	  	  a.add(45);
//	  	  System.out.println(a);
	  	  a.addAll(f);
	  	  System.out.println(a.containsAll(f));
	  	  System.out.println(a);
	  	  
		
	
		
	}
	
	public static void main(String[] args) {
//		withoutcontains();
//		contains();
		containsall();
	}
}
