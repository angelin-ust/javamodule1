package oopsday2.Shape;

public class Square implements Area {
	private double l;
	private double b;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	System.out.println("Area of Square");
	System.out.println(l*b);
		

	}
	public Square(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	public double getL() {
		return l;
	}
	@Override
	public String toString() {
		return "Square [l=" + l + ", b=" + b + "]";
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}

}
