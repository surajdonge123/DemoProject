package versionEnhancement;

import java.util.TreeSet;

public class navigableset {

	//it is a child interface of Sortedset
	
	public static void main(String[] args) {
		TreeSet<Integer> n=new TreeSet<Integer>();
		n.add(100);
		n.add(200);
		n.add(500);
		n.add(400);
		n.add(500);
		n.add(600);
		n.add(700);
		System.out.println(n);
		System.out.println(n.ceiling(200));//200
		System.out.println(n.floor(200));//**200
		System.out.println(n.higher(500));//600
		System.out.println(n.lower(400));//**200
		System.out.println(n.pollFirst());//remove 1st element
		System.out.println(n.pollLast());//remove last element
		System.out.println(n.descendingSet());
		System.out.println(n);
		
		
		
		
	}
	
}
