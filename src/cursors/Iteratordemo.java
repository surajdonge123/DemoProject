package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Iteratordemo {

/*	 Iterator:
	 We can Use Iterator to get Objects One by One from Collection.
	 We can Apply Iterator Concept for any Collection Object. Hence it is Universal Cursor.
	 By using Iterator we can Able to Perform Both Read and Remove Operations.
	 We can Create Iterator Object by using iterator() of Collection Interface.

		 
		 ***Methods***
			  public boolean ***hasNext();***
			  public Object ***next();***
			  public void ***remove();*** */

	public static void demo1() {
		LinkedList l = new LinkedList();
		l.add(1234);
		l.add(3455);
		l.add(66);
		l.add(1234);
		l.add(3455);
		l.add(66);

		System.out.println(l);
		Iterator iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void demo2() {
		ArrayList l = new ArrayList();
		l.add(1234);
		l.add(3455);
		l.add(66);
		l.add(1234);
		l.add(3455);
		l.add(66);
		System.out.println(l);
		Iterator iterator = l.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			if(next.equals(3455)) {
				iterator.remove();
			}
		}
		System.out.println(l);
	}

	public static void main(String[] args) {
//		demo1();
		demo2();
	}
//	 By using Enumeration and Iterator we can Move Only towards Forward Direction and we
//	can’t Move Backward Direction. That is these are Single Direction Cursors but Not unidirectional.
//	 By using Iterator we can Perform Only Read and Remove Operations and we can't Perform
//	Addition of New Objects and Replacing Existing Objects.
//	To Overcome these Limitations we should go for ListIterator.

}
