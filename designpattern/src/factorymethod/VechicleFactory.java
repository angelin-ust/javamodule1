package factorymethod;

public class VechicleFactory {

	public static Vechicle newInstance (String car) {
		// TODO Auto-generated method stub
 Vechicle vechicle=null;
  if(car==null)
	  return null;
  else if(car.equals("Seltos"))
	  vechicle= new Seltos();
  else if(car.equals("XCross"))
	  vechicle= new XCross();
  
  
  return vechicle;
	}

}
