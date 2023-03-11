package oopsday1.setget;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car  jaq =new Car();
		jaq.setColor("blue");
		jaq.setBrand("jaquar");
		jaq.setModel("sedan");
		jaq.setPrice(100000000);
		System.out.println(jaq.getBrand());
		System.out.println(jaq.getColor());
		System.out.println(jaq.getModel());
		System.out.println(jaq.getPrice());
		
		// TODO Auto-generated method stub
		/*Car jack = new Car();
		jack.color="Blue";
		jack.price=1000000;
		jack.brand="suzuki";
		jack.model="brezza";
		
		System.out.println(jack.color);
		System.out.println(jack.brand);
		System.out.println(jack.model);
		System.out.println(jack.price);
		
		
		Car bmw=new Car();
		bmw.color="black";
		bmw.price=6500000;
		bmw.brand="BMW";
		bmw.model="luxury SUV";
		
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		
		bmw=jaq;
		
		*/

	}

}
