package collectionMethods;

import java.util.ArrayList;
import java.util.Collection;

public class isempty {

	public static void nonempty() {
		
	
		Collection d= new ArrayList();
		d.add(1212);
		d.add(4545);
		d.add("suraj");
		
		
		System.out.println(d.isEmpty());

}
	public static void empty() {
		Collection f= new ArrayList();

		System.out.println(f.isEmpty());
		
		
	}
	
public static void main(String[] args) {
	nonempty();
	empty();
}
}