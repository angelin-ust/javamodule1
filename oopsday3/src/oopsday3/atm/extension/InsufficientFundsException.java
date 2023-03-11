package oopsday3.atm.extension;

public class InsufficientFundsException  extends Exception{
	
	
	
public InsufficientFundsException(String msg) {
	super(msg);
}
public InsufficientFundsException() {
}
@Override
public String getMessage() {
	return super.getMessage();
}

}
