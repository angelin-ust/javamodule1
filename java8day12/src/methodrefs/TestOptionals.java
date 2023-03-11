package methodrefs;

import java.util.Optional;

public class TestOptionals {

	public static void main(String[] args) {
		
//optional is connected to null 
		//why do we test for null becoz we get a null pter exceptions
		String str=null;
		String str1="hello";
		//Optional<String> optional=Optional.of(str);//of is used for not null thats y when we get()
		//we get exceptions
		//System.out.println(optional.get());
		
		//Optional<String> optional2=Optional.ofNullable(str);
	//	System.out.println(optional2.get());//exception
	/*
	 * Optional<String> optional2=Optional.ofNullable(str); if(optional2.isEmpty())
	 * System.out.println("value not present"+ optional2.get()); else
	 * System.out.println("present"+ optional2.get()); here we get noelement value
	 */
		
		Optional<String> optional3=Optional.ofNullable(str1);
		if(optional3.isPresent())
			System.out.println(" present" + str1);
		else
			//System.out.println("not present");
		System.out.println("is null" + optional3.orElse("str not initialised"));
	}

}
