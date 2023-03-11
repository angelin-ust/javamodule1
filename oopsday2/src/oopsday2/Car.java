package oopsday2;

public class Car implements CarIface {
	private double fuel;
	private double battery;
	private double kilmeterRun;
	private boolean engineStatus;
	
	

	@Override
	public void start() {
		if(engineStatus==false && fuel>1000 && battery>100)
		System.out.println("engine starting");
		// TODO Auto-generated method stub
         engineStatus=true;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public double getKilmeterRun() {
		return kilmeterRun;
	}

	public void setKilmeterRun(double kilmeterRun) {
		this.kilmeterRun = kilmeterRun;
	}

	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public Car(double fuel, double battery, double kilmeterRun, boolean engineStatus) {
//		super();
		this.fuel = fuel;
		this.battery = battery;
		this.kilmeterRun = kilmeterRun;
		this.engineStatus = engineStatus;
	}


	@Override
	public void honk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		if(engineStatus) {
			for(int i=0;i<50;i++) {
				System.out.println("car is moving");
				fuel=fuel-10;
				battery=battery-2;
				kilmeterRun++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilmeterRun=" + kilmeterRun + ", engineStatus="
				+ engineStatus + "]";
	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("car is stopping....");
		this.engineStatus=false;
		// TODO Auto-generated method stub

	}

}
