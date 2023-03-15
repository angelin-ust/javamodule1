package paramList;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith (Parameterized.class)
public class PrimeNumberTest {
private final Integer inputNumber;
private final Boolean exceptedResult;
private PrimeNumber primeNumber;
	@Before
	public void initialize() {
		primeNumber=new PrimeNumber();
	} //this object has to be created every time
public PrimeNumberTest(Integer inputNumber, Boolean exceptedResult) {
	super();
	this.inputNumber = inputNumber;
	this.exceptedResult = exceptedResult;
}

@Parameterized.Parameters
public static Collection primeNumber() {
	return Arrays.asList(new Object[][]
			{
		
		{2,true},
		{6,false},
		{19,true},
		{22,false},
		{23,true},
		{24,false}
		//{10,true} the condition is false so and failure occurs
		
			}
			
			
			);
}


public PrimeNumber getPrimeNumber() {
	return primeNumber;
}

@Test
public void testValidator() {
	System.out.println("Parameterized number is" + inputNumber);
	assertEquals(exceptedResult,primeNumber.validate(inputNumber));
}

}	




