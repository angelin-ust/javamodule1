package TestException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TellerTest {
	Teller teller=new Teller();
	@Test(expected = InvalidTrascationAmountException.class)
	public void testValidateNegativeAmount()
	{
		Teller.validateTransaction("EUR", -100);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testValidateUnAcceptedCurrency()
	{
		Teller.validateTransaction("AUSD", 100);
	}
	

	
	
	
//
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
