package covariance;

public class Covariance1 {

	public class A {

		public A show() {
			System.out.println("in A");
			return new A();
		}
	} // end of A

	public class B extends A {
		@Override
		public B show() // because of covariance return type can be chnged to B as class B extends A ie
						// B is subtype of A
		{
			System.out.println("in B");
			return new B();
		}

	}

}
