package oopsday3.lines;

public abstract class Function implements Display {
 private int x;
 private int y;
 
	public Function(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

	public void linedraw(int x, int y) {
	for(int i=x;i<=y;i++)
		{System.out.print(".");}
	}

}
