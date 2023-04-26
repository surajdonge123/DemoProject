package linklist;

import java.util.HashSet;
import java.util.LinkedList;

public class demolinklist {

//	 The Underlying Data Structure is Double LinkedList.
//	 Implements Serializable and Cloneable Interfaces but Not RandomAccessInterface.
//	 Best Choice if Our Frequent Operation is Insertion OR Deletion in the Middle.
//	 Worst Choice if Our Frequent Operation is Retrieval.
	public static void demo1() {

		LinkedList l = new LinkedList();

		l.add("1suraj");
		l.add(null);// null Insertion is Possible.
		l.add("12suraj");
		l.add(1234);
		l.add(3455);
		l.add(66);
		l.add("1suraj");// Heterogeneous Objects are allowed.
		l.add(123);
		l.add("12suraj");// Duplicate Objects are allowed.
		l.add(1234);
		l.add(3455);
		l.add(66);
		System.out.println(l);//// Insertion Order is Preserved.
	}

	public static void demo2() {

		HashSet hs = new HashSet();
		hs.add(78);
		hs.add(89);
		hs.add(99);
		hs.add(98);

		LinkedList l = new LinkedList(hs);

		System.out.println(l);
	}

	public static void demo3() {
		LinkedList l = new LinkedList();

		
		
	}
	public static void main(String[] args) {
		demo1();
//		demo2();
//		demo3();
	}
}
