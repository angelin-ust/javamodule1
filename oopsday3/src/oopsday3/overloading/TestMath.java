package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		Math math=new Math();
		int result=math.add(10,20);
		System.out.println(result);
		
		
		result=math.add(10,20,30);
		System.out.println(result);

		
	double	result1=math.add(10.3,20.3,30.6);
		System.out.println(result1);

		result1=math.add(10L,20L,30L);
		/*
		 * long will go for widening type checks
		 *  which will help it either int or double
		 */
		System.out.println(result1);

	}

}
