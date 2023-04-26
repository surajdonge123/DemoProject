package BasicOfcollection;
//collection is a group of object as a single entity
import java.util.ArrayList;
import java.util.Collection;

public class demo1 {
	
	
	
	
	
	
	
	
	
	

	private static void a1() {
//		too  much memory used
		int a=10;
		int e=20;
		int d=30;
		int c=40;
		int b=50;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("a1 end");
	}
//	array
	public static void a2() {
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int a:arr) {
			System.out.println(a);
			
		}
		System.out.println("a2 end ");
		
	}
	
//	there is memory wasteage in array operation
	protected static void a3() {
		int arr[]=new int[5];
		arr[0]=100;
		arr[1]=120;
		arr[2]=1022;
		arr[3]=1055;
		for (int a:arr) {
			System.out.println(a);
			
		}
		System.out.println("a3 end");
		
		
	}
	
//	there is also memory short problem.
//	and We cant store heterogenious elements.
	
	public static void a4() {
		int arr[]=new int[5];
		
		arr[0]=106;
		arr[1]=105;
		arr[2]=104;
		arr[3]=103;
		arr[4]=101;
		arr[5]=1;
		
		for(int s:arr) {
			System.out.println(s);
		}
		
		
	}
	
//		To overcome all the problem collection come in picture
		public static void collection() {
			
			ArrayList al=new ArrayList();
			al.add(42);
			al.add(121);
			al.add(10.2);
			al.add("suraj");
			
			System.out.println(al);
			
			
			
		}
	public static void main(String[] args) {
		a1();
		a2();
		a3();
		a4();
		collection();
		
		Collection al=new ArrayList();
		al.add(12);
		al.add("asdfsa");
		al.add("askdjjf");
		al.add(121212);
		System.out.println(al);
	}
	
	
}
