package vector;

import java.util.ArrayList;
import java.util.Vector;

public class demo2 {
	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(101);
		al.add(101);
		al.add("suraj");
		al.add(102);
		
		Vector v = new Vector(al);
		
		System.out.println(v);
	}
}

