package vector;

import java.util.Vector;

public class methods {

	public static void add() {
		Vector v = new Vector();
		v.add(101);// collection method
		v.addElement(101);// vector method
		System.out.println(v);

	}

	public static void remove() {

		Vector v1 = new Vector();
		v1.add(66);
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		v1.add(3455);
		Integer valueof = new Integer(66);
		v1.remove(valueof);
		// v1.remove(1234);
		v1.removeElement(3455);
		System.out.println(v1);

	}

	public static void removespecific() {
		Vector v1 = new Vector();
		v1.add(66);
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		v1.add(3455);

		v1.remove(1);
		v1.removeElementAt(2);
		System.out.println(v1);
	}

	public static void removeall() {

		Vector v1 = new Vector();
		v1.add(66);
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		v1.add(3455);
		// v1.clear();//collection method
		v1.removeAllElements();// vector method
		System.out.println(v1);
	}
	public static void retrival() {
		Vector v = new Vector();
		v.add(3455);
		v.add(66);
		v.add("1suraj");
		v.add(123);
		v.add("12suraj");
		v.add(1234);
		v.add(3455);
		v.add(66);
		v.add("hi");
		System.out.println(v);
		System.out.println(v.get(5));//collection method
		System.out.println(v.elementAt(6));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
	}

	public static void main(String[] args) {
//		add();
//		remove();
//		removespecific();
//		removeall();
		retrival();
	}
}
