package day6;

public class Exceptionday4 {

	public static void main(String[] args) {
		System.out.println("pgm startsed task");
		try {
			System.out.println("enter try");
			int c=8/0;
		System.out.println(c);
			System.out.println("from try after exception" );
		}
		
		catch(Exception e) {
			//System.out.println("from catch");
		}
		/*
		 * catch(ArithmeticException e) {
		 * 
		 * } here if we put error occurs there is an order
		 */
		finally {
			System.out.println("from finally");
		}
System.out.println("pgm completed task");
	}

}
