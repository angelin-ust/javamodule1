package lsp;

public class LSPdemo {

	
	public void calculateArea(Shape s) {
		System.out.println(s.getArea());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LSPdemo lsp=new LSPdemo();
      lsp.calculateArea(new Rectangle(1,4));
      lsp.calculateArea(new Square(4));
	}

}
