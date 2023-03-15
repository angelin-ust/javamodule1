package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator extends Calculator {

	
	//Calculator calc=new Calculator();  the first way we did like
	Calculator calc;
	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}
	@Test  //used as
	public void testPowerZero() {
//		int inputBase=0;
//				int exp=0;
				int expectedValue=1;
				int actualValue=calc.power(0,0);
//				
				assertTrue(expectedValue==actualValue);
				
		//fail("Not yet implemented");
	}
//	@Test
//	public void testPower() {
//		int inputBase=2;
//				int exp=3;
//				int expectedValue=8;
//				int actualValue=calc.power(inputBase,exp);
////				System.out.println(actualValue);
//				assertTrue(expectedValue==actualValue);
//				
//		//fail("Not yet implemented");
//	}
	
	@Test
	public void testfact() {
		int inputBase=5;
				
				int expectedValue=120;
				int actualValue=calc.fact(inputBase);
//				System.out.println(actualValue);
				assertTrue(expectedValue==actualValue);
				
		//fail("Not yet implemented");
	}

	@Test
	public void testodd() {
		int inputBase=5;
				
				boolean expectedValue=true;
				boolean actualValue=calc.odd(inputBase);
//				System.out.println(actualValue);
				assertTrue(expectedValue==actualValue);
				
		//fail("Not yet implemented");
	}

}
