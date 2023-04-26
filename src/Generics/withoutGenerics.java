package Generics;

import java.util.ArrayList;

public class withoutGenerics {

	/*It provides typesafety
	 * if we use generics then there is no use of typecasting
	 */
	public static void withoutgen() {	
		ArrayList as=new ArrayList();

		as.add(100);
		as.add(101);
		as.add(103);
		as.add(104);
		as.add("suraj");
		as.add("donge");
		
		Integer o=(Integer)as.get(0);
		System.out.println(o);
		
		String s=(String)as.get(4);
		System.out.println(s);
		
		
	}
	 
	public static void withgeneric() {	
		ArrayList<Object> as=new ArrayList();

		as.add(100);
		as.add(101);
		as.add(103);
		as.add(104);
		as.add("suraj");
		as.add("donge");
		
		Object Integer=as.get(0);
		System.out.println(Integer);
		
		System.out.println(Integer);
}
public static void main(String[] args) {
	withoutgen();
	withgeneric();
	
}	
}

