package generic_class.post_generic.downCasting;

import java.util.Date;

public class Pre_gen_HolderTester {

	public static void main(String[] args) {
		// Create holder class instance to hold int value of 12345
		Pre_gen_Holder h1 = new Pre_gen_Holder(12345);// auto boxing (int -->Integer) , up casting

		int data = (Integer) h1.getRef();// prog : down casting , javac : auto un boxing
		// h1.getRef() is returning object type of data so we need to tell javac that it
		// have Integer value so downcasting required

		System.out.println(h1.getClass());// post_generic.downCasting.Holder

		System.out.println(h1.getRef().getClass());// java.lang.Integer
         // as h1.getRef() giving Integer type of data
		
		// Create holder class instance to hold curnt date
		Pre_gen_Holder h2 = new Pre_gen_Holder(new Date());// Date--> Object : up casting

		System.out.println(h2.getClass());// post_generic.downCasting.Holder

		System.out.println(h2.getRef().getClass());// java.util.Date

		Date curntDate = (Date) h2.getRef();

		h1 = h2;

		data = (Integer) h1.getRef(); // classcast exception date cannot be //cast to Integer
// as Date is not a Integer
	// in case of generic javac gives error
	}}