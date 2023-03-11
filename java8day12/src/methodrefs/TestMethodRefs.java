package methodrefs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.List.*;
import java.util.Optional;

interface Formula //need implementation
{
	public void m1();
}
class Some{
	public static void m2() //need a object to access
	{
		System.out.println("from m2....");
	}
}

class Other{
	 Other() //need a object to access
	{
		System.out.println("from other constructor");
	}
	 void m2() {
		 System.out.println("from m2()");
	 }
}


public class TestMethodRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Formula f=Some::m2;	//::method reference in java 8// method m2 refernec is passed to interface
 f=Other::new;//constructor method reference like this we are passing to interface
	f.m1();
	List<String> list=Arrays.asList("one","two","three");
	list.stream().forEach(System.out::println);//instaneous method reference
	List<Integer> intlist=Arrays.asList(12,23,90);
	Optional<Integer> num=intlist.stream().reduce(Math::max);//static method refernce
	System.out.println(num.get());
	
	
	
	
	
	
	
	
	
	
	
	}

}
