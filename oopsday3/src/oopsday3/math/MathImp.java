package oopsday3.math;

public class MathImp implements MathIface {
	
   public MathImp() {
	   
   }
	
	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int rem(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	@Override
	public void prime(int n) {
		int flag=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println(n+"is prime");
		}
		else
			System.out.println(n+"is not prime");
	}

	

	

	public void oddeven(int n) {
		if(n%2==0)
		{
			System.out.println(n+ "is even");
		}
		else
			System.out.println(n+ "is odd");
	}

	@Override
	public void rev(int n) {
		System.out.println("the before reverse of no is" + n);
	    int d=0,sum=0;
	    while(n>0)
	    {
	    	 d=n%10;
	    	
	    	sum=(sum*10)+d;
	    	
	    	n=n/10;
	    }
	    System.out.println("after reverse is"+sum);
		
	}

	@Override
	public int factorial(int n) {
		int fact=1;
		   for(int i=1;i<=n;i++)
		   {
			   fact=fact*n;
		   }
		return fact;
	}

	@Override
	public void posneg(int n) {
		if(n>0)
		{
			System.out.println(n+"is positive");
		}
		else
			System.out.println(n+"is neg");
		
	}

}