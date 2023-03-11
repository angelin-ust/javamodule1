package day6;

public class Exceptionaldemo2 {

	public static void main(String[] args) {
	try {	
		System.out.println("pgm start ");
		int b=Integer.parseInt(args[0]);  // "10" "20"//run cheyune configuration edathu arg ill value kodukum
		int a=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println(c);
        int data[]= {a,b};
	}catch(ArrayIndexOutOfBoundsException e) //we put args[2] error occurs
	{
		e.printStackTrace();
	}
	catch(NumberFormatException e) //inside run config args "ten" error occurs
	{
		e.printStackTrace();
	}
	
	System.out.println("pgm  completed");
	}

}
