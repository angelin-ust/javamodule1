package lsp;

public class Square implements Shape {
 
	
	
	private int side;

	public int getArea() {
		return this.side * this.side;
	}

	

	public void setSide(int side) {
		this.side = side;
	}

	public Square(int side) {
		super();
		this.side = side;
	}
	
	
	
}
