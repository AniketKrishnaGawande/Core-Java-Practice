package generic_class.pre_generic;

public class TestPreGeneric {

	public static void main(String[] args) {
		
		PreGeneric gen = new PreGeneric(1234); // can hold Integer data
		System.out.println(gen.getItr());
		
		/*
		 * PreGeneric gen = new PreGeneric("abc"); // cannot hold other than Integer
		 * data System.out.println(gen.getItr());
		 */
		  
		
		// limitation
		//1.  need to create different class to accept data other than Integer type 
	}

}
