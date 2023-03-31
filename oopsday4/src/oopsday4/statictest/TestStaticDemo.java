package oopsday4.statictest;

public class TestStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo.a);//0
		System.out.println(StaticDemo.a);//0
		StaticDemo d= new StaticDemo();//1
		System.out.println(d.a);
		StaticDemo d1= new StaticDemo();//2
		System.out.println(d1.a);
		StaticDemo d2= new StaticDemo();//3
//d.a=20;
//		
//		System.out.println(d.a);
//d.a++;
//System.out.println(d.a);
		//System.out.println(StaticDemo.b);
		
		
		System.out.println(d2.a);//3
		System.out.println(StaticDemo.a);//3

	}

}
