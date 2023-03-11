package oopsday4.statictest;

public class StaticDemo2 {
	static int a;
	int b;
public static void method() {
	//System.out.println("from method" + b);//not possible y becoz the b is non static method is static 
	//static method anne static instance aaa posiible
	a=89;
	System.out.println("from method" + a);
	//method is static and variable static is posible
}
public void method2() {
	System.out.println(a);//method2 non static and a is static aa ath possibleaa
	method();
	//here its possible method2  non static but method1 static ath means non static method
	//static method call cheyane pattumm but vice verse not posssibel
}
}
