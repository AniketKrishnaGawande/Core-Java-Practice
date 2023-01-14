package composition.innerClass.example1;

public class Outer {

	private int out=3; // outer data type
	private Inner inner; // Inner class reference bcoz of outer HAS-A Inner

	public void outShow() // outer non static method
	{
		System.out.println("outer show");
		System.out.println(out); // outer data member
		inner = new Inner(); // instantiating inner reference
		// without instantiating inner cannot access inner member as Outer HAS-A Inner
		System.out.println(inner); // calling toString of inner
	
	}

	public String toString() {
		System.out.println("Outer to string");
		return "Outer :: " + out;

	}
	// cannot access inner class members directly need to create instance.

	
	
	
	
	public class Inner // inner class
	{
		private int in = 7; // inner class object
		public static final int a = 8; // static final allowed

		public void inShow() // inner class non static method
		{
			System.out.println("inner show");
			System.out.println(in);
		}

		public String toString() {
			System.out.println("inner to string");
			return "Inner :: " + in + " Outer :: " + out; // can access outer class members directly
			// becoz outer's members can be accessed by anyone inside outer class
		}

	}

}
