package Examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1forEach {
public static void main(String[] args) {
	
	ex2foreachloop emp=new ex2foreachloop();
	emp.setEmpid(100);
	emp.setEmpname("suraj");
	emp.setEmpaddress("SambhajiNagar");
	emp.setEmpdept("mechanical");
	
	ex2foreachloop emp1=new ex2foreachloop();
	emp1.setEmpid(101);
	emp1.setEmpname("Abcd");
	emp1.setEmpaddress("AhmedNagar");
	emp1.setEmpdept("Electrical");
	
	ex2foreachloop emp2=new ex2foreachloop();
	emp2.setEmpid(102);
	emp2.setEmpname("wxyz");
	emp2.setEmpaddress("shriNagar");
	emp2.setEmpdept("civil");
	
	ArrayList<ex2foreachloop> al=new ArrayList<>();
	al.add(emp);
	al.add(emp1);
	al.add(emp2);
	
	Iterator<ex2foreachloop> iterator = al.iterator();
	
	while(iterator.hasNext()) {
		ex2foreachloop next = iterator.next();
		System.out.println(next);
	}
	System.out.println("iterating by for each loop");
	for(ex2foreachloop e:al) {
		System.out.println(e);
	
	}
	}}
