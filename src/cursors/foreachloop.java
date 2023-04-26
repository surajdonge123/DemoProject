package cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class foreachloop {

	public static void integer() {

		ArrayList<Integer> al = new ArrayList();
		al.add(1212);
		al.add(789);
		al.add(456);
		al.add(321);
		al.add(654);
		System.out.println("Iterating via for each loop");
		for (Integer i : al) {
			System.out.println(i);
		}
	}

	public static void object() {

		Vector<Object> v = new Vector();
		v.add(1212);
		v.add(789);
		v.add(456);
		v.add(321);
		v.add(654);
		System.out.println("Iterating via for each loop");
		for (Object o : v) {
			System.out.println(o);
		}
	}

	public static void withoutobject() {
		LinkedList ll = new LinkedList();
		ll.add(1212);
		ll.add(789);
		ll.add(456);
		ll.add(321);
		ll.add(654);
		System.out.println("Iterating via for each loop");
		for (Object o : ll) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		integer();
		object();
		withoutobject();
	}
}
