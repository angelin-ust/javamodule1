package TesLamda;

public class Example1 {

	@FunctionalInterface
	interface Shape{
		double area();//one method its called functional interface
		//double perimeter();//is an error only one abstract method is possiblee if we
		//we didnt put @functionalInterface compile cheyumpol error avum ethu put cheyumpol
		//before ee perimeter declare cheyumpol shape avide error verumm
	}
	
	interface Math{
		double power(int b,int e);
	}
	
	interface Factorial{
		int fact(int n);
	}
	public static void main(String[] args) {
		
		int a=10;
Runnable r1=new Runnable() {
	public void run() {
		System.out.println("from run method");
	}
};
 Thread t1=new Thread(r1);
 t1.start();
		
		
		
		Runnable r=()->{
			for(int i=1;i<5;i++) {
				System.out.println("run method"+ i + a);
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		Shape s=()->{ return 0.0;};
		Math m=(int b,int e)->{
			int p=1;
			for(int i=1;i<=e;i++) {
				p*=b;
			}
			return p;
		};
		
		
		Factorial f=(int n)->{
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
				
			}
			return fact;
		};
		double result=s.area();
		System.out.println(result);
		double result1=m.power(2, 3);
		System.out.println(result1);
		int result2=f.fact(5);
		System.out.println(result2);
		
	}

}
