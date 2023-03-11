package oopsday4.polymorphism;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s=new Rectangle(2.3,4.5);
Shape s1=new Square(3);

Shape s2=new Circle(4);

System.out.println("area of rectangle"+s.area());
System.out.println("area of Square"+s1.area());
System.out.println("area of Circle"+s2.area());
	}

}
