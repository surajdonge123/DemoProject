package collectionMethods;

import java.util.ArrayList;
import java.util.Collection;

public class BooleanAddAll {
	
	public static void main(String[] args) {
		Collection al=new ArrayList() ;
			
		al.add(122121);
		System.out.println(al.add("suraj"));
		al.add(322);
		al.add(525);
		System.out.println(al.add("donge"));
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		
		System.out.println(al2.add(1212));
		al2.add("12suraj");
		al2.add(1212.1212);
		al2.addAll(al);
		System.out.println(al2);
		}
	}
	
	 


