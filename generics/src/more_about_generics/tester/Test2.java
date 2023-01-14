package more_about_generics.tester;

import java.util.ArrayList;

import more_about_generics.com.app.org.Emp;
import more_about_generics.com.app.org.Manager;
import more_about_generics.com.app.org.Worker;

public class Test2 {

	public static void main(String[] args) {
		Emp e=new Manager("mgr1");//up casting
		ArrayList<Emp> emps=new ArrayList<>();
		ArrayList<Manager> mgrs=new ArrayList<>();
	//	emps=mgrs;//Even though Mgr IS-A Emp , List<Emp> IS NOT a super type of the List<Mgr>
		Object o=new Worker("w1");//up casting
		ArrayList<Object> objs=new ArrayList<>();
	//	objs=mgrs;//error
		ArrayList<?> list=new ArrayList<>();
		list=emps;
		list=mgrs;
		
		
		
		

	}

}
