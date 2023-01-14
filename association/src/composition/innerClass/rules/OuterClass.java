package composition.innerClass.rules;


public class OuterClass {
	// can outer class contains non static data members: yes
	private int out = 3;

	// can outer class contains static data members: yes
	private static int statout = 3;

	// can outer class directly access members of inner class: no
	// need to create instance of inner class then can access.

	// can outer class contains non static methods : Yes
	public void normalOut() // non static method
	{
		System.out.println("inside non static outer method");

		// need to create instance of inner class to access its members? yes
		// How to create instance of inner class in non static method?
		// non static method associated with instance of outer class hence directly
		// create instance of inner class
		InnerClass in = new InnerClass(); // isntance of inner class
		// can you access private members of inner class using its instance: yes
		in.inner = 8; // inner private data member
		in.innerMethod(); // inner method

		// how to access static final data member of inner class? directly by inner
		// class name
		// no need to create inner class instance
		System.out.println(InnerClass.staticIn);
	}

	// can outer class contains static method : yes
	public static void staticOut() {
		System.out.println("inside outer static method");
		// need to create instance of inner class to access its members
		// how to create instance of inner class in static outer method?
		// create instance of outer class then using that create instance of inner class
		// becoz static methods are not associated with instance of outer class hence
		// need to create instance of outer class here
		// way 1
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		// then we can access any non static non final member of inner class using its
		// reference
		in.inner = 8; // inner private data member
		in.innerMethod(); // inner method

		// how to access static final data member of inner class? directly by inner
		// class name
		// no need to create inner class instance
		System.out.println(InnerClass.staticIn);
	}

	public class InnerClass // inner class
	{
		// inner class contains non static members : yes
		private int inner = 6;

		// inner class contains static members : no
		// private static int statinner = 6; javac error

		// inner class contains static final data member: yes
		private static final int staticIn = 8;

		// inner class contains non static methods:yes
		public void innerMethod() {

			inner = 9; // inner class data member

			// can inner class (static non static) access private members of outer class
			// directly: yes
			out = 10; // outer class data member, OuterClass.this.out=10
			statout = 10; // outer static data member
			normalOut(); // outer non static method, OuterClass.this.noramlOut(){}
			staticOut(); // outer static method
		}

		// inner class contains static method : no
		// public static void statInner() {} javac error

	}

}
