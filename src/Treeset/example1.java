package Treeset;

import java.util.TreeSet;

public class example1 {

	static void t1() {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
      //t.add(10);
	//	t.add(null);
		System.out.println(t);// [A, B, L, Z, a]
	}
	static void t2() {
		TreeSet tt = new TreeSet();
		tt.add(null);
		
		

	}
	private static void t3() {
		TreeSet ttt = new TreeSet();
		ttt.add(new StringBuffer("A"));
		ttt.add(new StringBuffer("Z"));
		ttt.add(new StringBuffer("L"));
		ttt.add(new StringBuffer("B"));
		
		System.out.println(ttt);
	}

	public static void compareTo() {
		TreeSet m=new TreeSet<>();
		m.add("k");
		m.add("l");//l.compareTo("k");
		m.add("a");
		m.add("z");
		System.out.println(m);//[a, k, l, z]
		
	}
	public static void main(String[] args) {
	//	t1();
//		t2();
//		t3();
		compareTo();
		
		
	}
}
