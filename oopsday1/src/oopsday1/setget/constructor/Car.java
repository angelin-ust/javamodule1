package oopsday1.setget.constructor;

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
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return "I'm a "+ brand ;

	}
	
	


}
