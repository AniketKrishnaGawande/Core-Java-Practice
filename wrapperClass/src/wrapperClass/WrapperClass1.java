package wrapperClass;

public class WrapperClass1 {

	public static void main(String[] args) {
		// boxing = convert primitive int to non primitive Integer
		
		// way 1 --> dont use as ctor of wrappers are depricated
		Integer wrap1 = new Integer(12345); // boxing as int -->Integer
		System.out.println(wrap1);
		Integer wrap2 = new Integer("12345"); // boxing String -->Integer
		System.out.println(wrap2);
		
		// way 2 recommended to use
		int a=3;
		Integer wrap3=Integer.valueOf(a); // int --> Integer
		System.out.println(wrap3);
		
		
		// unboxing non primitive to primitive
		Integer wrap4=Integer.valueOf(25);
		int data = wrap4.intValue(); // unboxing: wrapper Integer --> primitive int
		System.out.println(data);
		
		
		// auto boxing 
		Integer wrap5=100; // javac implictly add integer.valueOf() here
		//convert int --> Integer
		System.out.println(wrap5);
		
		// auto unboxing
		int num= wrap5; // javac implictly add wrap5.values()
		// converts Integer to int
		System.out.println(num);
		// wrap5 is reference
		wrap5++;// auto unboxing(int tmp=wrap5.intValue()) --> inc tmp ++ ---> auto boxing
		// (wrap5=Integer.valueOf(tmp))
		System.out.println(wrap5);
		
		//Double dou = wrap5;//javac error as 1st auto unboxing --> is Integer is Double(wrapper class)?? no so cannot do implictly 
		Double dou = (double)wrap5; // explicitly possible
		System.out.println(dou);
		
		Number n;
		n=50; // auto boxing int --> Integer(wrapper) then upcasting as Number n= new Integer();
		System.out.println(n.getClass()); // o/p = java.lang.Integer
	n=50.0; // double to Double(wrapper) then upcasting Number n = new Double()
	System.out.println(n.getClass()); // o/p Double
	n= 80.0f; // float --> Float(wrapper) then upcasting
	}

}
