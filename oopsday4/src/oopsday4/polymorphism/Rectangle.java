package oopsday4.polymorphism;

public class Rectangle extends Shape{
	double len;
	double breadth;
	public double getLen() {
		return len;
	}
	public void setLen(double len) {
		this.len = len;
	}
	public double getBreadth() {
		return breadth;
	}
	public Rectangle(double len, double breadth) {
		super();
		this.len = len;
		this.breadth = breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
public double area() {
	return len *breadth;
	
}
}
