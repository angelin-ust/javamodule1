package lsp;

public class Rectangle implements Shape {

	@Override
	public int getArea() {
		return this.length* this.breadth;
	}

	
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
}
