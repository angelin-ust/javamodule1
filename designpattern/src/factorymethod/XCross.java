package factorymethod;

public class XCross implements Vechicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		   System.out.println("started......"+ getClass());

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		 System.out.println("Stopped......"+getClass());
	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("Palm Palm......"+getClass());
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("its moving....."+getClass());
	}

}
