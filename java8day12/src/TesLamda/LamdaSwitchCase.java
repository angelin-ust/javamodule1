package TesLamda
;

public class LamdaSwitchCase {

	static double calculate(String operator,double x,double y)
	{
	return switch (operator)
			{
	case"+" -> x+y;
	case"-" -> x-y;
	case"*" ->x*y;
	case "/" ->{
		if(y==0) {
			throw new IllegalArgumentException("Cant be divided");
		}
		yield x/y;
	}
	default -> throw new IllegalArgumentException("Unexpected value: " + operator);
					};
				
}
	public static void main(String args[])
	{ LamdaSwitchCase c=new  LamdaSwitchCase();
		
	System.out.println(c.calculate("+",2.0,3)); 
	System.out.println(c.calculate("-",2.0,3));
	System.out.println(c.calculate("*",2.0,3));
	System.out.println(c.calculate("/",2.0,3));
	
	}
}
