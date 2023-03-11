package oopsday4.polymorphism;

public class Circle extends Shape {
double radius;

public double getRadius() {
	return radius;
}

public Circle(double radius) {
	super();
	this.radius = radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}
public double area() {
	return Math.PI * radius* radius ;
	
}
}
