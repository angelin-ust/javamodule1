package TestException;

public class InvalidTrascationAmountException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4158681317249742499L;
	
	public InvalidTrascationAmountException 
	(String message)
	{
		super(message);
	}
}
