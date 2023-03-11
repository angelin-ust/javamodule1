package oopsday1.withbusinessmethod;
public class Carfactory {

	public static void main(String[] args) {
		
		Car jaq = new Car("blue",600000,"xuv","x3");
		jaq.start();
		jaq.changeGear(1);
		jaq.changeGear(2);
		jaq.changeGear(3);
		jaq.changeGear(4);
		jaq.stop();
		Car bmw = new Car("black",9000000,"sedan","x3");
		bmw.start();
		 bmw.changeGear(1);
		bmw.stop();
 		 
		
        
	}

}
