package versionEnhancement;

import java.util.TreeMap;

public class navigiblemap {
	// It is child interface of sorted map
	public static void main(String[] args) {
		TreeMap<Integer, String> t=new TreeMap<Integer,String>();
		t.put(1, "Apple");
		t.put(2, "Banana");
		t.put(3, "orange");
		t.put(4, "grapes");
		t.put(5, "strawberry");
		t.put(6, "pineapple");
		t.put(7, "berries");
		System.out.println(t);
		
		System.out.println(t.ceilingKey(3));
		System.out.println(t.higherKey(4));
		System.out.println(t.floorKey(5));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
		
		
		
		
		
		
		
	}

}
