package oopsday1.setget.constructor;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jaq = new Car("blue",600000,"xuv","x3");
		System.out.println(jaq);
		System.out.println(jaq.hashCode());
        System.out.println(Integer.toHexString(jaq.hashCode()));
 		 
		
         
	}

}