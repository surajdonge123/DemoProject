package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class demo1 {
//	The Underlying data structure for arraylist Resizable Array OR growable Array.
//	Duplicates Objects are allowed
//	insertion order is preserved.
//	Hetergeneous objects are allowed
//	null insertion is possible

//	But ArrayList is Worst Choice if Our Frequent Operation is Insertion OR Deletion in the
//	Middle. Because it required Several Shift Operations Internally.

// Creates an empty Arraylist objects with default capacity is 10.

//	IF arraylist reaches its max capacity then new arraylist object will be created with
//	new capacity=(current capacity*3/2)+1

	public static void arraylistdemo() {
		ArrayList al = new ArrayList();
//		default capacity=10
		al.add("abc");
		al.add(123);
		al.add(456);
		al.add(null);
		al.add(0);

		System.out.println(al);

	}

	public static void arraylistdemo2() {
		ArrayList al1 = new ArrayList();
//		after fulfil its length its capacity become 16 (via formula)
		al1.add("1suraj");
		al1.add(123);
		al1.add("12suraj");
		al1.add(1234);
		al1.add(3455);
		al1.add(66);
		al1.add("1suraj");
		al1.add(123);
		al1.add("12suraj");
		al1.add(1234);
		al1.add(3455);
		al1.add(66);

		System.out.println(al1);

	}

	public static void arraylistdemo3() {
//		Creates an Empty ArrayList Object with specified Initial Capacity.

		ArrayList al = new ArrayList(12);
		al.add("1suraj");
		al.add(123);
		al.add("12suraj");
		al.add(1234);
		al.add(3455);
		al.add(66);
		al.add("1suraj");
		al.add(123);
		al.add("12suraj");
		al.add(1234);
		al.add(3455);
		al.add(66);
		al.add(1212);
	}

	public static void arraylistdemo4() {
       
		Set hs=new HashSet();
		hs.add("abc");
		hs.add(123);
		hs.add(456);
		hs.add(null);
		hs.add(0);
		ArrayList al=new ArrayList(hs);
		System.out.println(al);

	}

	public static void main(String[] args) {
//	    arraylistdemo();
//		arraylistdemo2();
//		arraylistdemo3();
		arraylistdemo4();
	}
}
