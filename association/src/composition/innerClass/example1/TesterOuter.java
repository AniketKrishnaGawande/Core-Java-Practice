package composition.innerClass.example1;

public class TesterOuter {

	public static void main(String[] args) {
		
		// creating instance of Outer class
		Outer out = new Outer(); // outer class instance
		out.outShow(); // outer method
		System.out.println(out);

		// Inner in = new Inner();
		// javac error as cannot instantiate inner class directly need to create
		// instance of outer class
		
		
		// way1 - creating inner class instance
		Outer.Inner in = out.new Inner(); // Outer class and out instance of Outer class
		// inner dont have existence along it has existence with outer class
		in.inShow(); // inner method called
	
		// way2 - creating inner class instance
		Outer.Inner in2 = new Outer().new Inner();
		// creating outer instance 1st then inner instance
	    in2.inShow();
	}

}
