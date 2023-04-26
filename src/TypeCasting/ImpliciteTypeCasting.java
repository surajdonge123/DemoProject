package TypeCasting;

public class ImpliciteTypeCasting {

//	converting one type of datatype into another is called Typecasting.
	
//	Implicite type casting is the typecasting which is done by compiler itself.
	
//	widening Casting(Automatically) Byte>short>int>char>long>float>double
	
	public static void example1() {
		int a=10+20;
		System.out.println(a);
		double d=a;
		System.out.println(d);
	}
	public static void example2() {
		String s="suraj";
		System.out.println(s);
		Object o=s;
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		
		example1();
		example2();
			}
	
}
