package Treeset;

import java.util.TreeSet;

public class demo1 {
 public static void main(String[] args) {
	/* The underlying data structure is balanced tree
	 * insertion order is not preserved & it is based on some sorting order
	 * Heterogeneous object are not allowed.
	 * if we are trying to insert we will get rumtime exception  saying
	 * classcastexception
	 * duplicates object are not allowed.
	 * null insertion is possible(only ones)
	 * implements serilizable & clonable interface but not 
	 * RandomAccess interface
	 */
	 
	 
/*	 **Constructor**
*/
	 TreeSet ts=new TreeSet<>();
	 /*Creates an empty set object where all elementws will be Insertes according to
	  * default natural sorting orders
	  */
	 /*TreeSet t1=new TreeSet(comparator c);
	 Creates an empty set object where all elementws will be Insertes according to
	  customized sorting order which is described  by Comparator Object
	  
	  Treeset t2=new Treeset(collection c);
	  Treeset t3=new treeset(sortedset s);	  
	  */
	 
		TreeSet ttt = new TreeSet();
		ttt.add(new StringBuffer("A"));
		ttt.add(new StringBuffer("Z"));
		ttt.add(new StringBuffer("L"));
		ttt.add(new StringBuffer("B"));
		
		System.out.println(ttt);
	 
}}
