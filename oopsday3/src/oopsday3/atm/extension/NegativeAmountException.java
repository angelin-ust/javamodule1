package oopsday3.atm.extension;

public class NegativeAmountException extends Exception {
	public NegativeAmountException(String msg) {
		super(msg);
	}
	public NegativeAmountException() {
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
