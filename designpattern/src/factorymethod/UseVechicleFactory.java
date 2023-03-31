package factorymethod;

public class UseVechicleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vechicle seltos =VechicleFactory.newInstance("Seltos");
 seltos.honk();
 
 Vechicle XCross =VechicleFactory.newInstance("XCross");
 XCross.honk();
	}

}
