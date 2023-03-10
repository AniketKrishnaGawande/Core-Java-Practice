package generic_class.post_generic.downCasting;

import java.util.Date;



public class Post_gen_HolderTester {

	public static void main(String[] args) {
		// Create holder class instance to hold int value of 12345
		Post_gen_Holder<Integer> h1=new Post_gen_Holder<>(12345);//auto boxing (int ----> Integer)
		int data=h1.getRef();//no expl down casting is required!
		// Create holder class instance to hold curnt date
		Post_gen_Holder<Date> h2=new Post_gen_Holder<>(new Date());//no impl conversion by javac
		Date curntDate=h2.getRef();
		
		
		
		
	//h1=h2;//uncomment this line to understand : javac detects type mismatch err !
		//Why Generics : To supply run time type info (RTTI) to the compiler : which avoids explicit down
		//casting n ensures no type mismatch run time errs
	
		
				

	}

}
