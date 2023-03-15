package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOdd {
	static	Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new  Calculator();
		System.out.println("before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all test case");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before eact test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@Test
	public void testOdd() {
		int inputBase=5;
		
		boolean expectedValue=true;
		boolean actualValue=calc.odd(inputBase);
//		System.out.println(actualValue);
		assertTrue(expectedValue==actualValue);
		
	}

}
