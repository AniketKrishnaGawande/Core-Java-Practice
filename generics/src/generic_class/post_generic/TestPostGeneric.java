package generic_class.post_generic;

public class TestPostGeneric {

	public static void main(String[] args) {

		PostGeneric<Integer> genInt = new PostGeneric<Integer>(1234);
		// will replace T by Integer everywhere in PostGeneric program
		//PostGeneric<Integer> genInt = new PostGeneric<>(1234); this is also allowed
		
		System.out.println(genInt.getItr());
		// will give Integer data

		PostGeneric<String> genStr = new PostGeneric<String>("abc"); // can hold any data
		// just need to replace generic ie <T> by type of data we want to give
		System.out.println(genStr.getItr());
		// will give String data

		
		// limitation
		// 1. we can use only reference type with generic ie <T>
	//PostGeneric<int> gen3= new PostGeneric<>(12);
		// javac error cannot give primitive data type
	
	}}
