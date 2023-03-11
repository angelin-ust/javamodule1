package oopsday4.statictest;

public class TestStaticDemo2 {
	public static void main(String[] args) {
		StaticDemo2 d1=new StaticDemo2();
//		StaticDemo2 d2=new StaticDemo2();
		System.out.println(d1.a);
//		System.out.println(d2.a);
		d1.method();
	     StaticDemo2.method();
	     System.out.println(Math.PI);
	}

}
