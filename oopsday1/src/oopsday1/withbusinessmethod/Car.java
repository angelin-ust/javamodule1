package oopsday1.withbusinessmethod;

public class Car {
	public Car(String colour, double price, String brand, String model) {
		super();
		this.colour = colour;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	//properties
	private String  colour ;
	private double price;
	private String brand;
	private String model;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void start() {
	System.out.println("Car is starting......");
}
	public void changeGear(int gear) {
		System.out.println("Car is in gear "+ gear);
	}
	public void stop() {
		System.out.println("Car is stopping......");
	}
	@Override
	public String toString() {
		return "I'm a "+ brand ;

	}
	
	


}