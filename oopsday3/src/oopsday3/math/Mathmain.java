package oopsday3.math;

public class Mathmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathImp mat=new MathImp();
		System.out.println("Addition of two no" +mat.add(25, 25));
		System.out.println("Sub of two no" +mat.sub(25, 25));
		System.out.println("mult of two no" +mat.mul(25, 25));
		System.out.println("div of two no" +mat.div(25, 25));
		System.out.println("fact of no" +mat.factorial(5));
		System.out.println("rem of two no" +mat.rem(25, 25));
		 mat.prime(25);
		mat.rev(234);
		mat.oddeven(9);
		mat.posneg(-9);
		
		
	}

}
