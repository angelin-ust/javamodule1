package multiThread;

public class TestRunable {

	public static void main(String[] args) {
		System.out.println("main started");
		System.out.println("Main priority =" + Thread.currentThread().getPriority());
	MyRunable runnable=new MyRunable();
	Thread t1=new Thread(runnable);
	Thread t2=new Thread(runnable);
	t1.setDaemon(true);
	t2.setDaemon(true);
	t1.start();
	t2.start();
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	System.out.println("T1=" + t1.getPriority());
	System.out.println("T2=" + t2.getPriority());
	System.out.println("main exited ");
	}

}
