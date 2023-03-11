package multiThread;

public class MyThread extends Thread {

	private String name;
	public MyThread(String name) {
		this.name=name;
	}
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
public void run()//this for entry point for child thread
{
	for(int i=1;i<600;i++) {
		System.out.println(name+ "=" + i);
	}
}
	
	
	
	
	
}
