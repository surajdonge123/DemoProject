package TypeCasting;

import Treeset.example1;

public class ExpliciteTypeCasting {

	// explicite typecasting: programmer is responsible to rxplicite typecasting
//	(mannually) narrowing casting..  double>float>long>int>char>short>byte
	
	public static void example() {
	
		double d=10.676;
		System.out.println(d);
		int i=(int)d;
		System.out.println(i);
		
	}
	public static void example1() {
		Object o="suraj";
		System.out.println(o);
		
		String s=(String)o;
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		example();
		example1();
		
	}
	
	
	
	
	
}
