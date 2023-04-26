package Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class comparator {
/* it is present in java.util.pckg
 * This interface contain 2 methods
 * 1.compare()
 * 2.equals()
 * 
 * If we are not satisfied with the default natural sorting orders then we can 
 * define our on sorting orders by using comparator object
 * 
 */
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new mycomaparator());
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(60);
		t.add(70);
		
		System.out.println(t);
		
		
	}
	
	
	
	
	
	
}
class mycomaparator implements Comparator{


	public int compare(Object o1, Object o2) {
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
		
	}}
	

	
	
	

