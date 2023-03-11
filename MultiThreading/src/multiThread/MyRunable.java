package multiThread;
import java.util.Scanner;
public class MyRunable implements Runnable //by extending it will inherit by implemement we get 
//only the shades of thread
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			
			System.out.println("enter the i/p");
			int a=new Scanner(System.in).nextInt();
			System.out.println("got the input proceeding");
			System.out.println(Thread.currentThread().getName()+ "=" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
