package oopsday3.atm.menu;
import oopsday3.atm.extension.InsufficientFundsException;
import oopsday3.atm.extension.NegativeAmountException;
public interface BankingIrface2 {
	public double withdraw(double amount,int acctno) throws InsufficientFundsException;
	public double desposit(double amount,int acctno) throws NegativeAmountException ;//throws NegativeAmountException;;
	public double balanace(int actno);


}
