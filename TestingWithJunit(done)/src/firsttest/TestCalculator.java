package firsttest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator extends Calculator {

	
	Calculator calc=new Calculator();
	
	@Test
	public void testPowerZero() {
//		int inputBase=0;
//				int exp=0;
				double expectedValue=1;
				double actualValue=calc.power(0,0);
//				System.out.println(actualValue);
				assertTrue(expectedValue==actualValue);
				
		//fail("Not yet implemented");
	}
	@Test
	public void testPower() {
		int inputBase=2;
				int exp=3;
				double expectedValue=8;
				double actualValue=calc.power(inputBase,exp);
//				System.out.println(actualValue);
				assertTrue(expectedValue==actualValue);
				
		//fail("Not yet implemented");
	}

}
