package oopsday4.polymorphism;

public class Square extends Shape {

double side;

public double getSide() {
	return side;
}

public Square(double side) {
	super();
	this.side = side;
}

public void setSide(double side) {
	this.side = side;
}

public double area() {
	return side*side;
	
}
}
