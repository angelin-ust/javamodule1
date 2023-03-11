package TesLamda;
@FunctionalInterface
public interface TestInterface {

	public double method();
	public default void methods2() //interface default method define and static only
	{
		System.out.println("from method2");
	}
	
	public static void methods3()
	{
		System.out.println("from static method");
	}
}
